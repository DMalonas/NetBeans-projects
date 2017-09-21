/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timesimulator;

/**
 *
 * @author Dimit
 */
public class TimeSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Time time = new Time(2,25,23);
        System.out.print(""+ time.toUniversalString() + "    ");
       }
    
}
