
package bankserver;

/**
 *
 * @author Dimitrios
 */
public class Bank {

    private BankAccount[] accounts; 
    
    /**
     * constructs a bank account with a given number of accounts.
     * @param size the number of accounts
     */
    public Bank(int size)
    {
        accounts = new BankAccount[size];
        for(int i =0; i<accounts.length; i++)
            accounts[i]=new BankAccount();
    }
    public void deposit(int accountNumber, double amount)
    {
        BankAccount account = accounts[accountNumber];
        account.deposit(amount);
    }
    
    public void withdraw(int accountNumber, double amount)
    {
        BankAccount account = accounts[accountNumber];
        account.withdraw(amount);
    }
    
    public double getBalance(int accountNumber)
    {
        BankAccount account = accounts[accountNumber];
        return account.getBalance();
    }
}
