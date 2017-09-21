

package jtabbedpanedemo;

import javax.swing.JFrame;

public class JTabbedPaneDemo
{


    public static void main(String[] args) 
    {
        JTabbedPaneFrame jTabbedPaneFrame = new JTabbedPaneFrame();
        jTabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTabbedPaneFrame.setSize( 250, 200 );
        jTabbedPaneFrame.setVisible(true);
    }
    
}
