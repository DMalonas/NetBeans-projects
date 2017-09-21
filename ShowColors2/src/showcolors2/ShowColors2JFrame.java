
package showcolors2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ShowColors2JFrame extends JFrame {
    
    private JButton changeColorJButton; 
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;
    
    
    public ShowColors2JFrame(){
        super( "Using JColorChooser" );
        
        colorJPanel = new JPanel();
        colorJPanel.setBackground( color );
    
        changeColorJButton = new JButton( "Change color" );
        changeColorJButton.addActionListener(
            new ActionListener(){
                public void actionPerformed( ActionEvent event ){
                    color = JColorChooser.showDialog( ShowColors2JFrame.this, 
                            "Choose a colr", color);
                    if ( null == color )
                        color = Color.LIGHT_GRAY;
                    
                    colorJPanel.setBackground( color );
                }
            }
        );
        
        add( colorJPanel, BorderLayout.CENTER );
        add( changeColorJButton, BorderLayout.SOUTH );
        setSize( 400, 130 );
        setVisible( true );
    }
    
}
