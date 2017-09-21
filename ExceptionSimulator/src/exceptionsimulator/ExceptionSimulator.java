
package exceptionsimulator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionSimulator {

    public static String readLineFromFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }  catch(IOException e) {
            System.out.println("Exception : " + e);
        }
        finally { 
            if(br!=null) br.close();
        }
    }

    public static void main(String[] args) {
        readLineFromFile("opa.txt")
        
    }
    
}
