/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author Dimitrios
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GreetingRunnable r1 = new GreetingRunnable("Hello, World");
       GreetingRunnable r2 = new GreetingRunnable("Hello, World");
    
    
       r1.run(); r2.run();
    }
    
}
