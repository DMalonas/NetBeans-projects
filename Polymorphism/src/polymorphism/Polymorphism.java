/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author aa6164
 */
public class Polymorphism
{

    public static void main(String args[])
    {
        // Polymorphism - Slide 9 Overloading decides on which method to call at compile-time
        {
            System.out.println("--Slide 9 Polymorphism - Overloading:");
            Math math = new Math();
            System.out.println(math.doCalculation(6));
            System.out.println(math.doCalculation(6.4));
        }
        
        // Polymorphism - Overriding Slide 14
//        {
//            System.out.println("--Slide 14 Polymorphism - Overloading:");
//            Animal cat = new Cat();
//            cat.makeNoise();
//            
//            Dog dog = new Dog();
//            dog.makeNoise(); // dog overrides makeNoise()
//            Animal animal = (Animal)dog; // Points to an animal (the animal is a dog)
//            animal.makeNoise();
//            
//        }
        
        // Polymorphism - When does it happen? Slide 15
        // When does it do overloading example - Error
//        {
//            System.out.println("--Slide 15 Polymorphism - When does it happen?:");
//            Animal dog = new Dog();
//            dog.makeNoise(); // okay, because overriding is done at run-time
//            //dog.makeNoise(65); // error, because overloading (signature checking) is done at compile-time not run-time.
//            // The compiler thinks it is an animal (which does not contain this method)
//            
//            Dog myDogsBetterThanYourDog = (Dog)dog; // type casting to a Dog object
//            myDogsBetterThanYourDog.makeNoise(34); // now it works because we are telling the compiler it is a Dog!
//        }
        
        // Shadowing Slide 16
//        {
//            System.out.println("--Slide 16 Polymorphism vs. Shadowing:");
//            Animal dog = new Dog();
//            dog.makeNoise(); // runtime polymorphism for overridden method calls
//            System.out.println(dog.whatAmI); // shadowing for attributes/fields
//            
//            Dog myDog = (Dog)dog; // type casting to a Dog object
//            myDog.makeNoise();
//            System.out.println(myDog.whatAmI);
//        }
        
        // Static example
//        {
//            System.out.println("--Static:");
//            Dog.staticMethodNoise();
//            Animal.staticMethodNoise();
//            // static is done at compile-time
//            // therefore overriding does not apply to static methods
//        }
        
        
    }
    
}
