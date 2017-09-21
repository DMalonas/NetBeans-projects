package Server;

import Both.Parcel;
import java.io.*;
import java.util.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * SimpleServer can only handle one client's requests at a time i.e. the first
 * client must disconnect from the server before the second client can connect.
 *
 * @author Chris Bass
 * @date 06/04/2016
 */
public class SimpleServer {

    private HashMap<String, String> hashMapNames;

    /**
     * Constructor will just initialise the HashMap lookup table on the Server.
     */
    public SimpleServer() {
        initHashMap();
    }

    /**
     * Let's just hard-code a simple HashMap<Keys, Values> to act as a lookup
     * table for the data to send.
     */
    private void initHashMap() {
        hashMapNames = new HashMap();
        hashMapNames.put("Fred Smith", "F.Smith@cov.ac.uk");
        hashMapNames.put("Joe Bloggs", "J.Bloggs@cov.ac.uk");
        hashMapNames.put("Pat Lunch", "P.Lunch@cov.ac.uk");
        hashMapNames.put("Cherie Bakewell", "C.Bakewell@cov.ac.uk");
        hashMapNames.put("Jamie Dodger", "@J.Dodgercov.ac.uk");
        hashMapNames.put("Victoria Sponge", "V.Sponge@cov.ac.uk");
        hashMapNames.put("Marsha Mallow", "M.Mallow@cov.ac.uk");

        System.out.println("Server: HashMap done.");
    }

    /**
     * Wait until a client connects to the server on a port, then establish the
     * connection via a socket object and handle the client's requests.
     */
    private void connectToClients() {
        System.out.println("Server: Server starting.");

        try (ServerSocket serverSocket = new ServerSocket(2000)) {
            int connectionCount = 0;
            
            while (true) {
                System.out.println("Server: Waiting for connecting client...");
                try (
                    Socket socket = serverSocket.accept();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                ) {
                    connectionCount++;
                    System.out.println("Server: Connection " + connectionCount + " established.");

                    // Read and process names until an exception is thrown.
                    System.out.println("Server: Waiting for data from client...");
                    Parcel parcelRead;
                    
                    while ((parcelRead = (Parcel)objectInputStream.readObject()) != null) {
                        System.out.println("Server: Read data from client: " + parcelRead + ".");
                        
                        String emailLookup = hashMapNames.getOrDefault(parcelRead.getUsername(), "User not known");
                        
                        objectOutputStream.writeObject(new Parcel(parcelRead.getUsername(), emailLookup));
                    }
                } catch (SocketException | EOFException ex) {
                    System.out.println("Server: We have lost connection to client " + connectionCount + ".");
                } catch (ClassNotFoundException ex) {
                    System.out.println("Server: Class of a serialized object cannot be found.");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SimpleServer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Server: Closed down");
        }
    }

    public static void main(String args[]) {
        SimpleServer simpleServer = new SimpleServer();
        simpleServer.connectToClients();
    }

}
