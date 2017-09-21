
package buttonframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
    
    private JButton plainJButton;
    private JButton fancyJButton;

    public ButtonFrame(){
        
        super( "Testing Buttons" );
        setLayout( new FlowLayout() );
        
        plainJButton = new JButton( "Plain Button" );
        add( plainJButton );
        
    //    Icon bug1 = new ImageIcon( getClass().getResource( "fil.jpg" ) );
    //    Icon bug2 = new ImageIcon( getClass().getResource( " zan.jpg" ) );
        fancyJButton = new JButton( "Fancy Button" );
      //  fancyJButton.setRolloverIcon( bug2 );
        add( fancyJButton );
        
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener( handler );
        plainJButton.addActionListener( handler );
    }
    
    private class ButtonHandler implements ActionListener{
        
        public void actionPerformed( ActionEvent event ){
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
