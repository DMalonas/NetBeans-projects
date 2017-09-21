
package TheServerr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;


public class ConnectionCJB implements Runnable{

    private Socket s;
    private Hashtable names;
    
    ConnectionCJB(Socket s, Hashtable names) {
        this.s = s;
        this.names = names;
    }
    
    @Override
    public void run() {
        InputStream is = null;
        OutputStream os = null;
        
        PrintWriter pw = null;
        BufferedReader br = null;
        
        String lineRead = "";
        Object o;
        String reply = "";
    
    
        try {
            is = s.getInputStream();
            os = s.getOutputStream();
            pw = new PrintWriter(os, true);
//            br = new BufferedReader(new InputStreamReader(is));
            System.out.println("CJB System set up");
            
            lineRead = "";
            while(true) {
                lineRead = br.readLine();
                if (lineRead.equals("Exit")) 
                     break;
                o = names.get(lineRead);
                if(o == null)
                    reply = "User not known";
                else
                    reply = (String) o;
                pw.println(reply);
            }
            pw.close();
            br.close();
            is.close();
            os.close();
            System.out.println("Closed down");
        } catch (IOException e) {
            System.out.println("Trouble with connection to client " + e );
        }
    }
    
}
