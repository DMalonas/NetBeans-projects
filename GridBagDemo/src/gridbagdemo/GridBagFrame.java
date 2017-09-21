

package gridbagdemo;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GridBagFrame extends JFrame 
{
    private GridBagLayout layout; // lauout of this frame
    private GridBagConstraints constraints;
    
    //set up GUI
    public GridBagFrame()
    {
        super( "GridBagLayout" );
        layout = new GridBagLayout();
        setLayout( layout );
        constraints = new GridBagConstraints();
    
        
        //create GUI componenets
        JTextArea textArea1 = new JTextArea( "TexArea1", 5, 10 );
        JTextArea textArea2 = new JTextArea( "TexetArea2", 2, 2);
        
        String[] names = { "Iron", "Steel","Brass" };
        JComboBox comboBox = new JComboBox( names );
        
        JTextField textField = new JTextField( "TextField" );
        JButton button1 = new JButton( "Button 1");
        JButton button2 = new JButton( "Button 2");
        JButton button3 = new JButton( "Button 3");
        
        
        //weightx and weighty for textAre1 re both 0: the default
        //anchor for all components is CENTER: the default
        constraints.fill = GridBagConstraints.BOTH;
        addComponent( textArea1, 0, 0, 1, 3 );
        
        addComponent( comboBox , 2, 1, 2, 1 );
        
        
        
        // button2
        constraints.weightx = 1000;
        constraints.weighty = 1; //cn grow taller
        constraints.fill = GridBagConstraints.BOTH;
        addComponent( button2, 1, 1, 1, 1);
        
        
        //fill in BOTH for button3
        constraints.weightx = 0;
        constraints.weighty = 0;        //
        addComponent( button3, 1, 2, 1, 1);
        
        
        //weightx and weighty for textField are both 0 , fill is BOTH
        addComponent( textField, 3, 0, 2, 1);
        
        //weithgx nd weighty for textArea2 are both 0, fill is BOTH
        addComponent( textArea2, 3, 0, 2, 1 );
    }
    
    
    private void addComponent( Component component, 
            int row, int column, int width, int height )
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints( component, constraints );
        add( component );
    }

}
