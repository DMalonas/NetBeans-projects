
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client extends Frame{
    
    private TextField textFieldUsername;
    private TextField textFieldEmail;
    private Button jButtonAdd, jIteratorButton;
    Server s = new Server();



    public Client(){
        super();
        initGUI();
    }
        


    private void initGUI() {
        

        this.setTitle("Add Button Demonstration");
        jIteratorButton = new Button("Print HashMap");
        jButtonAdd = new Button("ADD");
        textFieldUsername = new TextField(20);
        textFieldEmail = new TextField(20);
        
        this.setLayout(new GridLayout(3, 2));
        
        this.add(jButtonAdd);
        this.add(jIteratorButton);
        this.add(new Label("Username to add to Hashtable:"));
        this.add(textFieldUsername);
        this.add(new Label("Email address to add to Hashtable:"));
        this.add(textFieldEmail);
        this.setSize(700, 300);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
               // closeConnection();
                System.exit(0);
            }
        });
        
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToHashTable();
            }

        });
        
        jIteratorButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                callPrintHashMapTable();
            }

        });
    }
  
    public void addToHashTable() {
        
            String usernameToSend = textFieldUsername.getText();
            String passwordToSend = textFieldEmail.getText();
            s.addToHashMap(usernameToSend,passwordToSend);
            System.out.println(""+ usernameToSend + " " + passwordToSend + " added");
    }
    
    

    
         public void callPrintHashMapTable() { 
             
             s.printHashMapTable();
         }
    public static void main(String[] args) {
        Client c = new Client();
    }
    
}
