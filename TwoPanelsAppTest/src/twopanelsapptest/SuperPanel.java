
package twopanelsapptest;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SuperPanel extends JFrame {
    
    private final Font boldFont; 
    
    private final JButton buttonOk;
    private final JButton buttonRemove;
    
    
    public SuperPanel(){
        
        super("");
        
        JPanel superJPanel = new JPanel();
        
        
        TopPanel topPanel = new TopPanel();
        BottomPanel bottomPanel = new BottomPanel();

        superJPanel.add(topPanel);
        superJPanel.add(bottomPanel);
        
        boldFont = new Font( "Arial", Font.BOLD, 14 );   //initialise Font object

  
        
        buttonOk = new JButton("     Add      " ); //initialise button
        buttonOk.setFont(boldFont); //set font for button
        buttonRemove = new JButton("     Edit      ");
        buttonRemove.setFont(boldFont);
        
                
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        
        constraints.gridx = 3;
        constraints.gridy = 2;     
        superJPanel.add(buttonOk, constraints);
 
        
        constraints.gridx = 3;
        constraints.gridy = 3;     
        superJPanel.add(buttonRemove, constraints);
        
        
        
        superJPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), ""));
        
        // add the panel to this frame
        add(superJPanel);
         
        pack();
        setLocationRelativeTo(null);
 
        
    }
    
}
