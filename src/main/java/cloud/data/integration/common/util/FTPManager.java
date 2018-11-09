/**
 * 
 */
package cloud.data.integration.common.util;

import java.io.File;
import java.nio.file.FileSystems;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.Selectors;
import org.apache.commons.vfs2.impl.StandardFileSystemManager;
import org.apache.commons.vfs2.provider.ftps.FtpsFileSystemConfigBuilder;
import org.apache.log4j.Logger;

import cloud.data.integration.module.journal.exception.JournalImportException;
import cloud.data.integration.module.journal.service.JournalImportService;
import cloud.data.integration.module.journal.util.JournalUtil;


/**
 * @author SBalawatri
 *
 */
public class FTPManager {
	
	final static Logger logger = Logger.getLogger(FTPManager.class);
	/**
	 * This method downloads a source file from the secure FTP server and then
	 * stores it in the source folder locally.
	 * @param remoteSourceDirectory TODO
	 * @param localSourceDirectory TODO
	 * @throws JournalImportException 
	 * @throws FileSystemException
	 */
	
	public static void downloadSourceFileFromSFTPServer(String remoteSourceDirectory, String localSourceDirectory) throws JournalImportException {
		
		String serverAddress = CommonMethods.getPropertyValue("FUSION_SFTP_SERVER_ADDRESS").trim();
		String userId = CommonMethods.getPropertyValue("FUSION_SFTP_SERVER_USER_NAME").trim();
		String password = CommonMethods.getPropertyValue("FUSION_SFTP_SERVER_USER_PASSWORD").trim();
		
		String remoteDirectory = remoteSourceDirectory;
		String localDirectory = localSourceDirectory;		
		//String remoteDirectory = CommonMethods.getPropertyValue("JOURNAL_SFTP_SERVER_REMOTE_SOURCE_DIRECTORY").trim();
		//String localDirectory = CommonMethods.getPropertyValue("JOURNAL_SOURCE_FILE_PATH").trim();
		String remoteProcessedDirectory = JournalUtil.getPropertyValue("JOURNAL_SFTP_SERVER_REMOTE_PROCESSED_DIRECTORY").trim();
		StandardFileSystemManager manager = new StandardFileSystemManager();
		try {
			manager.init();
			FileSystemOptions fileSystemOptions = new FileSystemOptions();
			FtpsFileSystemConfigBuilder.getInstance().setUserDirIsRoot(fileSystemOptions, true);
			FtpsFileSystemConfigBuilder.getInstance().setPassiveMode(fileSystemOptions, true);
			FtpsFileSystemConfigBuilder.getInstance().setConnectTimeout(fileSystemOptions, 10000);
			//String sftpUri = "sftp://" + userId + ":" + password +  "@" + serverAddress + "/" + remoteDirectory;
			String ftpUri = "ftps://" + userId + ":" + password +  "@" + serverAddress + "/" + remoteDirectory;
			logger.debug("Remote Server Url: " + ftpUri);
			FileObject remoteFile = manager.resolveFile(ftpUri.toString(), fileSystemOptions);
			FileObject [] children = remoteFile.getChildren();
			if(children.length == 0) {
	    		logger.debug("Source File does not exist on the FTP Server Source folder.");
				MailManager.sendMail(JournalUtil.getPropertyValue("MAIL_USER_FROM_ADDRESS"), 
								JournalUtil.getPropertyValue("MAIL_USER_TO_ADDRESS"), 
								"File Not Found On Remote Server", 
								"Source File does not exist on the FTP Server Source folder.");
	    		throw new JournalImportException("Source File does not exist on the FTP Server Source folder.");
	    	}
			for(FileObject remoteFileObject : children) {
				logger.debug("Remote File: " + remoteFileObject.getName());
				String filepath = localDirectory +  "/" + remoteFileObject.getName().getBaseName();
				logger.debug("Local File Path: " + filepath);
				File file = new File(filepath);
				FileObject localFile = manager.resolveFile(file.getAbsolutePath());
				localFile.copyFrom(remoteFileObject, Selectors.SELECT_SELF);
				logger.debug("File download successful");
				remoteFileObject.close();
				//remoteFileObject.
				
			}
			remoteFile.close();
			//manager.close();
		}catch(FileSystemException fse) {
			fse.printStackTrace();
			//throw new FileSystemException(fse.getMessage());
		}finally {
			   manager.close();
		  }
	}
	
	public static void deleteSourceFilesFromSFTPServer(String remoteSourceFilePath) {
		
		String serverAddress = JournalUtil.getPropertyValue("FUSION_SFTP_SERVER_ADDRESS").trim();
		String userId = JournalUtil.getPropertyValue("FUSION_SFTP_SERVER_USER_NAME").trim();
		String password = JournalUtil.getPropertyValue("FUSION_SFTP_SERVER_USER_PASSWORD").trim();
		
		String remoteDirectory = remoteSourceFilePath;
		//String remoteDirectory = CommonMethods.getPropertyValue("JOURNAL_SFTP_SERVER_REMOTE_SOURCE_DIRECTORY").trim();
		//String localDirectory = CommonMethods.getPropertyValue("JOURNAL_SOURCE_FILE_PATH").trim();
		String remoteProcessedDirectory = JournalUtil.getPropertyValue("JOURNAL_SFTP_SERVER_REMOTE_PROCESSED_DIRECTORY").trim();
		StandardFileSystemManager manager = new StandardFileSystemManager();
		try {
			manager.init();
			FileSystemOptions fileSystemOptions = new FileSystemOptions();
			FtpsFileSystemConfigBuilder.getInstance().setUserDirIsRoot(fileSystemOptions, true);
			FtpsFileSystemConfigBuilder.getInstance().setPassiveMode(fileSystemOptions, true);
			FtpsFileSystemConfigBuilder.getInstance().setConnectTimeout(fileSystemOptions, 10000);
			//String sftpUri = "sftp://" + userId + ":" + password +  "@" + serverAddress + "/" + remoteDirectory;
			String sftpUri = "ftps://" + userId + ":" + password +  "@" + serverAddress + "/" + remoteDirectory;
			logger.debug("Remote Server Url Source Direcetory: " + sftpUri);
			FileObject remoteFile = manager.resolveFile(sftpUri.toString(), fileSystemOptions);
			FileObject [] children = remoteFile.getChildren();
						
		String sftpUriProcessed = "ftps://" + userId + ":" + password +  "@" + serverAddress + "/" + remoteProcessedDirectory;
		//File remoteProcessedDir = new File(remoteProcessedDirectory);
		FileObject remoteProcessedDirectoryFO = manager.resolveFile(sftpUriProcessed.toString(), fileSystemOptions);
		
		for(FileObject fileObj : children) {
			fileObj.delete();
			//fileObj.moveTo(remoteProcessedDirectoryFO);
		}
		
		
		}catch(FileSystemException fse) {
			fse.printStackTrace();
			//throw new FileSystemException(fse.getMessage());
		}finally {
			   manager.close();
		}
	}

}
