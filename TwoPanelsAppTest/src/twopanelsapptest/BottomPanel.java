
package twopanelsapptest;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class BottomPanel extends JPanel{

    private final Font boldFont; 
    

     
     
    private final JLabel emailAddressLabel;  
    private final JTextField emailAddressTextField;  
    
    private final JButton addButton;
    private final JButton buttonEdit;
    private final JButton buttonRemove;
    private final JButton buttonAsDefault;
    
    private final JList itemList;
    private static final  String[] items = { "Item1", "Item2", "Item3", "Item4",
        "Item5", "Item6" }; //initialise list of strings
    
    private final JLabel emailMailFormatLabel;

    private final JRadioButton hTMLButton;
    private final JRadioButton plainTextButton;
    private final JRadioButton customButton;
    private ButtonGroup radioGroup;
    
    
    public BottomPanel(){
        
     //   super("");
        
        boldFont = new Font( "Arial", Font.BOLD, 14 );   //initialise Font object
        
        
        
        emailAddressLabel = new JLabel( " E-mail Address:");  //initialise label
        emailAddressLabel.setFont(new Font( "Arial", Font.BOLD, 14 ) ); //set label's font
        
        emailAddressTextField = new JTextField(20); //set textField's width
        
        addButton = new JButton("     Add      " ); //initialise button
        addButton.setFont(boldFont); //set font for button
        buttonEdit = new JButton("     Edit      ");
        buttonEdit.setFont(boldFont);
        buttonRemove = new JButton("  Remove ");
        buttonRemove.setFont(boldFont);
        buttonAsDefault = new JButton("As Default");
        buttonAsDefault.setFont(boldFont);
        
        itemList = new JList( items ); // initialise JList with list of strings
        itemList.setVisibleRowCount( 5 ); //set visible items rows number    
        
        itemList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION); //set selection mode for items of JList
        
        emailMailFormatLabel =  new JLabel( " Mail Format:");
        emailMailFormatLabel.setFont(boldFont);
         
        hTMLButton = new JRadioButton( "HTML", true);
        plainTextButton = new JRadioButton( "Plain Text", false);
        customButton = new JRadioButton( "Custom", false );
        
        radioGroup = new ButtonGroup();
        radioGroup.add( hTMLButton );
        radioGroup.add( plainTextButton );
        radioGroup.add( customButton );
        hTMLButton.setFont(boldFont);
        plainTextButton.setFont(boldFont);
        customButton.setFont(boldFont);
        
        
        
        JPanel newPanel2 = new JPanel(new GridBagLayout()); //declare, initialise  panel and set layout manager
                
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        
        /**
         * set location of emailAddressLabel and add it to panel
         */
        constraints.gridx = 0;
        constraints.gridy = 0;     
        newPanel2.add( emailAddressLabel, constraints );
        
        /**
         * set location of emailAddressTextField and add it to panel
         */
        constraints.gridx = 1;
        newPanel2.add( emailAddressTextField, constraints);
        
        
         /**
         * set location of addButton and add it to panel
         */
        constraints.gridx = 3;
        constraints.gridy = 0;
        newPanel2.add( addButton, constraints);
        
        constraints.gridx = 3;
        constraints.gridy = 1;
        newPanel2.add( buttonEdit, constraints);
        
        constraints.gridx = 3;
        constraints.gridy = 2;
        newPanel2.add( buttonRemove, constraints);
        
        constraints.gridx = 3;
        constraints.gridy = 3;
        newPanel2.add( buttonAsDefault, constraints);
         
        
        
        
        /**
         * set location of emailAddressLabel and add it to panel
         */
        constraints.gridx = 4;
        constraints.gridwidth = 4;
        constraints.gridx = 0;
        constraints.gridy = 2;  
        itemList.setFixedCellHeight(20);
        itemList.setFixedCellWidth(335);
        newPanel2.add( new JScrollPane(itemList), constraints );
        
        
        constraints.gridx = 0;
        constraints.gridy = 5;
        newPanel2.add( emailMailFormatLabel, constraints);
        
      
        
        constraints.gridx = 0;
        constraints.gridy = 6;
        newPanel2.add( hTMLButton, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 6;
        newPanel2.add( plainTextButton, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 6;
        newPanel2.add( customButton, constraints);
        
                newPanel2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "E-mail"));
        
        // add the panel to this frame
        add(newPanel2);
         
  //      pack();
  //      setLocationRelativeTo(null);
    }
}
