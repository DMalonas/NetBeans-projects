/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprinter;

/**
 *
 * @author Dimitrios
 */
public class LineItem {
    private int quantity;
    private Product theProduct;
    
    /**
     * Constructs an item from the product and quantity
     * @param aProduct the product
     * @param aQuantity the item quantity
     */
    public LineItem(Product aProduct, int aQuantity)
    {
        theProduct = aProduct;
        quantity = aQuantity;
    }
    
    /**
     * Computes the total cost of this line item.
     * @return the total price
     */
    public double getTotalPrice()
    {
        return theProduct.getPrice() * quantity;
    }
    /**
     * Formats this item.
     * @return a formatted string of this line item
     */
    public String.format("%-30s%8.2f%5d%8.2f",theProduct.getDescription(),theProduct.getPrice(),quantity,getTotalPrice());

    String format() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
}