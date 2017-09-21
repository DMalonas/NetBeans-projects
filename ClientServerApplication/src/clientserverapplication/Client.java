
package clientserverapplication;



import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Client extends Frame implements ActionListener {

    TextField userName, emailAddress;
    Button startProcessing, quit;

    InputStream is = null;
    OutputStream os = null;
    PrintWriter pw = null;
    BufferedReader br = null;
    Socket s;

    Client(String title) {
        super(title);
        userName = new TextField(10);
        emailAddress = new TextField(20);
        startProcessing = new Button("Start");
        quit = new Button("Quit");
        setLayout(new GridLayout(4, 1));
        add(new Label("User Name"));
        add(userName);
        add(new Label("Email Adress"));
        add(emailAddress);
        add(startProcessing);
        add(quit);
        setSize(150, 300);
        setVisible(true);

        startProcessing.addActionListener(this);
        quit.addActionListener(this);

        // Set up connection to the server on the loop back address
        // and the same port number as the Server is expecting
        try {
            s = new Socket("127.0.0.1", 2000);
            is = s.getInputStream();
            os = s.getOutputStream();

            pw = new PrintWriter(os, true);
            br = new BufferedReader(new InputStreamReader(is));
        } catch (IOException e) {
            System.out.println("Error connecting wth the Server  " + e);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String buttonTest = ae.getActionCommand();
        String typedName;
        String receivedAddress;
        try {
            if (buttonTest.equals("Quit")) {
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

                // Send to Server
                pw.println(typedName);

                // Receive reply
                receivedAddress = br.readLine();

                emailAddress.setText(receivedAddress);
            }
        } catch (IOException e) {
            System.out.println("Problem contacting the server to send/receive");
        }
    }

    public static void main(String[] args) {
        new Client("Client Example");
    }

}
