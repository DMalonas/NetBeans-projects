
package analysis;

import java.util.Scanner; 
/**
 *
 * @author Dimitrios
 */
public class Analysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int passes = 0, failures = 0, studentCounter = 1, result=0; 
        System.out.println("\t\t\tENTER RESULT(1=PASS 2=FAIL");
        while( studentCounter <=10 )
        {
            System.out.printf("STUDENT %d GRADE: ",studentCounter);
            result = input.nextInt(); 
            System.out.println(); 
            
            if(1 == result)
            {
                passes+=1;
            }
            else if(2 == result)
            {
                failures+= 1; 
            }
            else 
            {
                System.out.println("ONLY 1 AND 2 ALLOWED");
                continue;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d\nFailed: %d\n",passes,failures);
        
        if(passes > 8 )
            System.out.println( "Bonus to me" );
    }
    
}
