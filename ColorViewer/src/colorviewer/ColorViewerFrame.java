       

package colorviewer;


import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.GridLayout;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener.Change;
import javax.swing.*;  
import javax.swing.event.ChangeEvent;
/**
 *
 * @author Dimitrios
 */
public class ColorViewerFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private JPanel colorPanel;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider; 
    
    
    
    public ColorViewerFrame()
    {
        colorPanel = new JPanel();
        
        add(colorPanel,BorderLayout.CENTER);
        createControlPanel();
        setSampleColor();
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
    }
    
    public void createControlPanel()
    {
        class ColorListener implements ChangeListener
        {
            public void stateChanged(ChangeEvent event)
            {
                setSampleColor();
            }

            @Override
            public void changed(ObservableValue ov, Object t, Object t1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
        ChangeListener listener = new ColorListener();
        
        redSlider = new JSlider(0,255,255);
        redSlider.addChangeListener((javax.swing.event.ChangeListener) listener);
        
        greenSlider = new JSlider(0,255,175);
        greenSlider.addChangeListener((javax.swing.event.ChangeListener) listener);
        
        
        
        
        blueSlider = new JSlider(0,255,175);
        blueSlider.addChangeListener((javax.swing.event.ChangeListener) listener);
        
        
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,2));
        
        controlPanel.add(new JLabel("Red"));
        controlPanel.add(redSlider);
        
        controlPanel.add(new JLabel("Green"));
        controlPanel.add(greenSlider);
        
        controlPanel.add(new JLabel("Blue"));
        controlPanel.add(blueSlider);
        
        add(controlPanel,BorderLayout.SOUTH);
     
    }
    
    
    public void setSampleColor()
    {
        int red= redSlider.getValue();
        int green= greenSlider.getValue();
        int blue = blueSlider.getValue();
        
        colorPanel.setBackground(new Color(red,green,blue));
            colorPanel.repaint();
    }
}
