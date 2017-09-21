
package enumtest2;


public enum Book {
    H1  ("Harry Potter 1"),
    H2  ("Harry Potter 2"),
    H3  ("Harry Potter 3"),
    H4  ("Harry Potter 4"),
    H5  ("Harry Potter 5"),
    H6  ("Harry Potter 6"),
    H7  ("Harry Potter 7");

    String book; 
    
    private Book( String book ){
        this.book = book;
    }
    
    public String toString(){
        return book;
    }


}
