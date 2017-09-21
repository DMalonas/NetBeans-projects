/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentviewer3;

import javax.swing.JFrame;


/**
 * A bank account has a balance that can be changed by 
 * deposits and withdrawals 
 * @author Dimitrios
 */
public class BankAccount {

    private double balance;
    
    
    //Constructors
    //remember constructors's only purpose is to initialise the object's 
    //instance variables
   
    
    /**
     *This constructor simply sets the balance to 0
     */
    public BankAccount()
    {
        balance = 0;
    }
    
    /**
     * This constructor sets the balance to the value supplied at the construction
     * parameter
     * Constructs a BankAccount object with a given balance
     * @param initialBalance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance; 
    }
    
    
    //Methods

    /**
     *deposits money into the account 
     * @param amount the amount to deposit
     */
        public void deposit(double amount)
    {
        balance += amount; 
    }
    
    /**
     * Withdraws money from the bank account. 
     * @param amount the amount to withdraw
     * */
    public void withdraw(double amount)
    {
        balance -= amount;   
    }
    
    /**
     * Gets the current balance of the bank account
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        BankAccount dimitriosMalonasChecking = new BankAccount(10000);
        
        dimitriosMalonasChecking.deposit(500);
        dimitriosMalonasChecking.withdraw(100);
        System.out.println(" " + dimitriosMalonasChecking.getBalance() + " \nExpected: 10400");
    
        dimitriosMalonasChecking.balance = 0;  
         System.out.println(" " + dimitriosMalonasChecking.getBalance() + " ");
    
         JFrame frame = new JFrame();
         frame.setSize(400,400);
         frame.setTitle("Hellow World");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         //test
    
    
        
    
    }
    
}
