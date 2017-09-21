

package bullseyesimulator;


import javax.swing.JFrame;

public class BullsEyeSimulator 
{


    public static void main(String[] args) 
    {
        BullsEye panel = new BullsEye();
        JFrame frame = new JFrame();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500 );
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
