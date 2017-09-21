
package guiframetest;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Gui extends JFrame{
    
     
    private final JLabel labelFirstName = new JLabel("First Name: ");
    private final JLabel labelLastName = new JLabel("Last Name: ");
    private final JLabel labelTitle = new JLabel("Title: ");
    private final JLabel labelNickname = new JLabel("Nickname: ");
    private final JComboBox formatComboBox;
    
    private final JTextField textFirstName = new JTextField(20);
    private final JTextField textLastName = new JTextField(20);
    private final JTextField textTitle = new JTextField(20);
    private final JTextField textNickName = new JTextField(20);
   
    
    private static final String[] names =
    { "Item1", "Item2", "Item3", "Item4", "Item5" }; 
    
    
    
    private final JPasswordField fieldPassword = new JPasswordField(20);
    
    
    
    private final JButton buttonLogin = new JButton("Login");
 
    
    public Gui(){
        
        super("");
        
         
        
         JPanel newPanel = new JPanel(new GridBagLayout());
         
         
         
        labelFirstName.setFont(new Font("Arial", Font.BOLD, 14 ) );
        labelLastName.setFont(new Font("Arial", Font.BOLD, 14 ) );
        labelTitle.setFont(new Font("Arial", Font.BOLD, 14 ) );
        labelNickname.setFont(new Font("Arial", Font.BOLD, 14 ) );
        formatComboBox = new JComboBox( names );
        formatComboBox.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel.add(labelFirstName, constraints);
 
        constraints.gridx = 1;
        newPanel.add(textFirstName, constraints);
         
        
        
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(labelTitle, constraints);
         
        constraints.gridx = 1;
        newPanel.add(textTitle, constraints);
         
        
        ///////////////////////////
        constraints.gridx = 2;
        constraints.gridy = 0;     
        newPanel.add(labelLastName, constraints);
 
        constraints.gridx = 3;
        newPanel.add(textLastName, constraints);
         
        
        
        constraints.gridx = 2;
        constraints.gridy = 1;     
        newPanel.add(labelNickname, constraints);
         
        constraints.gridx = 3;
        newPanel.add(textNickName, constraints);
       
        
        
        
        
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 0;
        constraints.anchor = GridBagConstraints.WEST;
        newPanel.add( formatComboBox, constraints );
        formatComboBox.setMaximumRowCount(3);
        /*
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
         */
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Name"));
        
        // add the panel to this frame
        add(newPanel);
         
        pack();
        setLocationRelativeTo(null);
    }
    
}

