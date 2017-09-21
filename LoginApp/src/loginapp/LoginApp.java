
package loginapp;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;






public class LoginApp {

        public static void main(String[] args) {
        // set look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginAppGui().setVisible(true);
            }
        });
    }

    }
    

