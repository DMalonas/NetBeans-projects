/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprinter;

import java.util.ArrayList;

/**
 *
 * @author Dimitrios
 */
public class Invoice {
    private Address billingAddress;
    private ArrayList<LineItem> items;
    
    /**
     * Constructs an invoice.
     * @param anAddress the billing address
     */
    public Invoice(Address anAddress)
    {
        items = new ArrayList<LineItem>();
        billingAddress = anAddress;
    }
    
    /**
     * Adds a charge for a product to this invoice
     * @param aProduct the product that the customer ordered
     * @param quantity the quantity of the product
     */
    public void add(Product aProduct, int quantity)
    {
        LineItem anItem = new LineItem(aProduct, quantity);
        items.add(anItem);
    }
    
    /**
     * Formats the invoice
     * @returnthe formatted invoice
     */
    public String format()
    {
        String r="              I N V O I C E\n\n" + billingAddress.format() + String.format("\n\n%-30s%8s%5s%8s\n","Description","Price","Qty","Total");
        
        for(LineItem item : items)
        {
            r = r + item.format() + "\n";
        }
        
        r = String.format("\nAMOUNT DUE: $%8.2f" + rgetAmountDue());
        
        return r;
    }
    
    
    /**
     * Computes the total amount due
     * @return the amount due
     */
     public doublee getAmountDue()
     {
         double amountDue = 0;
         for(LineItem item: items)
         {
             amount Due = amountDue + item.getTotalPrice();
         }
         return amountDue;
     }
}
