
package hollowsquare4;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class HollowSquare4 {

    public static void main(String[] args) {
        
        int counter1= 0, i = 0, numberOfAsterisks = 0;
        String inputValue = null; 
        boolean continueLoop = true;
        
        Scanner scanner = new Scanner( System.in );
        //choose number of squares
        do{
            try{
                System.out.print( "Enter Sided Size: " );
                numberOfAsterisks = scanner.nextInt();
    
                
                //inputValue = JOptionPane.showInputDialog(null, "INPUT", 
                //  "Enter Side Size: ", ERROR_MESSAGE);
                
                
                continueLoop = false;
            }
            catch( InputMismatchException inputMismatchException ){
                System.err.printf("\nException:%s\n", 
                        inputMismatchException );
                scanner.nextLine();
                System.out.println(
                    "You must enter integers. Please try again.\n" );
            }
             catch( NumberFormatException numberFormatException ){
                System.err.printf("\nException:%s\n", 
                        numberFormatException );
                scanner.nextLine();
                System.out.println(
                    "You must enter integers. Please try again.\n" );
             }
             catch( ArithmeticException arithmeticException ){
                System.err.printf("\nException:%s\n", 
                        arithmeticException );
                scanner.nextLine();
                System.out.println(
                    "You must enter integers. Please try again.\n" );
             }
            
        }while( continueLoop );

        
        //= Integer.parseInt( inputValue );

        JOptionPane.showMessageDialog(null, String.format("Side Size: %d asterisks", numberOfAsterisks ) );
                  
        
        /**
          Scanner sc = new Scanner(System.In);
          System.out.print("int:");
          while(!sc.hasNextInt()){
           System.out.print("only int: ");
           sc.next();
          }
          numberOfAsterisks = sc.nextInt();
          if( 0 > numberOfAsterisks )f
           numberOfAsterisks  = - numberOfAsterisks; 
          if( 0 == numberOfAsterisks ) return; 
         */
       //first and last line       
       while( ++i <= 2 ){
        for( counter1 = 1; counter1 <= numberOfAsterisks; ++counter1 )
            System.out.printf("* ");
        if( 2 == i ) return;
        //middle lines
        for(int counter2 = numberOfAsterisks; counter2 > 2; --counter2){
            for( counter1 = 1; counter1 <= numberOfAsterisks; ++counter1 ){
                System.out.printf("%s", (1 == counter1) ? "\n* " : ( numberOfAsterisks == counter1 ) ? "*" : "  ");
            } }
        System.out.print("\n");
        } } }
    
