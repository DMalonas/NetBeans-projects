
package ClientExampleRJR;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ClientExampleRJR extends Frame implements ActionListener {

    private TextField userName;
    private TextField emailAddress;
    private Button startProcessing;
    private Button quit;
    private InputStream is = null;
    private OutputStream os = null;
    private PrintWriter pw = null;
    private BufferedReader br = null;
    private Socket s;
    
    
    public ClientExampleRJR (String title) {
       super(title);
       this.userName = new TextField(10);
       this.emailAddress = new TextField(20);
       this.startProcessing = new Button("Start");
       this.quit = new Button("Quit");
       this.setLayout(new GridLayout(4,1));
       this.add(new Label("User Name"));
       this.add(userName);
       this.add(new Label("Email Address"));
       this.add(emailAddress);
       this.add(startProcessing);
       this.add(quit);
       this.setSize(150,300);
       this.setVisible(true);
       
       this.startProcessing.addActionListener(this);
       this.quit.addActionListener(this);
    
    
       try {
           this.s = new Socket("127.0.0.1", 2000);
           this.is = s.getInputStream();
           this.os = s.getOutputStream();
           this.pw = new PrintWriter(os, true);
           this.br = new BufferedReader(new InputStreamReader(is));
       } catch (IOException e) {
           System.out.println("Error connecting with the Server " + e);
       }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String buttonTest = ae.getActionCommand();
        String typedName; 
        String receivedAddress;
        try {
            if (buttonTest.equals("Quit")) {
            System.out.println("Exiting from Server");
            this.pw.println("Exit");
            this.is.close();
            this.os.close();
            this.pw.close();
            this.br.close();
            this.s.close();
            System.exit(0);
            }
            if (buttonTest.equals("Start")) {
                typedName = this.userName.getText();
                this.pw.println(typedName);
                receivedAddress = this.br.readLine();
                this.emailAddress.setText(receivedAddress);
            }
        } catch (IOException ex) {
            System.out.println("Problem contacting the server to send/receive");
        }
    }
    
    public static void main(String[]args) {
        new ClientExampleRJR("Client Example RJR");
    }
    
    
    
    
}
