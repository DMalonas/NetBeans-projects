package enumsimulation;

import java.util.EnumSet;


public class EnumSimulation {


    public static void main(String[] args) {
        
        for(Day d : Day.values()){
            System.out.printf("%s\n", d);
        }
        System.out.println();
        
        System.out.printf("%21s\n", "WEEKLY SCHEDULE 1");
        for(Day d : Day.values()){
            System.out.printf("%-20s", d);
            switch(d){
                case D1:
                    System.out.printf("%s","JAVA");
                    break;
                case D2:
                    System.out.printf("%s","TUESDAY");
                    break;           
                case D3:
                    System.out.printf("%s","WEDNESDAY");                    
                    break;
                case D4:
                    System.out.printf("%s","THURSDAY");                    
                    break;           
                case D5:
                    System.out.printf("%s","FRIDAY");                    
                    break;
                case D6:
                case D7:
                    System.out.printf("%s","SATURDAY");                    
                    break;           
                default:
                    System.out.printf("XXXXXXXXXXXXXXXXXXXXXXXXXX");

            }
            System.out.println();
        }
        System.out.println();
        
        for(Day_Schedule ds : Day_Schedule.values()){
            System.out.printf("%s\n", ds);
        }
        
        System.out.printf("%45s\n", "WEEKLY SCHEDULE 2");
        for(Day_Schedule_Structured dss : Day_Schedule_Structured.values()){
            System.out.printf("%-20s %-45s %s \n",dss, dss.getDay(), dss.getActivity());
        }
        
        System.out.printf("%45s\n", "WEEKLY SCHEDULE 3");
        for(Day_Schedule_Structured dss : Day_Schedule_Structured.values()){
            System.out.printf("%-20s %-45s %s \n",dss, dss.getDay(), dss.getActivity());
        }
        
        System.out.printf("%45s\n", "WEEKLY SCHEDULE 4");
        for(Day_Schedule_Structured dss : EnumSet.range(Day_Schedule_Structured.D1, Day_Schedule_Structured.D5)){
            System.out.printf("%-20s %-45s %s \n",dss, dss.getDay(), dss.getActivity());
        }
    }
    
}
