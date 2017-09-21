/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daylived;


import java.sql.Date;
/**
 *
 * @author Dimitrios
 */
public class DayLived {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Counter counter;
        counter = new Counter();
        
        for(int i=0; i<3;i++){
            counter.countIncrement(5);
        }
        System.out.print(counter.value+"\n");
        counter.reset();
        System.out.print(counter.value+"\n");
        
        Clock time;
        time = new Clock();
        System.out.print("\nminutes: "+time.mins+"\nhours: "+time.hours+" \n");
    }
    
    
    private static class Counter{
        private int value;
        
        public void countIncrement(int userValue){
            value+=userValue; 
        }
        
        public void reset(){
            value = 0;
        }
        
    }
    
    private static class Clock{
        private int mins=0,hours=0;
       
    }
    
    
}
