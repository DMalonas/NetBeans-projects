
package lettersgrade;

import java.util.Scanner;

public class LettersGrade {
    
    public static void main(String[] args) {
        
        double grade, total = 0 ;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0, gradeCounter = 0;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf( "%s\n%s\n\t%s\n\t%s\n",
                "Enter the integer grades in the range of 0 - 100",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter" );
        
        // loop until the user enters the end of file indicator
    for(;;){
        while ( !sc.hasNextDouble() ){
            System.out.print(" [0-100] ");
            sc.next();
        }
        grade = sc.nextDouble();
        if( grade == -1 ){
            System.out.print( "Input process completed ");
            break;
        }
        else if( grade < 0 || grade > 100 ){
            System.out.print(" range[0 - 100]\n");
            sc.next();
            continue;
        }
        else{
           total += grade;
           gradeCounter++;
           if( grade > 90 ){
               aCount++;
           }
           else if( grade > 80 ){
               bCount++;
           }
           else if( grade > 70 ){
               cCount++;
           }
           else if( grade > 60 ){
               dCount++;
           }
           else if( grade > 50 ){
               fCount++;
    } } } 
    System.out.println( "\nGrade Report: ");
        //if user enterd at least one grade...
        if ( gradeCounter != 0 ){
        //calculate average of all grades entered     
        //output summary of results
        System.out.printf( "Total of the %d grades entered is %f\n",
            gradeCounter, total );
        System.out.printf( "Class average is %.2f\n", total / gradeCounter );
        System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
            "Number of students who received each grade:",
            "A: ", aCount, //DISPLAY NUMBER OF a GRADES
            "B: ", bCount, //display number of b grades
            "C: ", cCount, //display number of c grades
            "D: ", dCount, //display number of d grades
            "F: ", fCount );    //display number of F grades
        } // end if
        else // no grades were entered, so output appropriate message
            System.out.println( "No grades were entered" );
    } }
