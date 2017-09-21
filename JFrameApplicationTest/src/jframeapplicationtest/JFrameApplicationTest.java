
package jframeapplicationtest;

import javax.swing.JFrame;

public class JFrameApplicationTest {


    public static void main(String[] args) {
        
        JFrameApplication frame = new JFrameApplication();
        frame.pack();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
    
}
