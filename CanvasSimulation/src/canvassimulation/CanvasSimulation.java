
package canvassimulation;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;


public class CanvasSimulation {


    public static void main(String[] args) {
       
        Frame fr = new Frame("Hello Wolrd.");
      
      // fr.setLayout(new GridLayout(2, 3));

       //fr.setLayout(new FlowLayout(FlowLayout.LEFT));
       
        Panel topPanel = new Panel();
        Panel bottomPanel = new Panel();
        topPanel.setLayout(new BorderLayout());
        
        fr.setLayout(new BorderLayout());
        topPanel.setLayout(new BorderLayout());
         topPanel.setSize(1000, 1000);
        fr.add(BorderLayout.CENTER, topPanel);
        final MyCanvas can = new MyCanvas();
        topPanel.add(BorderLayout.CENTER, can);
        


    }
    
}
