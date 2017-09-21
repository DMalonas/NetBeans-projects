
package rolldiee;

import java.util.Random;

public class RollDiee 
{


    public static void main(String[] args) 
    {
        Random randomNumbers = new Random();
        int[] frequency = new int[6];
        
        for( int roll = 1; roll<6000; roll++)
        {
            ++frequency[randomNumbers.nextInt(6)];
        }
        
        System.out.println("Face\t\tFrequency");
        for( int face = 0; face <= frequency.length-1; face++)
        {
            System.out.printf("%d\t\t%d\n",face+1,frequency[face]);
        }
    }
    
}
