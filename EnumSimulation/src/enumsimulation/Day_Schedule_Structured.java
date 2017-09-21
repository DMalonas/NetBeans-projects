
package enumsimulation;


public enum Day_Schedule_Structured {
    D1  ("MONDAY","JAVA"),
    D2  ("TUESDAY","EMPTY SCHEDULE"),
    D3  ("WEDNESDAY","DS"),
    D4  ("THURSDAY","JAVA & DS"),
    D5  ("FRIDAY","JAVA & DS"),
    D6  ("SATURDAY","DISSERTATION"),
    D7  ("SUNDAY","DISSERTATION"); 

    
    private final String day;
    private final String activity;
            
    Day_Schedule_Structured(String day, String activity){
        this.day = day;
        this.activity = activity;
    }
    
    public String getDay(){
        return day;
    }
    
    public String getActivity(){
       return activity;
    }
    
    
    
}
