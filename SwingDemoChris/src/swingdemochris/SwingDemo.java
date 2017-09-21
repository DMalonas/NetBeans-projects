
package swingdemochris;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SwingDemo {
    
    public SwingDemo() {
        JFrame  fr = new JFrame("Swing JFrame");
        fr.setSize(500, 400);
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation ( JFrame.DISPOSE_ON_CLOSE);
        
        JLabel textLabel = new JLabel("Swing JLabel");
        fr.add(textLabel, BorderLayout.NORTH);
        JButton browse = new JButton("Browse...");
        browse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new 
                    FileNameExtensionFilter("GIF Images", "gif");
                int returnVal = chooser.showOpenDialog(fr);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    System.out.println("Chose to open this file: "+ 
                           chooser.getSelectedFile().getAbsolutePath());
                    imageLabel.setIcon(new ImageIcon(
                        chooser.getSelectedFile().getAbsolutePath()));
                }
            }
        });
        fr.add(browse.BorderLayout.SOUTH);
    }
}
