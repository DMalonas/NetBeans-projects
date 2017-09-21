/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package framedemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
    public static void main(String[] args) {

        Frame fr = new Frame("Hello World");
        fr.setLayout(new BorderLayout());
        //fr.setLayout(new FlowLayout(FlowLayout.LEFT));
        //fr.setLayout(new GridLayout(3, 2));
        Panel topPanel = new Panel();
        Panel bottomPanel = new Panel();
        //topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.setLayout(new BorderLayout());
        topPanel.setSize(200, 200);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        fr.add(BorderLayout.CENTER, topPanel);
        fr.add(BorderLayout.SOUTH, bottomPanel);
        
        MenuBar mBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        Menu menuHelp = new Menu("Help");
        menuFile.add(new MenuItem("Open..."));
        MenuItem menuItemClose = new MenuItem("Exit");
        menuItemClose.addActionListener(new CloseBehaviour());
        menuFile.add(menuItemClose);
        mBar.add(menuFile);
        mBar.add(menuEdit);
        mBar.add(menuView);
        mBar.add(menuHelp);
        fr.setMenuBar(mBar);

        bottomPanel.add(new TextArea("TextArea", 5, 20));
        bottomPanel.add(new TextField("TextField"));
        bottomPanel.add(new Checkbox("Checkbox"));
        Choice option = new Choice();
        option.addItem("Choice Item 1");
        option.addItem("Choice Item 2");
        bottomPanel.add(option);
        
        final MyCanvas can = new MyCanvas();
        
        Button buttons[] = new Button[5];
        for (int i = 0; i <= 4; i++) {
            buttons[i] = new Button("Button " + i);
        } // end of for loop
        buttons[0].addActionListener(new CloseBehaviour());
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                can.repaint();
            }
        });
        topPanel.add(BorderLayout.NORTH, buttons[0]);
        topPanel.add(BorderLayout.SOUTH, buttons[1]);
        topPanel.add(BorderLayout.CENTER, can);
        topPanel.add(BorderLayout.EAST, buttons[2]);
        topPanel.add(BorderLayout.WEST, buttons[3]);
        bottomPanel.add(buttons[4]);
        //fr.pack(); // preferred size of subcomponents
        fr.setSize(500, 300);
        fr.setVisible(true);

        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
    } // end of main method
} // end of class FrameDemo
