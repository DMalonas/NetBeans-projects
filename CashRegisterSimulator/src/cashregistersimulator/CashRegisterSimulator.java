/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregistersimulator;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimitrios
 */
public class CashRegisterSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       CashRegister register = new CashRegister();
    
       String input = JOptionPane.showInputDialog("Enter price: ");
       double price = Double.parseDouble(input);
       register.recordPurchase(price);
       
       System.out.print("Enter dollars: ");
       int dollars = in.nextInt();
       System.out.print("Enter quarters: ");
       int quarters = in.nextInt();
       System.out.print("Enter dimes: ");
       int dimes = in.nextInt();
       System.out.print("Enter nickels: ");
       int nickels = in.nextInt();
       System.out.print("Enter pennies: ");
       int pennies = in.nextInt();
       register.enterPayment(dollars, quarters, dimes, nickels, pennies);
       
       System.out.print("Your change: ");
       System.out.println(register.giveChange());
    }
    
}
