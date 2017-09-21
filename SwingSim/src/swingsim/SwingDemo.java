
package swingsim;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.*;




class SwingDemo {
    public SwingDemo() {
        final JFrame fr = new JFrame("Swing JFrame");
        fr.setSize(1000,1000);
//        JLabel textLabel= new JLabel("Swing JLabel");
//        fr.add(textLabel, BorderLayout.NORTH);

        JLabel imageLabel = new JLabel();
        JLabel imageLabel2 = new JLabel();
        
        System.out.println(new File("javaGif.gif"));
        System.out.println(new File("javaGif.gif").exists());
        System.out.println(new File("javaGif.gif").getAbsolutePath());
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("javaGif.gif"));
        imageLabel.setIcon(ii);
       fr.add(imageLabel, BorderLayout.CENTER);
        

        
        
        
        
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
