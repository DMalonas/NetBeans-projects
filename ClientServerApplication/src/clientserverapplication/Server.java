
package clientserverapplication;

import java.io.*;
import java.util.*;
import java.net.*;
   
public class Server{
   
    public static void main(String args[]) {
        // Streams definition for connection
        InputStream is = null;
        OutputStream os = null;
  
        //Writers and readers for communication
        PrintWriter pw = null;
        BufferedReader br = null;
  
        int connectionCount = 0; // Count of clients connecting
        String lineRead = ""; // String read from client
        Object o = null; // Used for assessing the Hashtable
        String reply = ""; // Reply to be sent to the client
  
        System.out.println("Server starting");
  
        // Set up the database;
        Hashtable<String, String> names = new Hashtable();
        names.put("Fred Smith", "F.Smith@cov.ac.uk");
        names.put("Joe Bloggs", "J.Bloggs@cov.ac.uk");
        System.out.println("Database done");
  
        // Establish Server Socket
        try {
            ServerSocket ss = new ServerSocket(2000);
            while (true) {
            // Listen for a connection and return new Socket if one is made
                Socket s = ss.accept();  // Blocks until connection made
                connectionCount++;
                System.out.println("Connection " + connectionCount + " made");
                is = s.getInputStream();
                os = s.getOutputStream();
                pw = new PrintWriter(os, true);
                br = new BufferedReader(new InputStreamReader(is));
                System.out.println("System set up");
  
                //Read and process names until the client tells the server
                //the service is no longer required.
                lineRead = "";
                while (true) {
                    lineRead = br.readLine();
                    if (lineRead.equals("Exit")) {
                        break;
                    }
                    o = names.get(lineRead);
                    if (o == null) {
                        reply = "User not known";
                    } else {
                        reply = (String) o;
                    }
                    pw.println(reply);
                }
                pw.close();
                br.close();
                is.close();
                os.close();
                System.out.println("Closed down");
            }
        } catch (IOException e) {
            System.out.println("Trouble with connection" + e);
        }
    }  // end of main method
}  // end of SeverExample class