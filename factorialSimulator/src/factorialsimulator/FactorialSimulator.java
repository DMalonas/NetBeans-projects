
package factorialsimulator;

import java.util.Scanner;


public class FactorialSimulator {


    public static void main(String[] args)
    {
        
        int number;
        
        
        Scanner in = new Scanner( System.in );
            System.out.print( "Enter positive integer" );
            number = in.nextInt();
        
        FactorialCalculator factorial = new FactorialCalculator(number);
        
        
    }
    
}
