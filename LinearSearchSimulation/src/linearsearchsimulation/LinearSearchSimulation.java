
package linearsearchsimulation;

import java.util.Scanner;

public class LinearSearchSimulation 
{


    public static void main(String[] args) 
    {
        Scanner input = new Scanner ( System.in );
        
        int searchInt;
        int position;
        
        LinearArray searchArray = new LinearArray(10);
        System.out.println( searchArray + "\n" );
        
        //get input from user
        System.out.print(
                "Please enter an integer value (-1 to quit): ");
        searchInt = input.nextInt();
        
        while ( searchInt != -1 )
        {
            position = searchArray.linearSearch( searchInt );
            
            if( -1 == position )
                System.out.println( "The integer " + searchInt +
                        "was not found.\n" );
            else
                System.out.println( "The integer " + searchInt + 
                        " was found in position " + position + ".\n" );
                
            System.out.print(
                    "Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
    
}
5