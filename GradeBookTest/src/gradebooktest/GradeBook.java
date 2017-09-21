
package gradebooktest;


public class GradeBook {
    
    private String gradeBook;
    
    public GradeBook(){}
    
    public GradeBook( String gradeBook ){
      this.gradeBook = gradeBook;
    }
    
    
    
    public void setGradeBookName( String gradeBook ){
        this.gradeBook = gradeBook;
    }
    
    public String getGradeBookName(){
        return gradeBook;
    }
    
    public void displayGradeBookName(){
        System.out.printf( "Course name is %s\n", gradeBook ); 
    }
    
}
