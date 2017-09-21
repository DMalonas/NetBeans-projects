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
public class InvestmentRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final double INITIAL_BALANCE = 10000;
       final double RATE = 5; 
       final int YEARS = 20;
       Investment invest = new Investment(INITIAL_BALANCE,RATE);
       invest.waitYears(YEARS);
       double balance = invest.getBalance();
       System.out.printf("The balance after %d years is %.2f\n",YEARS,balance);  
    }
}
