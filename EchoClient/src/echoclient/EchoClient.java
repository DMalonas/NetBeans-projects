
package echoclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class EchoClient {


    public static void main(String[] args) throws IOException {
        
        if( 2 != args.length ){
            System.err.println("Usage: java EhcoClient <host name> <port number>");
            System.exit(1);
        }
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);
        
        try(
                Socket echoSocket = new Socket(hostName, portNumber);
                PrintWriter out = new PrintWriter( echoSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                    new InputStreamReader( echoSocket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(
                    new InputStreamReader(System.in));
            ){
            String userInput;
            while( (userInput = stdIn.readLine() ) != null ){
                out.println(userInput);
                System.out.println("Echo" + in.readLine());
            }}
            catch(IO e ){
                System.err.println("Hostname" + hostname + "was not identified");
                System.exit(1);
            }
            catch(Host e){
                System.err.println("IO does not established");
                System.exit(1);
            }
        }
  }
            
  