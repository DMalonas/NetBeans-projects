
package enumtest;

public enum Book {
    JHTP( "JAVA", "2010" ),
    CHTP( "C", "2007"),
    IW3HTP( "Internet", "2008" ),
    CPPHTP( "CPP", "2008" ),
    VBHTP( "VB", "2009" ),
    CSHARPHTP( "VC#", "2009" );
    
    
    
    private final String title;
    private final String copyrightYear;
    
    
    Book( String bookTitle, String year ){
        
        title = bookTitle;
        copyrightYear = year;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getCopyrightYear(){
        return copyrightYear;
    }










}
