/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openstream;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */
public class OpenStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        String address = "http://stackoverflow.com/questions/31603172/java-for-embedded-systems";
        URL u = new URL(address);
        Scanner in = new Scanner(u.openStream());
    }
    
}
