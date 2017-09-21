
package shapesstarring;

import javax.swing.JFrame;

public class ShapesStarRing 
{


    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Drawing 2D shapes" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Shapes2JPanel shapes2JPanel = new Shapes2JPanel();
        frame.add(shapes2JPanel);
        frame.setSize(315, 330 );
        frame.setVisible(true);
    }
    
}
