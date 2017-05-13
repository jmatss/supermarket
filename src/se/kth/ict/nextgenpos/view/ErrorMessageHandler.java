package se.kth.ict.nextgenpos.view;

/**
 * Creates and prints all error messages to the view.
 */
class ErrorMessageHandler {
    
    /**
     * Prints the error message.
     * @param msg The specified error message
     */
    void printErrorMessage (String msg) {
        StringBuilder msgSB = new StringBuilder();
        msgSB.append("Error Message: ");
        msgSB.append(msg);
        System.out.println(msgSB);
    }
}
