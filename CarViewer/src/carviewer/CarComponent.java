/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carviewer;

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
    public class CarComponent extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D)g;
             //allien
        Ellipse2D.Double head = new Ellipse2D.Double(5,200,100,150);
        g2.draw(head);

        g2.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(25,260,15,15);
        g2.fill(eye);
        eye.translate(50,0);
        g2.fill(eye);

        Line2D.Double mouth = new Line2D.Double(30,310,80,310);
        g2.setColor(Color.RED);
        g2.draw(mouth);

        g2.setColor(Color.BLUE);
        
        
            Car car1 = new Car(100,50);
            Car car2 = new Car(120,50);
            Car car3 = new Car(10,40);
            Car car4 = new Car(220,40);
            Car car5 = new Car(30,40);
            Car car6 = new Car(200,40);
            Car car7 = new Car(110,300);
            
            car1.draw(g2);
            car2.draw(g2);
            car3.draw(g2);
            car4.draw(g2);
            car5.draw(g2);
            car6.draw(g2);
            car7.draw(g2);
            
            
        Point2D.Double v_1 = new Point2D.Double(139,73);
        Point2D.Double v_2 = new Point2D.Double(139,300);
        Point2D.Double v_3 = new Point2D.Double(243,60);  
        Line2D.Double segment_1 = new Line2D.Double(v_1,v_2);
        g2.setColor(Color.RED);       
        g2.draw(segment_1);
        Line2D.Double segment_2 = new Line2D.Double(v_2,v_3);
        g2.setColor(Color.GREEN);  
        g2.draw(segment_2);
        }
    }

