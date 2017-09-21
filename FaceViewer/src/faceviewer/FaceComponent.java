/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceviewer;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 *
 * @author Dimitrios
 */
public class FaceComponent extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;

        //allien
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,100,150);
        g2.draw(head);

        g2.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(25,70,15,15);
        g2.fill(eye);
        eye.translate(50,0);
        g2.fill(eye);

        Line2D.Double mouth = new Line2D.Double(30,110,80,110);
        g2.setColor(Color.RED);
        g2.draw(mouth);

        g2.setColor(Color.BLUE);
        g2.drawString("ΓΕΙΑ ΣΟΥ ΜΠΑΜΑ! ",21,175);
    
    /**
        //37
        Ellipse2D.Double circle= new Ellipse2D.Double(25,25,100,100);
        g2.draw(circle);
        
        //38
        Point2D.Double v_1 = new Point2D.Double(200,200);
        Point2D.Double v_2 = new Point2D.Double(300,400);
        Point2D.Double v_3 = new Point2D.Double(400,200);  
        Line2D.Double segment_1 = new Line2D.Double(v_1,v_2);
        g2.draw(segment_1);
        Line2D.Double segment_2 = new Line2D.Double(v_2,v_3);
        g2.draw(segment_2);
        
        g2.setColor(Color.YELLOW);
        g2.setBackground(Color.RED);
        Rectangle yellowBox = new Rectangle(100,100,50,50);
        g2.fill(yellowBox);
    
    */
    }  
}
