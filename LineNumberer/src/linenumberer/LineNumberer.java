/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linenumberer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */
public class LineNumberer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        
      /*  
        //Promt for the input and output file names
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String Dimitrios = console.next();
        System.out.print("Output file: ");
        String Malonas = console.next();
   
    
        //Construct the Scanner and PrintWritet objects for reading and writing
        
        File inputFile = new File(Dimitrios);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(Malonas);
        int lineNumber = 1;
        
        
        //Read the input and write the output
        
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            out.println("/* " + lineNumber + " /* " + line);
            lineNumber++;
        }
        
        in.close();
        out.close();
    */
        
        String address = "http://java.sun.com/index.html";
        URL locator = new URL(address);
        Scanner in = new Scanner(locator.openStream());
    }
      
}
