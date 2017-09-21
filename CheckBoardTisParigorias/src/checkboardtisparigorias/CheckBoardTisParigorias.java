
package checkboardtisparigorias;

import java.util.Scanner;


public class CheckBoardTisParigorias {


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int i, factorial=1;
       
        while(!sc.hasNextInt()){
            System.out.print("only integers");
            sc.next();
        }
        
        i = sc.nextInt();
        if( i < 0 ){
            i = -i;
        }
        for( int j = 1; j <= i; j++){
            factorial *= j;
        }
        System.out.printf("\nFactoria of %d is %d ",i, factorial );
    
    }
    
    
    
}
