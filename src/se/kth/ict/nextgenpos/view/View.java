package se.kth.ict.nextgenpos.view;

import se.kth.ict.nextgenpos.controller.Controller;
import se.kth.ict.nextgenpos.exceptions.*;
import se.kth.ict.nextgenpos.model.ProductSpecification;
import java.util.ArrayList;
import se.kth.ict.nextgenpos.model.ItemRegisteredObserver;
import se.kth.ict.nextgenpos.model.SalesLineItem;

/**
 * A placeholder for the view.
 */
public class View implements ItemRegisteredObserver{
    private Controller cont;
    private ErrorMessageHandler errorMessageHandler;
    private ArrayList<SalesLineItem> itemsRegistered;

    /**
     * Creates a new <code>View</code>.
     * @param cont  The controller of the application.
     */
    public View(Controller cont) {
	this.cont = cont;
        this.errorMessageHandler = new ErrorMessageHandler();
        this.itemsRegistered = new ArrayList<>();
    }
    
    /**
     * Called when a new item is added to the sale.
     * @param item The specified item added
     */
    @Override
    public void itemRegistered(SalesLineItem item) {
        this.itemsRegistered.add(item);
        printItemsRegistered();
    }

    /**
     * Simulates a view. Makes some calls to the controller.
     */
    public void test() {
        cont.addItemRegisteredObserver(this);
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
    
    private void printItemsRegistered () {
        System.out.println("--- Registered items: ---");
        for (SalesLineItem item : itemsRegistered) {
            System.out.println(item + "\n");
        }
        System.out.println("---");
    }
}
