
package ncs;

import java.util.Scanner;

public class NCS 
{
    public static void main(String[] args) 
    {        
        int pass = 0, input;
        
        Scanner sc = new Scanner(System.in);
        
        for( int i = 0; i < 10; i++ )
        {
            System.out.printf("Student %d result [1-pass       fail-2]: ",i+1);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            while(!sc.hasNextInt())
            {
                System.out.print("\nInvalid Input (1,2) acceptable inputs\n");
                sc.next();
            }
            input = sc.nextInt();
            if( !(input == 1) && !(2 == input) )
            {
                System.out.print("\nInvalid Input (1,2) acceptable inputs\n");
                i--;
                continue;
            }
            else
                pass++;
        }
        System.out.printf(" PASSED: %d\tFAILED: %d\n",pass,10-pass);
        if( 8 < pass )
            System.out.print("\nBONUS!\n");
        
    }   
}
