
package awtframe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AWTFrame {

    public static void main(String[] args) {
        Frame fr = new Frame("HELLO WORLD");
        Panel topPanel = new Panel();
        Panel bottomPanel = new Panel();
        Panel belowBottomPanel0 = new Panel();
        Panel canvasPanel = new Panel();
        fr.setLayout(new BorderLayout());
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        belowBottomPanel0.setLayout(new FlowLayout(FlowLayout.RIGHT));
        canvasPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        canvasPanel.setSize(1000,200);
        
        
     
        fr.add(BorderLayout.NORTH, topPanel);
        fr.add(BorderLayout.SOUTH, bottomPanel);
        fr.add(BorderLayout.WEST, belowBottomPanel0);
        fr.add(BorderLayout.EAST, canvasPanel);
        
        
        final MyCanvas can = new MyCanvas();
        canvasPanel.add(BorderLayout.CENTER,can);
        
        Button buttons[] = new Button[5];
        
        for(int i = 0; i <= 4; i++) { 
            buttons[i] = new Button("Button " + i);
        }
        topPanel.add(buttons[3]);
        topPanel.add(buttons[0]);
        topPanel.add(buttons[1]);

        bottomPanel.add(buttons[4]);
        bottomPanel.add(buttons[2]);
        belowBottomPanel0.add(new TextArea("Area", 10, 20));
        belowBottomPanel0.add(new Checkbox("Checkbox"));
        Choice option = new Choice();
        option.addItem("Choice Item 1");
        option.addItem("Choice Item 2");
        belowBottomPanel0.add(option);
        
        
        
        MenuBar mBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        Menu menuHelp = new Menu("Help");
        MenuItem menuItemClose = new MenuItem("Exit");
        menuItemClose.addActionListener(new CloseBehaviour());
        
        menuFile.add(new MenuItem("Open..."));
        mBar.add(menuFile);
        mBar.add(menuEdit);
        mBar.add(menuHelp);
        menuFile.add(menuItemClose);
        
        buttons[0].addActionListener((new CloseBehaviour()));

        fr.setMenuBar(mBar);
        fr.setSize(500,500);
        fr.pack();
        fr.setVisible(true);
        
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
        } });

        
        
        
    }
    
}


