
package atmcasestudy;



public class Screen {
    
    public void displayMessage( String message )
    {
        System.out.print( message );
    }
    
    public void displayMessageLine( String message )
    {
        System.out.println(message);
    }
    
    public void displayDollarAmmount( double amount )
    {
        System.out.printf("$%,.2f",amount);
    }
}
