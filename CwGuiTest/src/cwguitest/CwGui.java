
package cwguitest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class CwGui extends JFrame {
    
    
    private JTextField loginField;
    private JPasswordField passwordField; 
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JButton loginJButton;

    
    public CwGui(){
        super( "Testing JTextField and JPasswordField" );
       JFrame frame = new JFrame();
        
        setLayout( new FlowLayout() );
        
       
        loginField = new JTextField(30);
        loginLabel = new JLabel("Username");
        loginField.add(loginLabel);       
// add( loginField );
        
        
        passwordField = new JPasswordField( 30 );
        passwordLabel = new JLabel("Password");
        loginField.add(passwordLabel);
        
// add( passwordField );
        
        
        
        JPanel panel = new JPanel();
        panel.setLayout( new BorderLayout() );
        
        panel.add( loginField);
        panel.add( passwordField );
        
        
      
        
        
        
    } 
}
