
package page645demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ButtonFrame extends JFrame 
{
    //classic buttons follow
    private JButton okButton;
    private JButton cancelButton;
    private JButton setupButton; 
    private JButton helpButton; 
    //radio buttons follow
    private JRadioButton selectionRadioButton;
    private JRadioButton allRadioButton;
    private JRadioButton appletRadioButton;
    private ButtonGroup radioGroup;
    //comboBox follows
    private JComboBox heightsJComboBox;
    
    private static final String[] names = 
    { "High", "Middle", "Low" };
    
    //list
    private JList justList;
    
    
    public ButtonFrame()
    {
        super("Printer");
        setLayout( new FlowLayout() );  //set frame layout
        
        okButton = new JButton("OK");   //button with text
        add( okButton );    //add okButton to JFrame
        
        cancelButton = new JButton("Cancel");   //button with text
        add( cancelButton );    //add cancelButton to JFrame
        
        setupButton = new JButton("Setup...");   //button with text
        add( setupButton );    //add setupButton to JFrame
        
        
        helpButton = new JButton("Help");   //button with text
        add( helpButton );    //add helpButton to JFrame
        
        
        //create  new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        okButton.addActionListener( handler );
        cancelButton.addActionListener( handler );
        setupButton.addActionListener( handler );
        helpButton.addActionListener( handler );
        //button handler finish
        
        
          //radio buttons
          selectionRadioButton = new JRadioButton("Selection",true);
          allRadioButton = new JRadioButton("All",false);
          appletRadioButton = new JRadioButton("Applet",false);
          add(selectionRadioButton);
          add(allRadioButton);
          add(appletRadioButton);
          
          radioGroup = new ButtonGroup();
          radioGroup.add(selectionRadioButton);
          radioGroup.add(allRadioButton);
          radioGroup.add(appletRadioButton);
          //radio buttons finish
          
          //JComboBox
          heightsJComboBox = new JComboBox(names);
          heightsJComboBox.setMaximumRowCount(3);
          add(heightsJComboBox);
          
          //list
          justList = new JList();
          justList.setVisibleRowCount(5);
          justList.setFixedCellWidth(100);
          justList.setFixedCellHeight(15);
          justList.setSelectionMode(
            ListSelectionModel.SINGLE_INTERVAL_SELECTION);
          add( new JScrollPane( justList ));
          
    }//end ButtonFrame constructor
    
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed( ActionEvent event )
        {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s ",event.getActionCommand() ) );
        }
    }
}
