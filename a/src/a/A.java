/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Dimit
 */
public class A extends JFrame{
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Frame f = new Frame();
        ArrayList <String> messageStrings = new ArrayList<String>();

        messageStrings.add("A");
        messageStrings.add("B");
        messageStrings.add("C");
        messageStrings.add("D");
        messageStrings.add("E");
        
        
                JComboBox cmb;
        cmb = new JComboBox(messageStrings);

        cmb.add(f);
        f.setSize(100,100);
        f.setVisible(true);
        // TODO code application logic here
        Iterator iter = messageStrings.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
    }
    
}
