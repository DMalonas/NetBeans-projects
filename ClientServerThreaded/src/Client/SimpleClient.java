package Client;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client with a single window frame. Sends a username as a String to
 * server and receives email address String as reply.
 *
 * @author Chris Bass
 * @date 06/04/2016
 */
public class SimpleClient extends Frame {

    private Button buttonConnect;
    private Label labelStatus;
    private TextField textFieldUsername;
    private TextField textFieldEmail;
    private Button buttonSend;

    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private Socket socket;

    /**
     * Constructor will just initialise the AWT Frame and GUI.
     */
    public SimpleClient() {
        super();
        initGUI();
    }

    /**
     * Initialise Simple Client GUI using AWT library
     */
    private void initGUI() {
        this.setTitle("Simple Client");
        buttonConnect = new Button("Connect to Server");
        labelStatus = new Label("Status: Initialising GUI");
        textFieldUsername = new TextField(20);
        textFieldEmail = new TextField(20);
        buttonSend = new Button("Send to Server");

        this.setLayout(new GridLayout(4, 2));

        this.add(buttonConnect);
        this.add(labelStatus);
        this.add(new Label("Username to send to server:"));
        this.add(textFieldUsername);
        this.add(new Label("Email address reply from server:"));
        this.add(textFieldEmail);
        this.add(buttonSend);
        this.setSize(700, 300);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                closeConnection();
                System.exit(0);
            }
        });

        buttonConnect.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reconnectToServer();
            }

        });

        buttonSend.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToServer();
            }

        });
    }

    /**
     * Close the connection to server.
     */
    private void closeConnection() {
        if (socket != null) {
            labelStatus.setText("Status: closing connection");
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                socket = null;
            }
        }
    }

    /**
     * Send username to server and get reply.
     */
    private void sendToServer() {
        if (printWriter != null && bufferedReader != null) {

            // 1. read data from textfield
            String toSend = textFieldUsername.getText();

            // 2. send data to server
            printWriter.println(toSend);

            // 3. recieve reply from server
            String reply = null;
            labelStatus.setText("Status: waiting for reply from server");
            try {    
                reply = bufferedReader.readLine();
                labelStatus.setText("Status: received reply from server");

            } catch (IOException ex) {
                labelStatus.setText("IOException " + ex);
            }

            // 4. display message on textarea
            textFieldEmail.setText(reply);

        } else {
            labelStatus.setText("You must connect to the server first!!");
        }
    }

    /**
     * Setup connection to the server on the loop back address and the same port
     * number as the Server is expecting.
     */
    private void reconnectToServer() {
        closeConnection();
        labelStatus.setText("Status: Attempting connection to server");
        try {
            socket = new Socket("127.0.0.1", 2000);

            printWriter = new PrintWriter(socket.getOutputStream(), true);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            labelStatus.setText("Status: Connected to server");
        } catch (IOException ex) {
            Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            labelStatus.setText(ex.toString()); // connection failed
        }
    }

    public void keepReadingFromServer() {
        while (true) {
            try {
                String message = bufferedReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        SimpleClient simpleClient = new SimpleClient();
    }

}
