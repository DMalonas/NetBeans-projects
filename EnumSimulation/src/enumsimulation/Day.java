
package enumsimulation;


public enum Day {
    D1  ("MONDAY"),
    D2  ("TUESDAY"),
    D3  ("WEDNESDAY"),
    D4  ("THURSDAY"),
    D5  ("FRIDAY"),
    D6  ("SATURDAY"),
    D7  ("SUNDAY"); 

    private final String day; 
    
    Day(String day){
        this.day = day;
    }
    
    public String toString(){
        return day;
    }
}

