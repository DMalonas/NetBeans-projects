
package panelstest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class PanelsTest {

    public static void main(String[] args) {
           new PanelsTest();
    }
    
    
    public PanelsTest() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new MainPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }
    
    
    
    
    
    public class MainPane extends JPanel {
     
        private final Font boldFont; 
        private final JButton buttonOk;
        private final JButton buttonRemove;
    
    
    
        public MainPane() {
            
            boldFont = new Font( "Arial", Font.BOLD, 14 );   //initialise Font object
            buttonOk = new JButton("   OK   " ); //initialise button
            buttonOk.setFont(boldFont); //set font for button
            buttonRemove = new JButton("Cancel");
            buttonRemove.setFont(boldFont);    
            
            JPanel newpanel = new JPanel(new GridBagLayout()); //set layout manager
            
            setBorder(new EmptyBorder(4, 4, 4, 4));
            setLayout(new GridBagLayout());
            GridBagConstraints constraints = new GridBagConstraints();
          
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.weightx = 1;
            constraints.fill = GridBagConstraints.HORIZONTAL;
            constraints.gridwidth = GridBagConstraints.REMAINDER;
            
            add( new TopPanel(), constraints );
            constraints.gridy++;
            add( new BottomPanel(), constraints );
            constraints.gridy++;
            constraints.weighty = 1;
            
        
            
           // constraints.anchor = GridBagConstraints.WEST;
           // constraints.insets = new Insets(10, 10, 10, 10);
        
        
            constraints.gridwidth = 1;
            
            constraints.gridy = 3;
            constraints.gridx = 2;
            constraints.anchor = GridBagConstraints.EAST;
            constraints.fill = GridBagConstraints.NONE;
            add(buttonOk, constraints );
            constraints.gridx++;
            constraints.weightx = 0;     
            add(buttonRemove, constraints );
            
        }
    }
    
    
    
    
    public class TopPanel extends JPanel{
    
     
    private final JLabel labelFirstName = new JLabel("First Name: ");
    private final JLabel labelLastName = new JLabel("Last Name: ");
    private final JLabel labelTitle = new JLabel("Title: ");
    private final JLabel labelNickname = new JLabel("Nickname: ");
    private final JComboBox formatComboBox;
    
    private final JTextField textFirstName = new JTextField(20);
    private final JTextField textLastName = new JTextField(20);
    private final JTextField textTitle = new JTextField(20);
    private final JTextField textNickName = new JTextField(20);
   
    
    private final String[] names = { "Item1", "Item2", "Item3", "Item4", "Item5" }; 
    
    
    private final JButton buttonLogin = new JButton("Login");
 
    
    public TopPanel(){
        
  //      super("");
        
         
        
         JPanel newPanel = new JPanel(new GridBagLayout()); //set layout manager
         
         
         /*
             initialise labels
         */
        labelFirstName.setFont(new Font("Arial", Font.BOLD, 14 ) );
        labelLastName.setFont(new Font("Arial", Font.BOLD, 14 ) );
        labelTitle.setFont(new Font("Arial", Font.BOLD, 14 ) );
        labelNickname.setFont(new Font("Arial", Font.BOLD, 14 ) );
        
        /*
            initialise comboBox and set length
        */
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
         
 //       pack();
 //       setLocationRelativeTo(null);
    }
    
}
    
    
    
    public class BottomPanel extends JPanel{

    private final Font boldFont; 
    

     
     
    private final JLabel emailAddressLabel;  
    private final JTextField emailAddressTextField;  
    
    private final JButton addButton;
    private final JButton buttonEdit;
    private final JButton buttonRemove;
    private final JButton buttonAsDefault;
    
    private final JList itemList;
    private final  String[] items = { "Item1", "Item2", "Item3", "Item4",
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
        
        emailAddressTextField = new JTextField(38); //set textField's width
        
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
        itemList.setFixedCellWidth(533);
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

    
}
