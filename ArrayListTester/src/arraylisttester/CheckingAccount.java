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
public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    transactionCount = 0;
}

    public void deposit(double amount)
    {
        transactionCount++;
super.withdaw(amount);
    }


    public void withdraw(double amount)
    {
        super.withdraw(amount);
    }

    public void deductFees()
    {
        if(transactionCount > FREE_TRANSACTIONS)
        {
            double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionCount = 0;
    }


    
    
}
