
package maximumfinder;


import java.util.Scanner;
/**
 *
 * @author Dimitrios
 */
public class MaximumFinder
{

    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter 3 floating point values separated by spaces: ");
        double number1 = input.nextDouble(); 
        double number2 = input.nextDouble();
        double number3 = input.nextDouble(); 
        
        double result = Math.max(number1,Math.max(number2, number3));
        
        System.out.printf("Maximum number is : %.2f\n",result);
    }
    
    
    public static double maximum( double x, double y, double z )
    {
        double maximumValue = x; 
        
        if( y > maximumValue )
            maximumValue = y;
        if( z > maximumValue )
            maximumValue = z;
        
        return maximumValue;
    }
    
}
