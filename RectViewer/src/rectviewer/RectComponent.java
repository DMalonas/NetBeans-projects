/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectviewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author Dimitrios
 */
public class RectComponent extends JComponent{
    
    public void paintComponent(Graphics g){
        Graphics2D g2 =(Graphics2D)g;
        Rectangle box = new Rectangle(100,100,20,30);
        
        g2.draw(box);
        box.translate(15,25);
        g2.draw(box);
    
    
        Ellipse2D.Double circle;
        circle = new Ellipse2D.Double(0,0,200,200);
        g2.setColor(Color.RED);
        g2.fill(circle);
    
        Line2D.Double segment = new Line2D.Double(5,100,10,50);
        g2.draw(segment);
        
        Color magneta = new Color(255,0,255);
        g2.drawString("Message",50,100);
        
        
    }
}
