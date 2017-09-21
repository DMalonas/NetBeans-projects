
package awtsimulator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;



public class AWTSimulator {


    public static void main(String[] args) {
       Frame fr = new Frame("Hello Wolrd.");
      
      // fr.setLayout(new GridLayout(2, 3));

       //fr.setLayout(new FlowLayout(FlowLayout.LEFT));
        fr.setLayout(new BorderLayout());
        Button buttons[] = new Button[5];
        for (int i = 0; i <= 4; i++) {
                buttons[i] = new Button("Button " + i);
        } // end of for loop
        Panel topPanel = new Panel();
        Panel bottomPanel = new Panel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setSize(1000, 1000);

        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        fr.add(BorderLayout.CENTER, topPanel);
        fr.add(BorderLayout.SOUTH, bottomPanel);
        topPanel.add(buttons[0]);
        topPanel.add(buttons[1]);
        topPanel.add(buttons[2]);
        topPanel.add(buttons[3]);
        topPanel.add(buttons[4]);
      
        Choice option = new Choice();
        option.addItem("Choice Item 1");
        option.addItem("Choice Item 2");
        bottomPanel.add(option);

        
        MenuBar mBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        Menu menuHelp = new Menu("Help");
        menuFile.add(new MenuItem("Open..."));
        mBar.add(menuFile);
        mBar.add(menuEdit);
        mBar.add(menuView);
        mBar.add(menuHelp);
        fr.setMenuBar(mBar);
        MenuItem menuItemClose = new MenuItem("Exit");
        menuItemClose.addActionListener(new CloseBehaviour());
        menuFile.add(menuItemClose);
        buttons[0].addActionListener(new CloseBehaviour());
    
       MyCanvas canvas = new MyCanvas();
       //fr.add(BorderLayout.CENTER,canvas);
       topPanel.add(BorderLayout.CENTER,canvas);
        fr.pack(); // preferred size of subcomponents
 
        fr.setVisible(true);
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }});
            
    }
    
     
}


    class CloseBehaviour implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ae) {
            System.exit(0);
            }
        }


    class MyCanvas extends Canvas {
        @Override public void paint(Graphics g){
        // this is called on a repaint()
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        g.setColor(new Color(red, green, blue));
        g.drawString("Canvas", 20, 20);
        g.fillRect(40, 40, 50, 50);
        System.out.println("height: " + this.getSize().height + "width: " + this.getSize().width);

        } // end of paint method
 
    }
  
    
