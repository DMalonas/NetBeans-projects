
package guiframetest;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;



public class Email extends JFrame{

    private Font boldFont; 
    
    private final JLabel labelMailFormat = new JLabel("Mail Format: ");
    
    private final JLabel labelEmailAddress = new JLabel("Email-Address: ");
    private final JTextField textEmailAddress = new JTextField(20);

    private final JButton buttonAdd = new JButton("Add");
    private final JButton buttonEdit = new JButton("Edit");
    private final JButton buttonRemove = new JButton("Remove");
    private final JButton buttonAsDefault = new JButton("As Default");
    
    
    private final JRadioButton hTMLButton;
    private final JRadioButton plainTextButton;
    private final JRadioButton customButton;
    private ButtonGroup radioGroup;
    
    private final JList itemList;
    
    private static final String[] items = { "Item1", "Item2", "Item3",
        "Item4", "Item5", "Item6" };


    public Email(){
        
        super("");
        
        JPanel newPanel2 = new JPanel(new GridBagLayout());
         
        
        
        
         
        itemList = new JList( items ); 
        itemList.setVisibleRowCount( 5 );    
        itemList.setSelectionMode( ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
       
        hTMLButton = new JRadioButton( "HTML", true);
        plainTextButton = new JRadioButton( "Plain Text", false);
        customButton = new JRadioButton( "Custom", false );
        /*
        radioGroup = new ButtonGroup();
        radioGroup.add( hTMLButton );
        radioGroup.add( plainTextButton );
        radioGroup.add( customButton );
        */
        
        boldFont = new Font( "Arial", Font.BOLD, 14 );
        textEmailAddress.setFont(boldFont);
      
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
         // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel2.add( hTMLButton , constraints);
        
        constraints.gridx = 1;
        newPanel2.add(hTMLButton, constraints);
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                newPanel2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "E-mail"));
        
        // add the panel to this frame
        add(newPanel2);
         
        pack();
        setLocationRelativeTo(null);
        
    }
}
