

package gridbagdemo2;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;



public class GridBagFrame2 extends JFrame
{
    private GridBagLayout layout; // lauout of this frame
    private GridBagConstraints constraints;
    
    //set up GUI
    @SuppressWarnings("empty-statement")
    public GridBagFrame2()
    {
        super( "GridBagLayout2" );
        layout = new GridBagLayout();
        setLayout( layout );
        constraints = new GridBagConstraints();
    
        
        //create GUI componenets
        String[] metals =  {"Copper", "Aluminium", "Silver" };
        JComboBox comboBox = new JComboBox(metals);
        
        JTextField textField = new JTextField( "TextField" );
        
         String[] fonts =  {"Serif", "Monospaced" };
        JList list = new JList(fonts);
        
        String[] names = { "zero", "one", "two", "three", "four" };
        JButton[] buttons = new JButton[ names.length ];
        
        for( int count = 0; count < buttons.length; count++ )
            buttons[count] = new JButton( names[ count ]);

        
        //define gui component constraints for textfield
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent( textField );
        
        // buttons[0] -- weightx and weighty re 1: fill is BOTH
        constraints.gridwidth = 1;
        addComponent( buttons[ 0 ]);
        
        
        
        //buttons[1] -- weightx and weighty re 1: fill is BOTH
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        addComponent( buttons[1] );
        
        //button[2] -- weightx and weighty are 1: fill is BOTH
        constraints.gridwidth =  GridBagConstraints.REMAINDER;
        addComponent( buttons[2] );
        
        //comboBox -- weightx is 1: fill  is BOTH
        constraints.weighty = 0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent( comboBox );
        
        // buttons[3] -- weightx is 1: fill is BOTH
        constraints.weighty = 1;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent( buttons[3] );
        
        //buttons[4] -- weigthx and weigthy are 1: fill is BOTH
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        addComponent( buttons[ 4 ] );
        
        //list -- weightx and weighty are 1: fill is BOTH
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        addComponent( list );
   
    }
    
    //add component to the container 
    private void addComponent( Component component )
    {
        layout.setConstraints( component, constraints );
        add( component );
    
    }
}
 