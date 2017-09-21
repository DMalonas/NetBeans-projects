package client1;

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

public class Client1 extends Frame implements ActionListener{
    TextField userName, emailAddress;
    Button quit, start;
    
    Socket s;
    InputStream is = null;
    OutputStream os = null; 
    PrintWriter pw = null; 
    BufferedReader br = null;
    
    public Client1(String title){
        super(title);
        quit = new Button("Quit");
        start = new Button("Start");
        userName = new TextField("User Name");
        emailAddress = new TextField("Email Address"); 
        setLayout(new GridLayout(4,2));
        add(new Label("User Name"));
        add(userName);
        add(new Label("emailAddress"));
        add(emailAddress);
        add(start);
        add(quit);
        
        try {
            s = new Socket("127.0.0.1", 2500);
            is = s.getInputStream();
            os = s.getOutputStream();
            pw = new PrintWriter(os,true);
            br = new BufferedReader(new InputStreamReader(is)); 
            
            } catch(IOException e){
                System.out.println("Problem connecting expection occured: " +e);
            }
        
       start.addActionListener(this);
       quit.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        String buttonTest = ae.getActionCommand();
        String typedName; 
        String receivedAddress; 
        
        try{
            if(buttonTest.equals(quit)){
                System.out.println("Exit server");
                is.close();
                os.close();
                pw.close();
                br.close();
                s.close();
                System.exit(0);
            }
            if(buttonTest.equals(start)){
            
            }
        } catch(IOException e){
            System.out.println("Exception occured:" + e);
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}
