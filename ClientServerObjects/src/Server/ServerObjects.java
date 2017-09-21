
package Server;

import Client.GUIData;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ServerObjects {  // Transfer whole objects example

   private ServerSocket ss = null;
   private Socket s = null;
   private GUIData dataObj = null;      // Object for communication with server   
   private ObjectInputStream objIS = null; // Streams definition for connection
   private ObjectOutputStream objOS = null;

   public static void main(String args[]) {
      new ServerObjects();
   }  // end of main method

   public ServerObjects() {
      this.run();
   }  // end of ServerExample2 constructor

   public void run() {
      int connectionCount = 0; // Count of clients connecting
      String lineRead = "";    // String read from client
      Object dbObj = null;     // Used for assessing the Hashtable
      String reply = "";       // Reply to be sent to the client

      System.out.println("Example 2 Server starting");      
      HashMap<String, String> names = new HashMap();  // Set up the database
      names.put("Fred Smith", "F.Smith@cov.ac.uk");
      names.put("Joe Bloggs", "J.Bloggs@cov.ac.uk");
      System.out.println("Database done");
      
      try {  // Establish Server Socket
         this.ss = new ServerSocket(2000);
         while (true) {
            this.s = ss.accept();
            connectionCount++;
            System.out.println("Connection " + connectionCount + " made");
            this.objOS = new ObjectOutputStream(this.s.getOutputStream());
            this.objIS = new ObjectInputStream(this.s.getInputStream());
            System.out.println("System set up\n");
            
            lineRead = "";
            while (true) {  //Read and process names until the client exits
               try {
                  this.dataObj = (GUIData) this.objIS.readObject();
                  lineRead = this.dataObj.getData1();
                  System.out.printf("Data Obj Line Read = %s\n\n", lineRead);
               } catch (Exception e) {
                  System.out.printf("\nCan't get client's Data Obj: %s\n", e);
               }  // end try getting client data

               if (lineRead.equals("Exit")) {
                  break;
               }  // end if client exits

               dbObj = names.get(lineRead);  // search database
               if (dbObj == null) {
                  reply = "User not known";
               } else {
                  reply = (String) dbObj;
               }  // if search key exists in database
               
               this.dataObj.setData2(reply);
               System.out.printf("Sending [%s] to Client 2\n", reply);
               this.objOS.writeObject(this.dataObj);
               this.objOS.flush();
            }  // end while client sending data
            
            this.objIS.close();
            this.objOS.close();
            System.out.println("Client has closed down");
         }  // end while client connected
         
      } catch (IOException e) {
         System.out.println("Trouble with connection: " + e);
      }  // end try connecting to client
   }  // end run method
}  // end ServerExample2 class