/* CJB A threaded server.
 Two classes are now used together with the Runnable Interface.

 The first class (Connection) is threaded and handles the
 reading and writing between the clients.

 The second class ThreadedServer creates the database and starts the threads
 as clients try to connect.

 27th March 02
*/


import java.io.*;
import java.util.*;
import java.net.*;


public class ThreadedServerCJB{

  public static void main(String[] args){
    int connectionCount=0;  // Count of clients connecting
    Thread connThread=null;
    System.out.println("CJB Server starting");

     // Set up the database;
     Hashtable names=new Hashtable();
     names.put("Fred Smith","F.Smith@cov.ac.uk");
     names.put("Joe Bloggs","J.Bloggs@cov.ac.uk");
     System.out.println("Database done");

     try {
      ServerSocket ss= new ServerSocket(2000);
          while(true){
           Socket s=ss.accept();
           connectionCount++;
           System.out.println("Connection "+connectionCount+" made");

           //Create and start thread to process client requests
           connThread=new Thread(new ConnectionCJB(s,names));
           connThread.start();
          }
      }
      catch(IOException e){
        System.out.println("Trouble making a connection"+e);
      }
  }

}


