
package accounttest;

import java.util.Scanner;

public class AccountInitialScreen {
    
    Scanner sc = new Scanner( System.in );
    
    int choice = 0;

    public int chooseAction(){
        for( ;; ){
            System.out.print(" 0\t-\tCREATE ACCOUNT\n"
                    + " 1\t-\tDISPLAY BALANCE\n"
                    + " 2\t-\tMAKE DEPOSIT\n"
                    + " 3\t-\tWITDRAW AMOUNT\n"
                    + " 4\t-\tRETURN CARD\n"); 
            while( !sc.hasNextInt() ){
                System.out.print( "Valid Inputs: 0 - 1 - 2 - 3: " );
                sc.next();
            }
            choice = sc.nextInt();
            if( 1 == choice || 2 == choice || 3 == choice || 0 == choice  || 4 == choice ){
                break;
            }
            else{
                System.out.print( "Valid Inputs: 0 - 1 - 2 - 3: \n" );
            }
        }
        return choice;
    }
}
