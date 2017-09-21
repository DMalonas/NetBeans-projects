/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webget;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */
public class WebGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String host;
        String resource; 
        
        if(2 == args.length){
            host = args[0];
            resource = args[1];
        }
        else
        {
            System.out.println("Getting/from horstmann.com");
            host = "horstmann.com";
            resource = "/";
        }
        
        //Open socket
        final int HTTP_PORT = 80;
        Socket s = new Socket(host, HTTP_PORT);
        
        //Get Streams
        InputStream instream = s.getInputStream();
        OutputStream outstream = s.getOutputStream();
        
        //Send command 
        String command = "GET " + resource + "HTTP/1.1\n" + "Host: " +host + "\n\n";
        out.print(command);
        out.flush();
        
        //Read the server response 
        while(stdIn.hasNextLine())
        {
            String input = in.nextLine();
            System.out.println(input);
        }
        
        //Always close the socket at the end
        
        s.close();
    }
    
}
