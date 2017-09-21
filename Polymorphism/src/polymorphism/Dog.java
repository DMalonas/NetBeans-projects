/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.lang.reflect.*;

/**
 *
 * @author aa6164
 */
public class Dog extends Animal
{
    public String whatAmI = "I am a Dog!"; // Shadowing
    
    void aDogLikeMethod()
    {
        
    }
    
    void makeNoise()
    {
        System.out.println("you can hear a loud bark!");
    }
    
    void makeNoise(int x)
    {
        System.out.println("you can hear " + x + " loud barks!");
    }
    
    static void staticMethodNoise()
    {
        System.out.println("you can hear a loud bark! from a static call");
    }
    
}
