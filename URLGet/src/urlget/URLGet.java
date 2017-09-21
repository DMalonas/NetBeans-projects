
package urlget;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Dimitrios
 */
public class URLGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        String urlString;
        if(1 == args.length)
            urlString = args[0];
        else
        {
            urlString = "http://horstmann.com/";
            System.out.println("Using " + urlString);
        }
        
        //Open connection
        
        URL u = new URL(urlString);
        URLConnection connection = u.openConnection();
        
        //check if response code is HTTP_OK (200)
        
        HttpURLConnection httpConnection = (HttpURLConnection) connection;
        int code = httpConnection.getResponseCode();
        String message = httpConnection.getResponseMessage();
        System.out.println(code + " "+ message);
        if(code != HttpURLConnection.HTTP_OK)
            return;
        
        //Read server response
        
        InputStream instream = connection.getInputStream();
        Scanner in = new Scanner(instream);
    
        while(in.hasNextLine())
        {
            String input = in.nextLine();
            System.out.println(input);
        }
    }
    
}
