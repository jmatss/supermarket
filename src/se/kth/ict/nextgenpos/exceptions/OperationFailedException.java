package se.kth.ict.nextgenpos.exceptions;

/**
 * Used when throwing exceptions to view.
 */
public class OperationFailedException extends RuntimeException {
    
    public OperationFailedException(String msg, Exception cause) {
        super(msg, cause);
    }
}
