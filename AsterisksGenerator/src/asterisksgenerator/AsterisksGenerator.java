
package asterisksgenerator;

import java.util.Scanner;

public class AsterisksGenerator {


    public static void main(String[] args) {
  
        
        /**
         * int numberOfAsterisks; 
        Scanner sc = new Scanner( System.in );
        
        for(;;){
            System.out.print( " Enter input [1 - 30] " );
          for(;;){
            
            while( !sc.hasNextInt() ){
                System.out.print( " input [1 - 30] ");
                sc.next();
            }
            numberOfAsterisks = sc.nextInt();
            if( -1 == numberOfAsterisks ){
                return;
            }
                else if( numberOfAsterisks < 0 || numberOfAsterisks > 30 ){
                System.out.print(" input [1 - 30] ");
                continue;
            }
            break;
          }
          for( int i = 0; i <  numberOfAsterisks; i++ ){
              System.out.print("*");
          }
        }
         */
        int i =1, j =2, k = 3, m = 2; 
        
        System.out.println( i == 1);
        System.out.println( j == 3);        
        System.out.println( ( i >= 1 ) && ( j < 4 ) );
        System.out.println( ( m <= 99 ) & ( k < m ) );
        System.out.println( ( m >= i ) & ( k == m ) );
        System.out.println( ( m >= i ) || ( k == m ) );
        System.out.println( ( k + m < j ) | ( 3 - j >= k ) );
        System.out.println( !( k > m ) );
    }
    
}
