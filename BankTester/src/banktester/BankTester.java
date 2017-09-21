/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktester;

/**
 *
 * @author Dimitrios
 */
public class BankTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Bank firstBankOfJava = new Bank();
      firstBankOfJava.addAccount(new BankAccount(1001, 20000));
      firstBankOfJava.addAccount(new BankAccount(1015, 10000));
      firstBankOfJava.addAccount(new BankAccount(1729, 15000));
    
      double threshold = 15000;
      intcount = firstBankOfJava.countBalanceAtLeast(threshold);
      System.out.println("Count: " + count);
      System.out.println("Expected: 2");
      
      int accountNumber = 1015;
      BankAccount account = firstBankOfJava.find(account Number);
      if(account == null)
          System.out.println("No matching account");
      else
          System.out.println("Balance of matching account: " + account.getBalance());
      System.out.println("Expected: 10000");
      
      BankAccount max = firstBankOfJava.getMaximum();
      System.out.println("Account with largest balance: " + max.getAccountNumber());
      System.out.println("Expected: 1001");
    }
}
