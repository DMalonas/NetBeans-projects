/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthquakerunner;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimitrios
 */
public class EarthquakeRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
       String input = JOptionPane.showInputDialog("Enter a magnitude on the Richter scale: ");
       double magnitude = Double.parseDouble(input);
        //double magnitude = in.nextDouble();
        Earthquake quake = new Earthquake(magnitude);
        System.out.println(quake.description());
    }
}
