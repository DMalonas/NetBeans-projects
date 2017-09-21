/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movetester;

/**
 *
 * @author Dimitrios
 */

import java.awt.Rectangle; 

public class MoveTester {
    
        public static void main(String[] args){
            Rectangle box = new Rectangle(5,10,20,30);
            
            box.translate(25,15);
            
            
            
            System.out.print("width: ");
            System.out.print(box.getWidth());
            System.out.println("Expected: 20");

            
            System.out.print("Height: ");
            System.out.print(box.getHeight());
            System.out.println("Expected: 30");
            
            
            System.out.print("x: ");
            System.out.println(box.getX());
            System.out.println("Expected: 30");
            
            System.out.print("y: ");
            System.out.println(box.getY());
            System.out.println("Expected: 25");
          
        }
    
}
