/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carviewer;

import javax.swing.JFrame;



/**
 *
 * @author Dimitrios
 */
public class CarViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400,400);
        frame.setTitle("ALLIEN ATTACK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CarComponent component = new CarComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
    
}
