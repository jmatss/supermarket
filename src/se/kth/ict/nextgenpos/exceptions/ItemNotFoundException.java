package se.kth.ict.nextgenpos.exceptions;

/**
 * Exception thrown when the specified item can't be found.
 */
public class ItemNotFoundException extends RuntimeException {
    private int itemId;
    
    public ItemNotFoundException (String msg, int itemId) {
        super(msg);
        this.itemId = itemId;
    }
    
    /**
     * @return The itemId for the item that couldn't be found.
     */
    public int getItemId () {
        return this.itemId;
    }
}