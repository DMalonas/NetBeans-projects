
package factorialsimulator;

import java.util.Scanner;


public class FactorialCalculator 
{
    private int number; 
    private int factorial=1;
    private int counter;
    
    public FactorialCalculator( int number )
    {
        this.number = number;
        displayFactorial();
    }
    
    
    
    public void calculateFactorial(){
        for( counter = number; counter>=1; factorial *= counter,counter-- );
    }
    
    
    public void displayFactorial()
    {
        calculateFactorial();
        System.out.printf("%d! = %d\n",number,factorial);
    }
    
     

}
