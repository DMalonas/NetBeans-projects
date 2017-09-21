/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttester;

import java.util.ArrayList;

/**
 *
 * @author Dimitrios
 */
public class ArrayListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(1001));
        accounts.add(new BankAccount(1015));
        accounts.add(new BankAccount(1729));
        accounts.add(new BankAccount(1008));
        accounts.remove(0);
        
        System.out.println("Size: " + accounts.size());
        System.out.println("Expected: 3");
        BankAccount first = accounts.get(0);
        System.out.println("First account number: " + first.getAccountNumber());
        System.out.println("Expected: 1008");
        BankAccount last = accounts.get(accounts.size()-1);
        System.out.println("Last account number: " + last.getAccountNumber());
        System.out.println("Expected: 1729");
    }
}
