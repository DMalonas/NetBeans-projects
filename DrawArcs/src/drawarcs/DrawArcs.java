
package drawarcs;


    import javax.swing.JFrame;


public class DrawArcs 
{


    public static void main(String[] args) 
    {
        JFrame frame = new JFrame(". . . ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ArcsJPanel arcsJPanel = new ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}
