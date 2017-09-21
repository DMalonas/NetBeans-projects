
package drawpolygons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class PolygonsJPanel extends JPanel 
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        //draw polygon with polygon object
      //  int[] xValues = {20, 40, 50, 30, 20, 15 };
      //  int[] yValues = { 50, 50, 60, 80, 80, 60 };
      //  Polygon polygon1 = new Polygon(xValues, yValues, 6);
      //  g.drawPolygon(polygon1);
        
        
        //draw polylines with two arrays
       // int[] xValues2 = { 70, 90, 100, 80, 70, 65, 60 }; 
       // int[] yValues2 = { 100, 100, 110, 110, 130, 110, 90 };
        //g.drawPolyline( xValues2, yValues2, 7 );
        
        
        //fill polygon with two arrays
        int[] xValues3 = { 150, 170, 180, 220 }; 
        int[] yValues3 = { 60, 90, 106, 80 };
        g.fillPolygon(xValues3, yValues3, 4 );
        
        
        int[] xValues4 = { 180, 240, 250, 290 }; 
        int[] yValues4 = { 85, 80, 70, 40 };
        g.fillPolygon(xValues4, yValues4, 4 );
        
        
        
        g.setColor(Color.BLUE);
        g.drawArc(155,80,160,160,0,360);
        
        
        Polygon polygon2 = new Polygon();
        //polygon2.addPoint(165, 135 );
        //polygon2.addPoint( 175, 150 );
        polygon2.addPoint(270, 200 );
        polygon2.addPoint( 200, 220 );
        polygon2.addPoint(130, 180 );
        g.fillPolygon(polygon2);

    }
}
