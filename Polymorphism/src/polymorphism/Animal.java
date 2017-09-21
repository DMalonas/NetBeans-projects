/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author aa6164
 */
public class Animal
{
    public String whatAmI = "I am an Animal!";
    
    void anAnimalLikeMethod()
    {
        
    }
    
    void makeNoise()
    {
        System.out.println("you can hear a generic animal noise!");
    }
    
    static void staticMethodNoise()
    {
        System.out.println("you can hear a generic animal noise! from a static call");
    }
    
}
