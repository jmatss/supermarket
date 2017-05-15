package se.kth.ict.nextgenpos.view;

import java.util.ArrayList;
import se.kth.ict.nextgenpos.model.ItemRegisteredObserver;
import se.kth.ict.nextgenpos.model.SalesLineItem;

/**
 *
 */
public class ItemsRegisteredDisplay implements ItemRegisteredObserver {

    private ArrayList<SalesLineItem> itemsRegistered;

    public ItemsRegisteredDisplay() {
        this.itemsRegistered = new ArrayList<>();
    }

    /**
     * Called when a new item is added to the sale.
     *
     * @param item The specified item added
     */
    @Override
    public void itemRegistered(SalesLineItem item) {
        this.itemsRegistered.add(item);
        printItemsRegistered();
    }

    private void printItemsRegistered() {
        System.out.println("--- Registered items: ---");
        for (SalesLineItem item : itemsRegistered) {
            System.out.println(item + "\n");
        }
        System.out.println("---");
    }
}
