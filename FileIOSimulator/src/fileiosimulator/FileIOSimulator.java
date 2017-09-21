
package fileiosimulator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIOSimulator {


    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        BufferedReader br2 = null;
        
        
        
        
        
        try {
            String mycontent = "Write something to this file";
            
            //Specify the file name and path here
            File file = new File("C:\\Users\\Dimit\\Documen"
                    + "ts\\OOP\\S5\\myFile.txt");

            /* This logic will make sure that the file 
            * gets created if it is not present at the
            * specified location*/
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.append(mycontent);
            System.out.println("File written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
	}
	finally
	{ 
            try{
                if(bw!=null)
		bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
	    }
        }
        
        
        
        try{	
           br = new BufferedReader(new FileReader("C:\\Users\\Dimit\\D"
                   + "ocuments\\OOP\\S5\\myFile.txt"));		

           //One way of reading the file
	   System.out.println("Reading the file using readLine() method:");
	   String contentLine = br.readLine();
	   while (contentLine != null) {
	      System.out.println(contentLine);     
	      contentLine = br.readLine();
	   }

        } 
        catch (IOException ioe) 
        {
	   ioe.printStackTrace();
        } 
        finally 
        {
	    try {
	        if (br != null)
                    br.close();
	    } 
	    catch (IOException ioe) 
            {
		System.out.println("Error in closing the BufferedReader");
	    }
	}
    }
}
