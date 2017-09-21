/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf;

/**
 *
 * @author Dimitrios
 */
public class Adf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char ampersand = '@';
        String email_address = "meme@me.com";
        
        int result;
        result = email_address.indexOf(ampersand);
        
        System.out.println(result);
    }
    
}
