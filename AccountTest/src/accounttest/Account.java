
package accounttest;


public class Account 
{
    private double balance; 
    
    //constructor
    public Account( double initialBalance )
    {
        if( initialBalance > 0.0 )
            balance = initialBalance;
    }
    
    
    //credit an amount to the account 
    public void credit( double amount )
    {
        balance += amount;
    }
    
    
    //return the account balance
    public double getBalance()
    {
        return balance; 
    }
}
