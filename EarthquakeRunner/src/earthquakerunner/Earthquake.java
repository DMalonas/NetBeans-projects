/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthquakerunner;

/**
 *
 * @author Dimitrios
 */
public class Earthquake {
    private double richter;
    
    public Earthquake(double magnitude){
        richter = magnitude;
    }
    
    public String description(){
        String r;
        if(richter >= 8.0)
            r = "Most structures fall";
        else if(richter >=7.0)
            r = "Many buildings destroyed";
        else if (richter >= 6.0)
            r="Damage to poorly constructed buildings";
        else if(richter >= 4.5)
            r= "same with previous";
        else if(richter >= 3.5)
            r= "Felt by many people, no destruction";
        else if(richter >= 0)
            r =  "Generallynot felt by people";
        else
            r = " wrong input "; 
        return r;
    }
}
