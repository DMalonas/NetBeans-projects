
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimit
 */
public class Server {
        private LinkedHashMap<String, String> hashMapNames;

    /**
     * Constructor will just initialise the HashMap lookup table on the Server.
     */
    public Server() {
        initHashMap();
    }

    /**
     * Let's just hard-code a simple HashMap<Keys, Values> to act as a lookup
     * table for the data to send.
     */
    public void initHashMap() {
        hashMapNames = new LinkedHashMap();
        hashMapNames.put("Fred Smith", "F.Smith@cov.ac.uk");

        System.out.println("Server: HashMap done.");
    }

    
    
    public void addToHashMap(String userName, String password){
        hashMapNames.put(userName, password);
    }
    
    void printHashMapTable(){
       System.out.println("        \n\n\n");
        Iterator it = hashMapNames.entrySet().iterator();
         for(Map.Entry<String, String> studentEntry : hashMapNames.entrySet()){
            System.out.println(studentEntry.getKey() +" :: "+ studentEntry.getValue());
         }
   
    }


    public static void main(String args[]) {
        Server simpleServer = new Server();
    }

   
    
}
