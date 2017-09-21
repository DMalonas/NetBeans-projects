
package comboboxtest;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class ComboBoxFrame extends JFrame{
    
    private JComboBox imagesJComboBox;
    private JLabel label;
    
    
    private static final String[] names = { "bug1.gif", "bug2.gif", "bug3.gif", 
        "bug4.gif" };
    private Icon[] icons = { 
        new ImageIcon( getClass().getResource( names[ 0 ] ) ),
        new ImageIcon( getClass().getResource( names[ 1 ] ) ),
        new ImageIcon( getClass().getResource( names[ 2 ] ) ),
        new ImageIcon( getClass().getResource( names[ 3 ] ) ),
    };
    
    
    public ComboBoxFrame(){
        super("Testing JComboBox" );
        setLayout( new FlowLayout() );
        
        imagesJComboBox = new JComboBox( names );
        imagesJComboBox.setMaximumRowCount( 3 );
        
        imagesJComboBox.addItemListener( 
            new ItemListener(){
                public void itemStateChanged( ItemEvent event ){
                    if( event.getStateChange() == ItemEvent.SELECTED )
                        label.setIcon( icons[ 
                                 imagesJComboBox.getSelectedIndex() ]);
                }
            });
    }
}
