/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktester;

import java.util.ArrayList;

/**
 *
 * @author Dimitrios
 */
public class Bank {

    private ArrayList<BankAccount>accounts;
    
    public Bank(){
        accounts = new ArrayList<BankAccount>();
    }
    
    public void addAccount(BankAccount a)
    {
        accounts.add(a);
    }
    
    public double getTotalBalance()
    {
        double total = 0;
        for(BankAccount a: accounts)
        {
            total = total + a.get.Balance();
        }
        return total;
    }
    }

    public int countBalanceAtLeast(double atLeast)
{
    int matches = 0;
    for (BankAccount a : accounts)
    {
        if(a.getBalance() >= atLeast)matches++;
    }
    return matches; 
    
    public BankAccount find(int accountNumber)
    {
        for(BankAccount a: accounts)
        {
            if(a.getAccountNumber() == accountNumber)
            return a;
        }
        return null;
    }   

    public BankAccount getMaximum()
    {
        if(accounts.size()==0)return null;
        BankAccount largestYet = acounts.get(0);
for(int i = 1; i<accounts.size();i++)
{
    BankAccount a =accounts.get(i);
if(a.getBalance()> largestYet.getBalance())
largestYet = a;
}
return LargestYet;
    }
}
