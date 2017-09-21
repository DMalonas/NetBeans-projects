
package jlisttest;

import java.awt.FlowLayout;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListFrame extends JFrame{
    
    private JList colorJList;
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
        "Dark Gray", "Gray", "Green", "Light Gray", "Magneta", 
        "Orange", "Pink", "Red", "White", "Yellow" };
    private static final Color[] colors ={ Color.BLACK, Color.BLUE, Color.CYAN,
        Color.DARKGRAY, Color.GRAY, Color.GREEN, Color.LIGHTGRAY, Color.MAGENTA,
        Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
    
    public ListFrame(){
        super( "List Test" );
        setLayout( new FlowLayout() );
        
        colorJList = new JList( colorNames );
        colorJList.setVisibleRowCount( 5 );
        
        add( new JScrollPane( colorJList ) );
        
    }
    
}
