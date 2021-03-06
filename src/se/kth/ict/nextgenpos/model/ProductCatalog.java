package se.kth.ict.nextgenpos.model;

import java.util.Map;
import java.util.HashMap;
import se.kth.ict.nextgenpos.exceptions.*;

/**
 * This class is responsible for all access to the product database.
 */ 
public class ProductCatalog { 
    private Map<Integer, ProductSpecification> products = 
	new HashMap<Integer, ProductSpecification>();
    private static final ProductCatalog PRODUCT_CATALOG = new ProductCatalog();

    /**
     * Fills the catalog with some dummy items.
     */
    private ProductCatalog() {
	products.put(1, new ProductSpecification(1, "low fat milk", 
	   "a very long description, a very long description, a very long description", 10));
	products.put(2, new ProductSpecification(2, "butter", 
	   "a very long description, a very long description, a very long description", 10));
	products.put(3, new ProductSpecification(3, "bread", 
	   "a very long description, a very long description, a very long description", 10));
    }
    
    /**
     * @return the only instance of ProductCatalog
     */
    public static ProductCatalog getProductCatalog () {
        return PRODUCT_CATALOG;
    }

    /**
     * Search for an item in the product catalog.
     *
     * @param    itemId The item to look for
     * @return          The specification for the found item or null if no item was found.
     * @throws  ItemNotFoundException if the item corresponding to the specified itemId doesn't exist
     */
    public ProductSpecification findSpecification(int itemId) {
        ProductSpecification product = products.get(itemId);
        
        if (product == null) {
	    throw new ItemNotFoundException("No item with id " + itemId + " found.", itemId);
        }
        return product;
    }
}
