
package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimitrios
 * 
 * 
 * 
 * 
 * A Bank with multiple bank accounts
 */
public class Bank {

    /**
     * @param args the command line argument
     * 
     * 
     * 
     * Finds a customer with a given number and PIN.
     * @param customerNumber the customer number
     * @param pin the personal identification number
     * @return the matching customer, or null if none found
     */
    
    public static void main(String[] args) {
        
        public Customer findCustomer(int customerNumber, int pin)
                throws SQLException 
        {
            Connection conn = SimpleDataSource.getConnection();
            try
            {
                Customer c = null;
                PreparedStatement stat = conn.prepareStatement(""
                        + "SELECT * FROM BankCustomer WHERE Customer_Number = ?");
                stat.setInt(1, customerNumber);
                
                ResultSet result = stat.executeQuery();
                if(result.next() && ppin == result.getInt("PIN"))
                    c = new Customer(customerNumber, result.getInt("Checking_Account_Number"),
                    result.getInt("Savings_Account_Number"));
                return c;
            }
            finally
            {
                conn.close();
            }
        }
    }




class BankAccount
{
    private int accountNumber;
    
    /**
     * Constructs a bank account with a given balance.
     * @param anAccountNumber the account number
     */
    public BankAccount(int anAccountNumber)
    {
        accountNumber = anAccountNumber;
    }
    
    /**
     * Deposits money into a bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
            throws SQLException
    {
        Connection conn = SimpleDataSource.getConnection();
        try
        {
            PreparedStatement stat = conn.prepareStatement("UPDATE Account" 
                    +"SET Balance = Balance + ? "
            +" WHERE Account_Number = ?");
            stat.setDouble(1,amount);
            stat.setInt(2, accountNumber);
            stat.executeUpdate();
        }
        finally
        {
            conn.close();
        }
    }
    
    /**
     * Withdrwaws money from a bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
            throws SQLException
    {
        Connection conn = SimpleDataSource.getConnection();
        try
        {
            PreparedStatement stat = conn.prepareStatement("UPDATE Account"
                    +" SET Balance = Balance - ?"
                    +"WHERE Account_Number=?");
            stat.setDouble(1,amount);
            stat.setInt(2, accountNumber);
            stat.executeUpdate();
        }
        finally
        {
            conn.close();
        }
    }
    
    
    /**Gets the balance of a bank account.
     * @return the account balance
     */
    public double getBalance()
            throws SQLException
    {
        Connection conn = SimpleDataSource.getConnection();
        try
        {
            double balance = 0;
            PreparedStatement stat = conn.prepareStatement(
            "SELECT Balance FROM Account WHERE Account_Number = ?");
            stat.setInt(1, accountNumber);
            ResultSet result = stat.executeQuery();
            if(result.next()) balance = result.getDouble(1);
            return balance;
        }
        finally
        {
            conn.close();
        }
    }
}
    
}
