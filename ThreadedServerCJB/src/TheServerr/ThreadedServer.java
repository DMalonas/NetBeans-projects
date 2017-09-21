
package TheServerr;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;


public class ThreadedServer {
    
    
    public static void main(String[] args) {
        int connectionCount = 0;
        Thread connThread = null;
        System.out.println("CJB Server starting");
        
        Hashtable names = new Hashtable();
        names.put("Fred Smith", "F.Smith@cov.ac.uk");
        names.put("Joe Bloggs", "J.Bloggs@cov.ac.uk");
        System.out.println("Database done");
        
        try {
            ServerSocket ss = new ServerSocket(2000);
                while(true){
                    Socket s = ss.accept();
                    connectionCount++;
                    System.out.println("Connection " + connectionCount + " made");
                    
                    connThread = new Thread(new ConnectionCJB(s, names));
                    connThread.start();
                }
        }
        catch (IOException e) {
            System.out.println("Trouble making a connection " +e );
        }
    }
}
