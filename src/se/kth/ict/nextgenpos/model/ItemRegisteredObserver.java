package se.kth.ict.nextgenpos.model;

/**
 * Observes items being registered.
 */
public interface ItemRegisteredObserver {
    
    /**
     * Called when a new item have been added to the sale.
     * @param item The specified item added to the sale
     */
    void itemRegistered (SalesLineItem item);
}
