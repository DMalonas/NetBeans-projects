/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsortviewer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JComponent;

/**
 *
 * @author Dimitrios
 */
class SelectionSortComponent extends JComponent{
    
    private SelectionSorter sorter;
    
    /**
     * Constructs the component.
     */
    public SelectionSortComponent()
    {
        int[] values = ArrayUtil.randomIntArray(30, 300);
        sorter = new SelectionSorter(values, this);
    }
    
    public void paintComponet(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g; 
        sorter.draw(g2);
    }
    
    /**
     * Starts a new animation thread.
     */
    public void startAnimation()
    {
        class AnimationRunnable implemenets Runnable
        {
            public void run()
            {
               try
               {
                   sorter.sort();
               }
               catch(InterruptedException exception)
               {
                   
               }
            }
        }
        Runnable r = (Runnable) new AnimationRunnable();
        Thread t = new Thread(r);
        t.start();
    }
    
    

}
