/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */
public class DataAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSetReader = new DataSetReader();
        
        boolean done = false;
        while(!done)
        {
            try
            {
                System.out.println("Please enter the file name: ");
                String filename = in.next();
                
                double[] data = reader.readFile(filename);
                double sum = 0;
                for(double d : data) sum += d;
                System.out.println("The sum is " + sum);
                done = true;
            }
            catch (FileNotFoundException exception)
            {
                   System.out.println("File not found. ");
            }
            catch (BadDataException exception)
            {
                System.out.println("Bad data" + exception.getMessage());
            }
            catch (IOException exception)
            {
                exception.printStackTrace();
            }       
        }
    }
}
