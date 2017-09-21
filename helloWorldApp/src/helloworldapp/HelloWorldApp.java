/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

import java.lang.Package;
import java.awt.Rectangle; 
import java.util.Random;
/**
 *
 * @author Dimitrios
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( "the width of the rect is " + new Rectangle(1,2,5,10).getHeight() + " and "
        + "its width is " + new Rectangle(1,1,5,10).getWidth() + " and x is "+ new Rectangle(1,1,5,10).getX() + 
                " and y is " + new Rectangle(1,2,5,10).getY()+ " hello world".toUpperCase() +
              " hello, world".trim());
        
               Rectangle box = new Rectangle(5,10,20,30);
               box.translate(15,25);
        System.out.println("\n x: "+ box.getX() + " Expected: 20 ");

    
    }}
    




