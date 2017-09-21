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
public class SavingsAccount extends BankAccount {

    public double interestRate;
    
    /**
     *
     * @param rate
     */
    public SavingsAccount(double rate) {
        interestRate = rate;
    }
    
    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    
}
