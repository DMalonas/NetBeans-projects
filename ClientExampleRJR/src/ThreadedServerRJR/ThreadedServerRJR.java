
package ThreadedServerRJR;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;


public class ThreadedServerRJR {
    
    private ServerSocket ss = null;
    private Socket s = null;
    private int clientCount = 0;
    private int connectionNum = 0;
    private Thread connThreads[];
    private HashMap<String, String> names = null;
    
    public ThreadedServerRJR() {
        this.connThreads = new Thread[50];
        this.doServing();
    }
    
    
    public void doServing() {
        
        System.out.println("RJR Threaded server starting");
        
        this.names = new HashMap();
        this.names.put("Fred Smith", "F.Smith@cov.ac.uk");
        this.names.put("Joe Bloggs", "J.Bloggs@cov.ac.uk");
        System.out.println("Database done");
    
        try {
            this.ss = new ServerSocket(2000);
            while (true) {
                this.s = ss.accept();
                this.clientCount++;
                System.out.println("Connection " + this.connectionNum +
                        " made: " + this.clientCount + " Clients connected");
                this.connThreads[this.connectionNum] = new Thread(new ConnectionRJR(s, names));
                this.connThreads[this.connectionNum].start();

                for (int i = 0; i < this.connectionNum; i++) {
                    if (!this.connThreads[i].isAlive()) {
                        this.clientCount--;
                        System.out.println("Connection " + i + " dead: "
                                + this.clientCount + " Clients connected");
                    }
                }
                this.connectionNum++;
            }
        }   catch (IOException e) {
            System.out.println("Trouble making a connection " + e);        
        }
    }
    
    public static void main(String[] args) {
        new ThreadedServerRJR();
    } 
}
