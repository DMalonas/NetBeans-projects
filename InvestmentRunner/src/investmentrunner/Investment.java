/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentrunner;

/**
 *
 * @author Dimitrios
 */
public class Investment {
    
    private double balance;
    private double rate;
    private int years;
    
    
    /**
     * constructor
     */
    public Investment(double aBalance, double aRate)
    {
        balance = aBalance;
        rate = aRate;
        years = 0; 
    }
    
    /**
     *  accumulate interest
    */
    public void waitForBalance(double targetBalance)
    {
        while(balance < targetBalance)
        {
            years++;
            double interest = balance * rate/100; 
            balance += interest;
        }
    }
    
    
    public void waitYears(int numberOfYears)
    {
        for(int i = 1; i<=numberOfYears;i++)
        {
            double interest = balance * rate/100;
            balance = balance + interest;
        }
        years++; 
    }
    
    public double getBalance()
    {
        return balance; 
    }
    
    public int getYears()
    {
        return years;
    }
}
