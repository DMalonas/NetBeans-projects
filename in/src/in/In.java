
package in;

import java.util.Scanner;


public class In {


    public static void main(String[] args) {
    
        double num;
        Scanner sc = new Scanner( System.in );

        for( ;; ){
        System.out.print( "Enter double > 0:  " );
        while( !sc.hasNextDouble() ){
               System.out.print( "Input has to be a number " );
              
            sc.nextLine();
    
        }
        num = sc.nextDouble();
        if( num < 0){
            System.out.print( "number needs to be bigger than 0 " );
        continue;
    }
    break;
 }
}
    
}
