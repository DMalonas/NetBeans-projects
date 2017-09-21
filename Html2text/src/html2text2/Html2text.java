/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html2text2;

//import the 21 classes we need
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.text.BreakIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.MutableAttributeSet;
//
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner; 
import javax.swing.JOptionPane;

/**
 *
 * @author mnemo
 */
public class Html2text {
    //Html2text class, it takes the local file, it removes the html tags, it leaves only the text
    private Html2text() {}   // constructor ...we are going to need it in main

    
    //extractText is a method of class html2text that takes the text.
    //input of extractText method is the "reader" and it has the html code. 
    //if we fail to read the file the "throws IOException" that functions as 
    //debugging it will make an error window to appear during compilation. 
    //"throws" is like a filter. 
    //extract text removes the tags so we will receive only the text in the end.
    //extract text will receive the html code and after removing the tags it 
    //will leave only pure text.
    //we will save the html ( the tags) inside the List<String>
    //List is the saving place
    //
    public static List<String> extractText(Reader reader) throws IOException {
    

//List that holds html text 
        final ArrayList<String> list = new ArrayList<String>();

    
    // the delegator is a parsing class of java
    //parseDelegator object goes inside the html code and finds the
    //tags we have asked it to find
    //everytime parserDelegator finds a tag it marks it and removes it
    //I called ParserDelegator at line 16. 
    ParserDelegator parserDelegator = new ParserDelegator();
    
    
    //parsercallback method identifies specific parameters that allow
    //the parserDelegator to read the html code, such as EndTag, StartTag etc...
    //the ParserCallback removes the tags
    ParserCallback parserCallback = new ParserCallback() {
        
        //method handleText of the ParserCallback method
        //each bit of the text has a position.
        //position 0,1,2,3... final int pos --> this parameter
        //sais we count from the first bit till the last bit of the page. 
      public void handleText(final char[] data, final int pos) {
        list.add(new String(data)); //get back the text clear from tags.
      }
      public void handleStartTag(Tag tag, MutableAttributeSet attribute, int pos) { }
      public void handleEndTag(Tag t, final int pos) {  }
      public void handleSimpleTag(Tag t, MutableAttributeSet a, final int pos) { }
      public void handleComment(final char[] data, final int pos) { }
      public void handleError(final java.lang.String errMsg, final int pos) { }
    };
    
    //the parser delegetator executes parsing inside reader and give us feedback 
    //with the use of the parameter parserCallback
    parserDelegator.parse(reader, parserCallback, true);
    //System.out.println(list); //it saves the text without html tags in list with comma delimeter
    return list;   //extractText method ends here
  }
  
  
    /**
     * @param args the command line arguments
     */
    //main 
    public final static void main(String[] args) throws Exception {
        //main class , TODO code application logic here
        //Returns a new instance of BreakIterator that locates sentence boundaries.
        //we create an iterator which counts the sentences by finding 
        //the fullstops. 
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.UK);
        
        




            


        
        
      
        
       // Scanner new_user = new Scanner(System.in);
        String Url;
       // System.out.println("Please Enter a URL below:");
        //Url = new_user.next();
        Url = JOptionPane.showInputDialog("Please Enter URL","Enter the URL Here");
        
        
        
          // run urlloader method to produce text file from url
        //urlloader method gets the URL and saves it into a locale file
        
        Html2text.urlloader(new URL(Url));
        
        
        
         //create reader object that reads our html file
         //reader object of java class FileReader reads the text1 file
        //which is produced by the line 
        //of code above. FileReader Java class is employed
        FileReader reader = new FileReader("text1.html");
        
        //apply extract text method to our file reader and save text in a list
        //call Html2text class and execute the method extractText with parameter reader
        //namely the html text
    List<String> list1 = Html2text.extractText(reader);
    List<String> list2 = new ArrayList<>();
    


//it saves the text into string, all the elements of the list are getting unitied 
//them method join creates a huge string that has all the final characters separated
//by " " 
    String htmltext = String.join(" ", list1);
    //System.out.println(lines.size());list with 2035 elements
   // for (String line : lines) {
   //   System.out.println(line);
  //  }
    //System.out.println(htmltext);
    //System.out.println(htmltext.length()); Prints number of string characters

    //break iterator, it breaks the text into strings with fullstop "." .  
    //after every fullstop a new sentence is created
      
      //Sets the iterator to analyze a new piece of text.
      //we call the iterator which will look for fullstops
     // till it will find the last one 
    //it makes iterate all the time in order to find fullstops
    //with the setText method we load the html text on the iterator
      iterator.setText(htmltext);
      
      // the iterator starts from the iterator property "first()"
      int start = iterator.first();
      
      
      String inputLine2;
      
      String fileName = "text2.html";    //final result
    	       		File file2 = new File(fileName);  //we create a file called "file2"
                                                          //so we will save the final text inside  
                                                            //the text2.hmtl - which is file2
 
			if (!file2.exists()) {
				file2.createNewFile();
			}
                        
                        //read the file2 
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
           //use FileWriter to write file2
			FileWriter fw2 = new FileWriter(file2.getAbsoluteFile());
			
                        //bw2 holds data that will be written inside file2
                        //it holds memory spots 
                        BufferedWriter bw2 = new BufferedWriter(fw2);
            //while readline reads lines, it assings   
//			while ((inputLine2 = br2.readLine()) != null) {
//				bw2.write(inputLine2);
//			}     
      //loop over htmltext to produce sentences with period 
      //below follows the process for writing inside the text2.html aka file2
      //we use iterator and every time the iterator finds a fullstop it creates a
      //sentence which throws inside text2.html
      //for loop in order to load the sentenecs inside file2
      //html sentences are fetched from the String htmltext
      //we write the senctences to buffer bw2 and then
      //we write contents of the buffer inside the file2
      for (int end = iterator.next();
        end != BreakIterator.DONE;
        start = end, end = iterator.next()) {       //start is where I found the first "." and end where I found the last ".".
        //it separates the text sentences based on the fullstop 
            //List that holds html text sentences
          //list2.add(htmltext.substring(start,end));
         // System.out.println(htmltext.substring(start,end));
          //it writes the sentence in the file2  
          bw2.write(htmltext.substring(start,end));
          bw2.newLine();
        }
      //System.out.println(list2.size());
          bw2.close();
          System.out.println("file holding sentences from url page is now created");
      
    }
    
    public static void  urlloader(URL url) {
      //method urlloader ,  it takes the url - html code and it saves it inside local file
        
        //URL url;
 
		try {
			// get URL content 
                       // url = new URL("https://console.ng.bluemix.net/");
			URLConnection conn = url.openConnection();  //the connection with url begins
 
			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream())); 
                         //InputStreamReader decodes the information
                        //con.getInputStream( it reads the html code
 
			String inputLine;
 
			//save to this filename 
                        //save to local file text1.html
			String fileName = "text1.html";
			File file = new File(fileName);
 
			if (!file.exists()) {
				file.createNewFile();  //create text1.html if it does not exist
			}
 
			//use FileWriter to write input stream to file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
                        //while buffer br reads the InputStream line by line then it writes
                        //when there are no line then while ends and bw and br close
			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);
			}
 
			bw.close();
			br.close();
 
			System.out.println("file holding html from url page is now created");
 
		} catch (MalformedURLException e) {     //exception handler
			e.printStackTrace();
		} catch (IOException e) {               //exception handler
			e.printStackTrace();
		}
   }
    
    
}
