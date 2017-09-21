/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html2text2;

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
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.*;//gia th syndesi java mysql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mnemo
 */
public class Html2text2 {
    //Html2text class, pairnei to local file kai vgazei ta html tags, afhnei mono keimeno
    private Html2text2() {}

    public static List<String> extractText(Reader reader) throws IOException {
    //List that holds html text 
        final ArrayList<String> list = new ArrayList<String>();

    ParserDelegator parserDelegator = new ParserDelegator();
    ParserCallback parserCallback;
        parserCallback = new ParserCallback() {
            @Override
            public void handleText(final char[] data, final int pos) {
                list.add(new String(data));
            }
            @Override
            public void handleStartTag(Tag tag, MutableAttributeSet attribute, int pos) { }
            @Override
            public void handleEndTag(Tag t, final int pos) {  }
            @Override
            public void handleSimpleTag(Tag t, MutableAttributeSet a, final int pos) { }
            @Override
            public void handleComment(final char[] data, final int pos) { }
            @Override
            public void handleError(final java.lang.String errMsg, final int pos) { }
        };
    parserDelegator.parse(reader, parserCallback, true);
    //System.out.println(list); //apothikeyei to keimeno xwris html tags se lista me komma delimeter
    return list;
  }
  
  
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public final static void main(String[] args) throws Exception {
        //main class , TODO code application logic here
        //Returns a new instance of BreakIterator that locates sentence boundaries.
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        
        // run urlloader method to produce text file from url
        Html2text2.urlloader(new URL("https://en.wikipedia.org/wiki/Cybernetics"));
        
       
        
        
    //System.out.println(lines.size());list with 2035 elements
   // for (String line : lines) {
   //   System.out.println(line);
  //  }
    //System.out.println(htmltext);
    //System.out.println(htmltext.length()); Prints number of string characters

    //break iterator, diaxorizei to keimeno se protaseis me bash thn teleia.
    //meta apo kathe teleia dhmioyrgei nea protash
      
      //Sets the iterator to analyze a new piece of text.
      
      String fileName = "text2.html";
			File file2 = new File(fileName);
 
			if (!file2.exists()) {
				file2.createNewFile();
			}
                         //create reader for our html file
        FileReader reader = new FileReader("text1.html");
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
        //apply extract text method to our html file reader and save text without tags in a list
    List<String> list1 = Html2text2.extractText(reader);
    List<String> list2 = new ArrayList<>();
    //apothikeyei to keimeno se ena string, enonontas ola ta elements ths listas
    String htmltext = String.join(" ", list1);
    iterator.setText(htmltext);
      int start = iterator.first();
      
      String inputLine2;
           //use FileWriter to write file
			FileWriter fw2 = new FileWriter(file2.getAbsoluteFile());
			BufferedWriter bw2 = new BufferedWriter(fw2);
            //oso to readline diavazei grammes, kanei anathesi  
//			while ((inputLine2 = br2.readLine()) != null) {
//				bw2.write(inputLine2);
//			}     
      //loop over htmltext to produce sentences with period   
                                  //System.out.println(list1);
System.out.println(start);
      for (int  end = iterator.next(); 
              end != BreakIterator.DONE;
              start = end, end = iterator.next()) {
        //ksexorizei  tis protaseis tou keimenou me bash thn teleia
            //List that holds html text sentences
          //list2.add(htmltext.substring(start,end));
         // System.out.println(htmltext.substring(start,end));
          //grafei tin protash sto arxeio file2   
          bw2.write(htmltext.substring(start,end));
          bw2.newLine();
                   // System.out.println(htmltext.substring(start,end));

        }
      //System.out.println(list2.size());
          bw2.close();
          System.out.println("file holding sentences from url page is now created");
      //read file for sentences and put them in mysql
		Html2text2.sentenc2mysq("text2.html");
	  
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
 
			//save html to this filename
			String fileName = "text1.html";
			File file = new File(fileName);
 
			if (!file.exists()) {
				file.createNewFile();
			}
 
			//use FileWriter to write url page to  file
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
    
    public static void  write2mysql(String sentence){
		//select and insert values in database
			 //connect to database
			 String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "url2text";//ennoeitai oti exeis hdh ftiaxei th bash url2mysql sth mysql
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; //enoeitai oti o root einai o apolytos diaxeirisths ths mysql
		  String password = "over";
                  PreparedStatement preparedStatement = null;
		  try {
		  Class.forName(driver);
                  System.out.println("MySQL JDBC Driver");
		  Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		  String insert1 = "INSERT INTO HTMLCONTENT (SENTENCES) VALUES ('COVENTRY UNIVERSITY IS IN WEST MIDLANDS'), \n" +
"('COVENTRY UNIVERSITY HAS BEEN VOTED AS THE MOST MODERN UNIVERSITY OF THE YEARS 2014 AND 2015'), \n" +
"('THE FACULTY OF ENGINEERING AT COVENTRY UNIVERSITY IS OPEN DURING THE WHOLE YEAR'), \n" +
"('THE LIBRARY OF COVENTRY UNIVERSITY IS UNDER REFURNISMENT SO IT WILL BE READY TO ACCOMODATE THE NUMBER\n" +
"OF STUDENTS WHICH WILL BE INCREASED FROM THE ACADEMIC YEAR 2015-2016');" ;
                  String insert2 = "INSERT INTO htmlcontent (`SENTENCES`, `TITLE`, `H1TAG`, `H2TAG`, `H3TAGE`) VALUES ( ?, ?, ?, ?, ?)";
		  //Statement st = conn.createStatement();
		  preparedStatement = conn.prepareStatement(insert2);
		  
		//preparedStatement.setString(1,"NULL");	
                  preparedStatement.setString(1, sentence);
			preparedStatement.setString(2, "system");
                        preparedStatement.setString(3, "system");
                        preparedStatement.setString(4, "system");
                        preparedStatement.setString(5, "system");
 
			// execute insert SQL stetement
			preparedStatement.executeUpdate();
                       preparedStatement.close();
                       conn.close();
			System.out.println("Record is inserted into DBUSER table!");
 
		   
		  //trabame dedomena apo th bash - den einai aparaitito
		 // ResultSet res = st.executeQuery("SELECT * FROM  sentence");//ennoeitai oti exeis ftiaksei ena pinaka "sentence" mesa sth bash "url2mysql"
		 // while (res.next()) {
		  //int id = res.getInt("id");
		  //String msg = res.getString("msg");
		  //System.out.println(id + "\t" + msg);
		  } 
                        catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		} catch (ClassNotFoundException ex) {		  
                    Logger.getLogger(Html2text2.class.getName()).log(Level.SEVERE, null, ex);
                    }		  
            }
	public static void sentenc2mysq(String filename) {
					// Open the file
                  System.out.println("seerching  sentences open file ktl ");

                      FileInputStream fstream = null;
			try {
                             fstream = new FileInputStream(filename);
                        } catch (IOException e) {
                               // handle an exception
                        } 
                       
                        BufferedReader br1 = new BufferedReader(new InputStreamReader(fstream));
                           System.out.println("seerching  sentences 2");
					String sentenceLine;
                             
                                                try {
					//Read File Line By Line
                                                    
				while ((sentenceLine = br1.readLine()) != null)   {
					  // Print the content on the console
                                          // System.out.println(sentenceLine);
                                            Html2text2.write2mysql(sentenceLine);
					}
                                                //Close the input stream
					br1.close();
                            
                                                } catch (IOException e) {
                                               // handle an exception, or often we just ignore it
                                                 }
                                                
					
		  }
}
