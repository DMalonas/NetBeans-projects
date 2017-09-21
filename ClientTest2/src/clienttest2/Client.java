
package clienttest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramSocket;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Client extends JFrame
{
    private JTextField enterField;
    private JTextArea displayArea;
    private DatagramSocket socket;
    
    
    public Client()
    {
         super( "Client ");
        
        enterField = new JTextField();
        enterField.addActionListener(
            new ActionListener()
            {
                //send message to server
                public void actionPerformed( ActionEvent event )
                {
                    try
                    {
                        String message = event.getActionCommand();
                        displayArea.append("Sending packet containing: " +
                                message + "\n");
                        byte[] data = message.getBytes();
                        displayArea.append("Packet sent\n" );
                        
                    }
                    catch( IOException ioException )
                    {
                                
                    }
                }
            }
        );
}
