package se.kth.ict.nextgenpos.view;

import se.kth.ict.nextgenpos.controller.Controller;
import se.kth.ict.nextgenpos.exceptions.*;

/**
 * A placeholder for the view.
 */
public class View {
    private Controller cont;
    private ErrorMessageHandler errorMessageHandler;

    /**
     * Creates a new <code>View</code>.
     * @param cont           The controller of the application.
     */
    public View(Controller cont) {
	this.cont = cont;
        this.errorMessageHandler = new ErrorMessageHandler();
    }

    /**
     * Simulates a view. Makes some calls to the controller.
     */
    public void test() {
	cont.makeNewSale();
	enterItem(1);
	enterItem(10);
    }

    private void enterItem(int itemId){
        try {
            int quantity = 1;
            System.out.println("");
            System.out.println("Result for item " + itemId + ": " + cont.enterItem(itemId, quantity));
            System.out.println("");
        } catch (OperationFailedException e) {
            this.errorMessageHandler.printErrorMessage(e.getMessage());
        }
    }
}
