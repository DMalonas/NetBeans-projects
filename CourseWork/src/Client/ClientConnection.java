package Client;

import Client.ClientGUI;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.awt.Window;





public class ClientConnection {
    
    private int clientNumber = 0;
    private final Object waitObject = new Object();
    
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private Socket socket;
    ClientGUI cg;


    public ClientConnection(){
        initGUI();

    }
    
    public void initGUI(){
      this.cg = new ClientGUI();
      cg.setVisible(true);  

    }


       /**
     * Close the connection to server.
     */
    private void closeConnection() {
        if (socket != null) {
            clientSays("Closing connection");
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                socket = null;
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }
    

    
    /**
     * Send username to server and get reply.
     */
    public void sendToServer(String voucherCode, String collectedInfo) {
        if (!(printWriter != null && bufferedReader != null)) {

            // 1. read data from textfield
            String toSend = collectedInfo;

            // 2. send data to server
          //  printWriter.println(toSend);

            // 3. recieve reply from server
            String reply = null;
          
          //  try {    
                reply = "12345";//bufferedReader.readLine();

 //           } catch (IOException ex) {
   //             System.out.println("Exception occured");
     //       }
          
            // 4. display message on textarea
            cg.setCodeField(reply);
                     System.out.println("BBBBBBBBBBBBBB");
      

        } else {
            System.out.println("You must connect to the server first!!");
        }
    }
    
    
    
    /**
     * Setup connection to the server on the loop back address and the same port
     * number as the Server is expecting.
     */
    private void reconnectToServer() {
        closeConnection();
        clientSays("Attempting connection to server");
        try {
            socket = new Socket("127.0.0.1", 2000);

            printWriter = new PrintWriter(socket.getOutputStream(), true);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            clientSays("Connected to server");
        } catch (IOException ex) {
            Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            clientSays(ex.toString()); // connection failed
        }
        
        // notify that the connection is back
        synchronized(waitObject) {
            waitObject.notify();
        }
    }

    /**
     * Keep reading for messages from the server and updating the GUI.
     */
    private void keepReadingFromServer() {
        int count = 0;
        while (true) {
            count++;
            
            // if we have lost connection then just pause this loop until we
            // receive notification to start running again.
            if (socket == null) {
                clientSays("Waiting for connection to be reset...");
                synchronized(waitObject) {
                    try {
                        waitObject.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            clientSays("Waiting for message" + count + " from server...");
            String reply = null;
            try {
                reply = bufferedReader.readLine();
                clientSays("Received \"" + reply + "\" from server.");
            } catch (IOException ex) {
                clientSays("IOException " + ex);
            }
            
            if (reply != null && reply.startsWith("You are client number")) {
                clientNumber = Integer.parseInt(reply.substring(21));
            } else {
           //     textFieldEmail.setText(reply);
            }
        }
    }
    
    /**
     * Private helper method outputs to standard output stream for debugging.
     * @param say the String to write to standard output stream.
     */
    private void clientSays(String say) {
        System.out.println("Client" + clientNumber + ": " + say);
      //  labelStatus.setText("Status: " + say);
    }

    public void setLabelStatus(){
    
    }

   

    public static void main(String args[]){
        ClientConnection cc  = new ClientConnection();
        
    }



    
}
