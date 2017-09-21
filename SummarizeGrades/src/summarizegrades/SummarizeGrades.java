

package summarizegrades;



public class SummarizeGrades 
{

   
    public static void main(String[] args) 
    {
        int[][] gradesArray = { { 87, 96, 70 }, 
                                { 68, 87, 90 },
                                { 94, 87, 90 },
                                { 100, 81, 90},
                                { 83, 65, 85},
                                { 78, 87, 65},
                                { 85, 75, 83},
                                { 91, 94, 100},
                                { 76, 72, 84},
                                { 87, 93, 73} };
        
        //output grades arry 
        outputGrades( gradesArray );
        
        System.out.printf("\n%s %d\n%s %d\n\n", "Lowest grade is", getMinimum( gradesArray ),
                "Highest grade is",getMaximum( gradesArray ) );
       
        outputBarChart( gradesArray );
        }
    
    public static int getMinimum( int grades[][] )
    {
        int lowGrade = grades[0 ][0];
        
        for( int[] studentGrades : grades )
        {
            for ( int grade: studentGrades )
            {
                if( grade < lowGrade )
                    lowGrade = grade; 
            }
        }
        return lowGrade;
    }
    
    
    public static int getMaximum( int grades[][])
    {
        int highGrade = grades[0][0];
        
        for( int[] studentGrades : grades )
        {
            for( int grade : studentGrades )
            {
                if( grade > highGrade )
                    highGrade = grade;
            }
        }
        return highGrade;
    }
    
    
    public static double getAverage( int[] setOfGrades )
    {
        int total = 0;
        
        for( int grade : setOfGrades )
            total += grade;
        
        return (double) total / setOfGrades.length;
    }
    
    public static void outputBarChart( int grades[][])
    {
        System.out.println("Overall grade distribution: ");
        
        int[] frequency = new int[11];
        
        for( int[] studentGrades : grades )
        {
            for( int grade : studentGrades )
                ++frequency[ grade / 10 ];
        }
        
        for( int count = 0; count<frequency.length; count++)
        {
            if( count == 10 )
                System.out.printf( "%5d: ", 100 );
            else
                System.out.printf("%02d - %02d: ", count * 10, count * 10 + 9 );
            
            for( int stars =0; stars<frequency[ count ]; stars++ )
                System.out.print("*");
            
            System.out.println();
        }
    }
    
    public static void outputGrades( int grades[][])
    {
        System.out.println("The grades are:\n");
        System.out.print("              ");
        
        for( int test=0; test<grades[0].length; test++)
            System.out.printf("Test %d ", test + 1);
        
        System.out.println( "Average" );
        
        for( int student = 0; student < grades.length; student++)
        {
            System.out.printf("Student %2d", student + 1);
            for ( int test : grades[ student ] )
            System.out.printf( "%8d ", test);
        
            double average =getAverage( grades [student]);
            System.out.printf( "%9.2f\n", average);
        }
    }
}
