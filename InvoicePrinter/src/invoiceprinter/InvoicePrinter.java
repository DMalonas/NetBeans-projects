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
public class InvoicePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address samsAddress = new Address("Sam's Small Appliances","100 Main Street","CA","98765");
    
        
    Invoice samsInvoice = new Invoice(samsAddress);
    samsInvoice.add(new Product("Toaster",29.95),3);
    samsInvoice.add(new Product("Hair dryer",24.95),1);
    samsInvoice.add(new Product("Car vacuum",19.99),2);
    
    System.out.println(samsInvoice.format());
    }
}
