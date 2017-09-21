
package palindrome5digit;

import java.util.Scanner;

//44 444
public class Palindrome5Digit {


    public static void main(String[] args) {
        
        int digit, numberOfDigits = 0, leftDigit, rightDigit, dummyDigit;
        
        Scanner sc = new Scanner(System.in);
                    
        System.out.print( "ENTR 5 DIGIT INT" );
        for(;;){
            while( !sc.hasNextInt() ){
                System.out.print("ACCEPTABLE INPUT INTEGER NUMBER\n");
                sc.next();
            }
            digit = sc.nextInt();
                if( (0 == digit/10000) || ( 0 != digit/100000)){
                    System.out.print("\nENTER 5 DIGIT INT PLEASE: ");
                    continue;
                }
                break;
            }
            for( int i = 0; i < 2; i++ ){
                leftDigit = digit / 10;
                rightDigit = digit % 10;
              
            }

        }
    }
    

