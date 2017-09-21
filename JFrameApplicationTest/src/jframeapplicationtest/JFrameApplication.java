
package jframeapplicationtest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class JFrameApplication extends JFrame {
    
    
    public JFrameApplication() {
        final JFrame fr = new JFrame("Swing JFrame");

        JLabel textLabel = new JLabel("Swing JLabel");
        fr.add(textLabel, BorderLayout.NORTH);
        
        final MyTableModel model = new MyTableModel();
        JTable myTable = new JTable(model);
        
        JScrollPane scroller = new
                JScrollPane(myTable,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        fr.add(scroller, BorderLayout.CENTER);
        
        JButton load = new JButton("Load from Database");
        load.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                model.loadFromDatabase();
            }
        });
        fr.add(load, BorderLayout.SOUTH);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(
        JFrame.DISPOSE_ON_CLOSE);      
    }
}
