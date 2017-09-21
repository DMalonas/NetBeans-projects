/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceviewer;

import javax.swing.JFrame;

/**
 *
 * @author Dimitrios
 */
public class FaceViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setSize(500,500);
       frame.setTitle("ΕΞΟΩΓΗΙΝΟΣ");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       FaceComponent component = new FaceComponent();
       frame.add(component);
       
       frame.setVisible(true);
    }
    
}
