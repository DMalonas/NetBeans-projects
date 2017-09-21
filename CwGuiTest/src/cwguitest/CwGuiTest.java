
package cwguitest;

import javax.swing.JFrame;

public class CwGuiTest {

    public static void main(String[] args) {
        
        CwGui textFieldFrame = new CwGui();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(600, 400);
        textFieldFrame.setVisible(true);
    }
}
