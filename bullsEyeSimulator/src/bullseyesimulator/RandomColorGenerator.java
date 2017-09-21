

package bullseyesimulator;

import java.util.Random;




public class RandomColorGenerator 
{
 

   
   public RandomColorGenerator()
   {  
   }
   public static int generateNumber( )
   {
        Random randomNumbers = new Random();
        int randomColor=1;
        randomColor = randomNumbers.nextInt(3);
     
        System.out.printf("%d \n ",randomColor);
         return randomColor;
   }
    
}

