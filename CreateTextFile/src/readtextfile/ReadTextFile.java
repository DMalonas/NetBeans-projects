
package readtextfile;

import java.io.File;
import java.util.Scanner;


public class ReadTextFile {

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner( new File( "clients.txt" ) );

        
        String firstName = "";
        String lastName = "";
        double balance = -1.0;
        int accountNumber = -1, counter, switchCounter = 0;
        char temp; 
      
        System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
                "First Name", "Last Name", "Balance" );
        
        
        while ( input.hasNext() ) {
            for( switchCounter = 0; switchCounter < 3; ++switchCounter ){
                switch( switchCounter ){
                    case 0:
                        for(;;){
                            System.out.print(" Enter accountNumber: ");
                            while(!input.hasNextInt() ){
                                System.out.print(" Account Number needs to be an integer:  ");
                                input.next();
                            }
                            accountNumber = input.nextInt();
                            if( accountNumber <= 0 ){
                                System.out.print("The accountNumber shall be positive:  ");
                                continue;
                            }
                            else
                            {
                                System.out.print("Thank you for entering your "
                                        + "account number: ");
                                break;
                            }
                        }
                    break;
                    case 1:
                        for(;;){
                            System.out.print(" Enter firstName [ 0 - 30 ]: ");
                            firstName = input.next();
                            
                            if( firstName.length() > 30 )
                            {
                                System.out.print(" Name too long.\n");
                                continue;
                            }
                            for( counter = 0; counter < firstName.length(); ++counter){
                                temp =  firstName.charAt( counter );
                                if( !( Character.isLetter( firstName.charAt( counter ) ) ) )
                                {
                                    System.out.print(" firstName needs to be a name "
                                    + "with no numbers or characters or white spaces"
                                    + "such as '.' or '/' or '~' or ' ':  \n");    
                                    break;
                                }
                            }
                            if( ( counter == firstName.length() ) && 
                                ( Character.isLetter( firstName.charAt( counter ) ) ) ) 
                            {    
                                System.out.print(" Thank you for entering your"
                                        + "first name: \n");
                                break;
                            }
                        }
                    break;
                    case 2:
                        for(;;){
                            System.out.print(" Enter lastName [ 0 - 30 ]: ");
                            lastName = input.next();
                            
                            if( lastName.length() > 30 )
                            {
                                System.out.print(" lastName too long.\n");
                                continue;
                            }
                            for( counter = 0; counter < lastName.length(); ++counter){
                                temp =  lastName.charAt( counter );
                                if( !( Character.isLetter( lastName.charAt( counter ) ) ) )
                                {
                                    System.out.print(" lastName needs to be a name "
                                    + "with no numbers or characters or white spaces"
                                    + "such as '.' or '/' or '~' or ' ':  \n");    
                                    break;
                                }
                            }
                            if( ( counter == lastName.length() ) && 
                                ( Character.isLetter( lastName.charAt( counter ) ) ) ) 
                            {    
                                System.out.print(" Thank you for entering your"
                                        + "lastName: \n");
                                break;
                            }
                        }
                    break;
                    case 3:
                        for(;;){
                            System.out.print(" Enter balance: ");
                            while(!input.hasNextDouble() ){
                                System.out.print(" balance needs to be a number:  ");
                                input.next();
                            }
                            balance = input.nextDouble();
                            if( balance <= 0 ){
                                System.out.print("The balance shall be positive:  ");
                                continue;
                            }
                            else
                            {
                                System.out.print("Thank you for entering your "
                                        + "account balance: ");
                                break;
                            }
                        }
                    break;
                }//end switch
            }//end for switchCounter
                    
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",
                    accountNumber, firstName, lastName, balance);
        }//end while
        
        input.close();
    }
}
