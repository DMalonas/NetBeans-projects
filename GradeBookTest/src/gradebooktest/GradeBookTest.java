
package gradebooktest;

import java.util.Scanner;


public class GradeBookTest {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        
        GradeBook gr = new GradeBook();
        GradeBook maths = new GradeBook( "Maths" );
        GradeBook mathsEng = new GradeBook( "Engineering Maths" );
       
        gr.displayGradeBookName();
       gr.setGradeBookName( "PE" );
       System.out.printf("Course  is %s \n", gr.getGradeBookName() );
       gr.displayGradeBookName();
       
       maths.displayGradeBookName();
       maths.setGradeBookName("physics");
       System.out.printf("Course  is %s \n", maths.getGradeBookName() );
       maths.displayGradeBookName();
       
       
       mathsEng.displayGradeBookName();
       mathsEng.setGradeBookName("physidfdsfsdfcs");
       System.out.printf("Course  is %s \n", mathsEng.getGradeBookName() );
       mathsEng.displayGradeBookName();
       
    }
    
}
