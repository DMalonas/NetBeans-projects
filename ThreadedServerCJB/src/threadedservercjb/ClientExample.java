 
package threadedservercjb;

import java.lang.String;
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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;



public class ClientExample extends Frame implements ActionListener{


    
        
        TextField userName, emailAddress;
        Button startProcessing, quit;
        
        InputStream is = null;
        OutputStream os = null; 
        PrintWriter pw = null;
        BufferedReader br = null;
        Socket s;
        
        ClientExample(String title) {
            super(title);
            userName = new TextField(10);
            emailAddress = new TextField(20);
            startProcessing = new Button("Start");
            quit = new Button("Quit");
            setLayout(new GridLayout(4,1));
            add(new Label("User Name"));
            add(userName);
            add(new Label("Email Address"));
            add(emailAddress);
            add(startProcessing);
            add(quit);
            setSize(150, 300);
            setVisible(true);
            
            startProcessing.addActionListener(this);
            quit.addActionListener(this);
            
            try{
                s=new Socket("127.0.0.1", 2000);
                is = s.getInputStream();
                os = s.getOutputStream();
                
                pw = new PrintWriter(os, true);
                br = new BufferedReader(new InputStreamReader(is));
            }
            catch(IOException e) {
                System.out.println("Error connecting wth the Server " +e);
            }
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            String buttonTest = ae.getActionCommand();
            String typedName;
            String receivedAddress;
            try{
                if(buttonTest.equals("Quit")){
                    pw.println("Exiting from Server");
                    pw.println("Exit");
                    is.close();
                    os.close();
                    pw.close();
                    br.close();
                    s.close();
                    System.exit(0);
                }
                if (buttonTest.equals("Start")) {
                   typedName = userName.getText();
                   
                   pw.println(typedName);
                   
                   receivedAddress = br.readLine();
                   
                   emailAddress.setText(receivedAddress);
                }

            }
            catch(IOException e){
                System.out.println("Problem contacting the server to send/receive");
            }   

 
        }
        
        public static void main(String[] args){
            ClientExample c = new ClientExample("Client Example");
    }

}