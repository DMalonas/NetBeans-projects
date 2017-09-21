/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulator;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimitrios
 */
public class ATMSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATM theATM;
        
        try
        {
            Bank theBank = new Bank();
            theBank.readCustomers("customers.txt");
            theATM = new ATM(theBank);
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Error opening accounts file. ");
            return;
        }
        JFrame frame = new ATMFrame(theATM);
        frame.setTitle("FirstNational Bankof Java ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
