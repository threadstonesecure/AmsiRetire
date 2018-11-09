package cloud.data.integration.module.journal.exception;

/**
 * 
 * @author LBerwa
 *
 */
public class JournalImportException extends Exception {

	public JournalImportException(String message) {
		super(message);
	}
	
	public JournalImportException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public JournalImportException(Throwable cause) {
        super(cause);
    }
	
}
