/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttester;

/**
 *
 * @author Dimitrios
 */
public class BankAccount {
        
    private int accountNumber;
    private double balance;
    
    /**
     * zero balance account constructor
     */
    public BankAccount(int anAccountNumber)
    {
        accountNumber = anAccountNumber;
        balance = 0;
    }
    
    /**
     * non-zero initial balance constructor 
     */
    public BankAccount(int anAccountNumber, double initialBalance)
    {
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }
    
    /**
     * gets the account number of this bank account
     * @return the account number 
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    /**
     * Deposits money int the bank account
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    
    /**
     * withdraws money from the bank account
     * @param amount the amount to withdraw
     */
       public void withdraw(double amount)
       {
           double newBalance = balance - amount;
           balance = newBalance;
       }
       
       /**
        * Gets the current balance of the bank account
        * @return the current balance
        */
       public double getBalance()
       {
           return balance;
       }
}

