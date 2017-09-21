import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Testing
{
  int counter = 0;
  JPanel panel = new JPanel();
  public void buildGUI()
  {
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    addButton();
    JButton btn = new JButton("Add Button");
    JFrame f = new JFrame();
    f.getContentPane().add(new JScrollPane(panel));
    f.getContentPane().add(btn,BorderLayout.SOUTH);
    f.setSize(400,300);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    btn.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        addButton();
      }
    });
  }
  public void addButton()
  {
    panel.add(new JButton(""+counter));
    counter++;
    panel.revalidate();//these two lines are the most imoportant
    panel.repaint();//must be called when adding to or removing from a visible container
  }
  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new Testing().buildGUI();
      }
    });
  }
}