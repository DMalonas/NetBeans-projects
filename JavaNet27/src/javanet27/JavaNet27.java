
package javanet27;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;



public class JavaNet27 {
    
    
    
    
    public static void main(String[] args) throws IOException {
      //  generateCharacters2();
      File file = new File("C:\\Users\\Dimit\\Documents\\NetBeansProjects"
              + "\\JavaNet27\\src\\javanet27\\Archy.txt");
        String content = "This is the text content";
      
        try (FileOutputStream fop = new FileOutputStream(file)){
            if (!file.exists()) {
              file.createNewFile();
            }
      
      
            byte[] contentIntBytes = content.getBytes();
            fop.write(contentIntBytes);
            fop.flush();
            fop.close();
            System.out.println("Done");
      
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        File file2 = new File("C:\\Users\\Dimit\\Documents\\NetBeansProjects\\JavaNet27\\src\\javanet27\\WriteMe.txt");
        
        String contentOfFile = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dimit\\Documents\\NetBeansProjects\\JavaNet27\\src\\javanet27\\Archy.txt")));
        try (FileOutputStream fop = new FileOutputStream(file2)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            
           byte[] contentIntBytes = contentOfFile.getBytes();
           fop.write(contentIntBytes);
           fop.flush();
           fop.close();
           System.out.println("Done2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    /*
    ** Page 27
    */
    public static void generateCharacters() throws IOException {
        
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72; 
        
        int start = firstPrintableCharacter;
        while(true){
            for (int i = start; i <  start + numberOfCharactersPerLine; i++) {
                out.write((
                    (i - firstPrintableCharacter) % numberOfPrintableCharacters)
                     + firstPrintableCharacter);
            }
            out.write('\r');
            out.write('\n');
            start = ((start + 1) - firstPrintableCharacter) 
                    % numberOfPrintableCharacters + firstPrintableCharacter;
        }
    }
    
    
    
    
    /*
        Page 28 
    */
              
    public static void generateCharacters2()
                throws IOException {
        
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;
        int start = firstPrintableCharacter;
        byte[] line = new byte[numberOfCharactersPerLine +2];
        // the +2 is for the carriage return and linefeed
        
        while(true) {
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                line[i - start] = (byte) ((i - firstPrintableCharacter)
                    % numberOfPrintableCharacters + firstPrintableCharacter);
            }
            line[72] = (byte) '\r'; //carriage return
            line[73] = (byte) '\n'; //line feed
            out.write(line);
            start= ((start + 1) - firstPrintableCharacter)
                    % numberOfPrintableCharacters + firstPrintableCharacter;
        }
    }

   

  
}
