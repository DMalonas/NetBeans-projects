/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readtextfile2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */

public class ReadTextFile2 {

 public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner( new File( "clients.txt" ) );
        
        
        String firstName;
        String lastName;
        double balance = 0;
        int accountNumber;
         
      
        System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
                "First Name", "Last Name", "Balance" );
        

        while ( input.hasNext() ) {
            accountNumber = input.nextInt();
            firstName = input.next();
            lastName = input.next();
            input.nextDouble();
        

            System.out.printf( "%-10d%-12s%-12s%10.2f\n",
                    accountNumber, firstName, lastName, balance);
        }
    
        input.close();
    }
}
