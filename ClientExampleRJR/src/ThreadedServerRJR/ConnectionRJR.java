
package ThreadedServerRJR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;




public class ConnectionRJR implements Runnable{
    
    private Socket s; 
    private HashMap<String, String> names;
    private InputStream is = null;
    private OutputStream os = null;
    private PrintWriter pw = null;
    private BufferedReader br = null;
    private String lineRead = "";
    private Object jObj;
    private String reply = "";

    ConnectionRJR(Socket s, HashMap<String, String> names) {
        this.s = s;
        this.names = names;
    }

    @Override
    public void run() {
        
        try {
            this.is = this.s.getInputStream();
            this.os = this.s.getOutputStream();
            this.pw = new PrintWriter(this.os, true);
            this.br = new BufferedReader(new InputStreamReader(this.is));
            System.out.println("RJR Threaded system set up");
        
            this.lineRead = "";
            while (true) {
                this.lineRead = this.br.readLine();
                if (this.lineRead.equals("Exit")) {
                    break;
                }
                this.jObj = names.get(this.lineRead);
                if (this.jObj == null) {
                    this.reply = "User not known";
                } else {
                    this.reply = (String) this.jObj;
                }
                this.pw.println(this.reply);
            }
            this.pw.close();
            this.br.close();
            this.is.close();
            System.out.println("RJR Connection Closed down");
        }   catch (IOException e) {
            System.out.println("Trouble with connection to client" + e);
        }
    }
}
