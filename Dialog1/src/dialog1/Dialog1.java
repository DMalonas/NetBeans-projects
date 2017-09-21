
package dialog1;


import javax.swing.JOptionPane;
/**
 *Printing multiple lines in a dialog box
 * @author Dimitrios
 */
public class Dialog1 
{ 
    public static void main(String[] args) 
    {
        String name; 
        String message;
        int value;
        
        //prompt to enter name
        name = JOptionPane.showInputDialog("What is your name?");
        //create msg
        message = String.format("Welcome, %s, to Java Programming!", name);
        //dipslay msg 
        JOptionPane.showMessageDialog(null , message);
        
        value = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
        
      
    }
    
}





