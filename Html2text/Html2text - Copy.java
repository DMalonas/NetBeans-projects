/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html2text1;

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
/**
 *
 * @author mnemo
 */
public class Html2text {
    //Html2text class, pairnei to local file kai vgazei ta html tags, afhnei mono keimeno
    private Html2text() {}

    public static List<String> extractText(Reader reader) throws IOException {
    //List that holds html text 
        final ArrayList<String> list = new ArrayList<String>();

    ParserDelegator parserDelegator = new ParserDelegator();
    ParserCallback parserCallback = new ParserCallback() {
      public void handleText(final char[] data, final int pos) {
        list.add(new String(data));
      }
      public void handleStartTag(Tag tag, MutableAttributeSet attribute, int pos) { }
      public void handleEndTag(Tag t, final int pos) {  }
      public void handleSimpleTag(Tag t, MutableAttributeSet a, final int pos) { }
      public void handleComment(final char[] data, final int pos) { }
      public void handleError(final java.lang.String errMsg, final int pos) { }
    };
    parserDelegator.parse(reader, parserCallback, true);
    //System.out.println(list); //apothikeyei to keimeno xwris html tags se lista me komma delimeter
    return list;
  }
  
  
    /**
     * @param args the command line arguments
     */
    public final static void main(String[] args) throws Exception {
        //main class , TODO code application logic here
        //Returns a new instance of BreakIterator that locates sentence boundaries.
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.UK);
        
        // run urlloader method to produce text file from url
        Html2text.urlloader(new URL("https://en.wikipedia.org/wiki/Cybernetics"));
        
        //create reader for our html file
        FileReader reader = new FileReader("test.html");
        
        //apply extract text method to our file reader and save text in a list
    List<String> list1 = Html2text.extractText(reader);
    List<String> list2 = new ArrayList<>();
    //apothikeyei to keimeno se ena string, enonontas ola ta elements ths listas
    String htmltext = String.join(" ", list1);
    //System.out.println(lines.size());list with 2035 elements
   // for (String line : lines) {
   //   System.out.println(line);
  //  }
    //System.out.println(htmltext);
    //System.out.println(htmltext.length()); Prints number of string characters

    //break iterator, diaxorizei to keimeno se protaseis me bash thn teleia.
    //meta apo kathe teleia dhmioyrgei nea protash
      
      //Sets the iterator to analyze a new piece of text.
      iterator.setText(htmltext);
      int start = iterator.first();
      String inputLine2;
      String fileName = "text2.html";
			File file2 = new File(fileName);
 
			if (!file2.exists()) {
				file2.createNewFile();
			}
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
           //use FileWriter to write file
			FileWriter fw2 = new FileWriter(file2.getAbsoluteFile());
			BufferedWriter bw2 = new BufferedWriter(fw2);
            //oso to readline diavazei grammes, kanei anathesi  
//			while ((inputLine2 = br2.readLine()) != null) {
//				bw2.write(inputLine2);
//			}     
      //loop over htmltext                  
      for (int end = iterator.next();
        end != BreakIterator.DONE;
        start = end, end = iterator.next()) {
        //ksexorizei  tis protaseis tou keimenou me bash thn teleia
            //List that holds html text sentences
          //list2.add(htmltext.substring(start,end));
         // System.out.println(htmltext.substring(start,end));
          //grafei tin protash sto arxeio file2   
          bw2.write(htmltext.substring(start,end));
          bw2.newLine();
        }
      //System.out.println(list2.size());
          bw2.close();
          System.out.println("file holding sentences from url page is now created");
      
    }
    
    public static void  urlloader(URL url) {
      //methodos urlloader ,  pairnei to url kai to sozei se local file
        
        //URL url;
 
		try {
			// get URL content 
                       // url = new URL("https://en.wikipedia.org/wiki/Cybernetics");
			URLConnection conn = url.openConnection();
 
			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
			String inputLine;
 
			//save to this filename
			String fileName = "text1.html";
			File file = new File(fileName);
 
			if (!file.exists()) {
				file.createNewFile();
			}
 
			//use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
                        //oso to readline diavazei grammes, kanei anathesi  
			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);
			}
 
			bw.close();
			br.close();
 
			System.out.println("file holding text from url page is now created");
 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
    
    
}
