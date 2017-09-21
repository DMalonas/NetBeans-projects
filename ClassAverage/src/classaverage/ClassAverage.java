
package classaverage;

import java.util.Scanner;

/**
 * Counter Controlled Repetition
 * @author Dimitrios
 */
public class ClassAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        int total;
        int gradeCounter;
        int grade;
        double average; 
        
        
        total = 0;
        gradeCounter = 0;
        
        
        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();
        
        
        while(grade != -1)
        {
            total += grade; 
            gradeCounter++; 
            
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        if( gradeCounter != 0)
        {
            average = (double) total / gradeCounter;
            System.out.printf("\nTotal of the %d grades entered is %d\n",gradeCounter,total);
            System.out.printf( "Class average is %.2f\n", average );
        }
        else
            System.out.println( "No grades wre entered" );e
    }
}
