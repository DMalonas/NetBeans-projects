

package radiobuttontest;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButton extends JFrame{
    
    private JTextField textField; 
    private Font font;
    private Font boldFont, plainFont, italicFont, boldItalicFont;
    private JRadioButton plainJRadioButton, boldJRadioButton, italicJRadioButton,
            boldItalicJRadioButton;
    private ButtonGroup radioGroup;
    
    
    public RadioButton(){
        
        super( "RadioButton Test" );
        setLayout( new FlowLayout() );
    
        textField = new JTextField( "Watch the font style change" , 25 );
        add( textField );
        
        plainJRadioButton = new JRadioButton( "Plain", true) ;
        boldJRadioButton = new JRadioButton( "Bold", false);
        italicJRadioButton = new JRadioButton( "Italic", false);
        boldItalicJRadioButton = new JRadioButton( "BoldItalic", false );
        add( plainJRadioButton );
        add( boldJRadioButton );
        add( italicJRadioButton );
        add( boldItalicJRadioButton );
        
        radioGroup = new ButtonGroup();
        radioGroup.add( plainJRadioButton );
        radioGroup.add( boldJRadioButton );
        radioGroup.add( italicJRadioButton );
        radioGroup.add( boldItalicJRadioButton );
        
        
        plainFont = new Font( "Arial", Font.PLAIN, 14 );
        boldFont = new Font( "Arial", Font.BOLD, 14 );
        italicFont = new Font( "Arial", Font.ITALIC, 14 );
        boldItalicFont = new Font( "Arial", Font.BOLD + Font.ITALIC, 14 );
        textField.setFont( plainFont );
        
        plainJRadioButton.addItemListener(
            new RadioButtonHandler( plainFont ) );
        boldJRadioButton.addItemListener(
            new RadioButtonHandler( boldFont ) );
        italicJRadioButton.addItemListener(
            new RadioButtonHandler( italicFont ) );
        boldItalicJRadioButton.addItemListener(
            new RadioButtonHandler( boldItalicFont ) );
    }
    
    private class RadioButtonHandler implements ItemListener{
        
        private Font font;
        public RadioButtonHandler( Font f ){
            font = f; 
        }
        
        public void itemStateChanged( ItemEvent event ){
            textField.setFont(  font );
        }
        
    }
}
