package cloud.data.integration.common.util;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;

import cloud.data.integration.module.journal.util.JournalUtil;



/**
 * 
 * @author sthota
 *
 */
public class MailManager {
	
	
	final static Logger logger = Logger.getLogger(MailManager.class);
	

	
//	public static void main(String args[]) {
//		MailManager mail = new MailManager();
//		mail.sendMailWithAttachment("rocknaga81@gmail.com", "nagaraju.chidarla@gmail.com", "Hello", "Hello Scott.....Test Message......Coming from the integration app....", "E:\\shelby\\shelby_files\\FaMassAdditions.csv");
//	}

	public static void sendMail(String from, String to, String subject, String appMessage) {
		// Get system properties
	      Properties properties = System.getProperties();
	      properties.setProperty("mail.smtp.host", JournalUtil.getPropertyValue("MAIL_HOST_NAME"));
	      //properties.setProperty("mail.smtp.password", "lnb@broomfield");
	      properties.put("mail.smtp.auth", JournalUtil.getPropertyValue("MAIL_SMTP_AUTH"));
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.port", JournalUtil.getPropertyValue("MAIL_HOST_PORT"));
	      //properties.put("mail.debug", "true");
	      //properties.setProperty("mail.smtp.password", MAIL_HOST_PASSWORD);
	    
	      // Get the default Session object.
	      //Session session = Session.getDefaultInstance(properties);
	       
	      Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(JournalUtil.getPropertyValue("MAIL_USER_NAME"), 
							JournalUtil.getPropertyValue("MAIL_USER_PASSWORD"));
				}
			  });
	     
	      try {
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(from));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         message.setSubject(subject);
	         message.setText(appMessage);
	         
	         Transport.send(message);
	         logger.debug("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
	
	public static void sendMailWithAttachment(String from, String to, String subject, String appMessage, String fileName) {
		// Get system properties
	      Properties properties = System.getProperties();
	     
	      properties.put("mail.smtp.protocol", "smtp");
	     //  properties.put("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
	      properties.put("mail.smtp.auth", "true");
	      // properties.put("mail.smtp.ssl.trust", "*");
	      //properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.host", JournalUtil.getPropertyValue("MAIL_HOST_NAME"));
	      properties.put("mail.smtp.port", JournalUtil.getPropertyValue("MAIL_HOST_PORT"));
	      //properties.put("mail.smtp.auth", JournalUtil.getPropertyValue("MAIL_SMTP_AUTH"));
	      properties.put("mail.debug", "true");
	      
	      //properties.put("mail.debug", "true");
	      //properties.setProperty("mail.smtp.password", MAIL_HOST_PASSWORD);
	    
	      // Get the default Session object.
	      //Session session = Session.getDefaultInstance(properties);
	       
	      Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(JournalUtil.getPropertyValue("MAIL_USER_NAME"), 
							JournalUtil.getPropertyValue("MAIL_USER_PASSWORD"));
				}
			  });
	     
	      try {
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(from));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         message.setSubject(subject);
	        
	         BodyPart messageBodyPart = new MimeBodyPart();
	         messageBodyPart.setText(appMessage);
	         Multipart multipart = new MimeMultipart();
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         File  fileStream =  new File(fileName);
	         DataSource source = new FileDataSource(fileStream);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(fileStream.getName());
	         multipart.addBodyPart(messageBodyPart);
	         // Send the complete message parts
	         message.setContent(multipart);
	         
	         Transport.send(message);
	         logger.debug("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
	
}
