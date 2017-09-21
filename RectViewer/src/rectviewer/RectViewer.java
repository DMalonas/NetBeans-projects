/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectviewer;

import javax.swing.JFrame;


/**
 *
 * @author Dimitrios
 */
public class RectViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("Skata");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RectComponent component = new RectComponent();
        frame.add(component);
        
       
        frame.setVisible(true);
        
    }
    
}
