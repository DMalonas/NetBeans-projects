/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html3a;

import java.io.BufferedReader;                      //use to read lines
import java.io.BufferedWriter;                      //use to write 
import java.io.File;                                // import all the classes that are defined in java.io package to the file
import java.io.FileInputStream;                     // read bytes from file
import java.io.FileNotFoundException;               //
import java.io.FileReader;                          //use to read characters
import java.io.FileWriter;                          //use to open and write to file
import java.io.IOException;                         //
import java.io.InputStreamReader;                   // turn the input from byte form to a character
import java.io.Reader;                              // read a character
import java.io.StringReader;                        // turn a string into a reader
import java.net.MalformedURLException;              // 
import java.net.URL;                                // a pointer to a url 
import java.net.URLConnection;                      // required for the connection to the http server 
import java.nio.file.Files;                         // the nio clase is used for file manipulation like a copy operation
import java.nio.file.Paths;                         // the nio clase is used for file manipulation like a copy operation
import java.sql.Connection;                         // to connect to the database we need a connection object
import java.sql.DriverManager;                      // the connection object uses the driver manager that passes in the username, password and the location of the database
import java.sql.PreparedStatement;                  // the PreparedStatement class has an object that sends SQL statements to the database
import java.sql.SQLException;                       //
import java.text.BreakIterator;                     // natural language tokenizer class
import java.util.ArrayList;                         // methods for array manipulation
import java.util.List;                              // use List to implement the itterator interface
import java.util.Locale;                            // UK since my regional keyboard settings are British 
import java.util.Scanner;                           // use to get input
import java.util.logging.Level;                     // define logging levels for the control of the logging output
import java.util.logging.Logger;                    // we use the logger object in order to access the access points of the Logging API
import javax.swing.text.AttributeSet;               // deal with editable components
import javax.swing.text.BadLocationException;       //
import javax.swing.text.Document;                   // document data manipulation
import javax.swing.text.EditorKit;                  // standard parser of java
import javax.swing.text.Element;                    //
import javax.swing.text.ElementIterator;            // iterate
import javax.swing.text.MutableAttributeSet;        //
import javax.swing.text.SimpleAttributeSet;         //
import javax.swing.text.StyleConstants;             //
import javax.swing.text.html.HTML;                  //
import javax.swing.text.html.HTMLDocument;          //
import javax.swing.text.html.HTMLEditorKit;         // parse html text
import javax.swing.text.html.parser.ParserDelegator;        // parser delegator
import javax.swing.JOptionPane;




public class Html3a {                               //class Html3a

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException3
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {            //main 
        // TODO code application logic here
        //declare class object variable
           System.out.println("           - - -         - - -      ");
           System.out.println("           - ! -         - ! -      ");
           System.out.println("           - - -         - - -      ");
         System.out.println("    o                               o    ");
         System.out.println("    !0                             0!    ");
         System.out.println("    ! 0                           0 !    ");
         System.out.println("    !  0         o    o          0  !    ");
         System.out.println("     !  00                     00  !     ");
         System.out.println("      !   000000000000000000000   !      ");
         System.out.println("       !!!000000000000000000000!!!       ");
         
         
        Url2info url2info1;                 //create a uro2info1 method
        url2info1 = new Url2info();         // create the object
        url2info1.SetUrl();                 // line 117 
        url2info1.GetUrl();
        url2info1.FileCr();                 //create file
        url2info1.ReadHttp();               //read 
        //up to here the html code is saved in domain.txt file
        
        //extract title and save it at a third file domain.titletag.html
        url2info1.SaveText2title1();
        
        // extract s
        url2info1.extractH1();
        // save them in mysql table
        url2info1.h12mysql();
        // extract text
        url2info1.extractText();
        
        //extracte sentences and save to second file domain.sentences.hmtl
        url2info1.SaveText2sentences();
        
        //insert sentences to mysql
        url2info1.sentence2mysql();
        
        
        
        
        
    }
    //class declaration
        public static class Url2info{                       //class Url2info
        private  BufferedWriter out1;                       // bufferedWritter private variable so we will write to file
        private   URL  url1;                    
        
        private String text, urlstr, htmltext, html2str;    //private strings    
        private String html2title;                          //private string
        private String w1filename, r1filename, c1filename, h1filename;                  
        //             second file, tile file  , first file, tagfile
        private FileReader reader1, reader2, reader3;
        private BufferedWriter bw;                  
        private BufferedReader br;
        private List<String> list, h1list;
        private String bufread,filecr;
        private InputStreamReader isr;
        private FileInputStream is;
        private  StringBuffer stbuff ;
        
        
        // constructor of the class Url2info
            public Url2info(){
            }
        
        // methods of obect follow
                //set url 
                public void SetUrl() throws MalformedURLException{                  //set url 
                      //  System.out.println("Please Enter a url");             
                     //   Scanner user_input = new Scanner(System.in);            //take user input
                     //   urlstr = user_input.next();                             //take user input
                        urlstr = JOptionPane.showInputDialog("Please Enter a URL", "Enter the URL here");
                        URL url1 = new URL(urlstr);                             //change it to url1
                        this.url1 = url1;                                       //url1 has many methods that can be used
                       
                }
                //get url 
                public String  GetUrl() {
                        System.out.println(urlstr);
                        return urlstr;
                       
                }
                //create File Object and its buffered writer to save  html data stream-get  filename for reading
                public String FileCr() throws IOException{
                               // String fileName = "text1.html";
                                this.c1filename = url1.getHost()+".html";
                                this.w1filename = url1.getHost()+"sentences.html";
                                this.r1filename = url1.getHost()+"title.html";
                                System.out.println(c1filename);
                                File file = new File(c1filename);                  //holds html code

                                if (!file.exists()) {
                                        file.createNewFile();
                                }
                                File file1 = new File(w1filename);                  //holds text

                                if (!file1.exists()) {
                                        file1.createNewFile();
                                }
                                File file2 = new File(r1filename);                   //holds title

                                if (!file2.exists()) {
                                        file2.createNewFile();
                                }
                                //use FileWriter to write  html page to  file
                                //FileWriter fw = new FileWriter(file.getAbsoluteFile());
                                //buffer going to help us write html code to first file
                                //BufferedWriter bw = new BufferedWriter(fw);
                                //reader for this file
                                
                                System.out.println(""+c1filename+"3 files holding text+sentences+title from url page are now created empty. buffer writer is also created");
                                String filecr = "ok";
                                //return c1filename;
                                return filecr;
                }
                
                
                //create ReadHttpeader Object for html stream-get reader1 for file reading
                //read http stream
                public String ReadHttp() throws FileNotFoundException, IOException{
                         System.out.println(c1filename);
                        // get URL content 
                       // url = new URL("https://en.wikipedia.org/wiki/Cybernetics");
			URLConnection conn = url1.openConnection();
 
                    // read http stream from first file
                    // open the http stream(hmtl code) and put it into BufferedReader
                        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                // read http stream from first file
                //FileReader reader1;
                    //use FileWriter to write  html page to  file
                            
                            FileWriter fw;
                            fw = new FileWriter(c1filename, true);
                            //buffer going to help us write html code to first file
                            BufferedWriter bw = new BufferedWriter(fw);
                            System.out.println(""+c1filename+"buffer writer also created");
              
                //reader1 = new FileReader(c1filename);
                while ((text = br.readLine()) != null) {
                    bw.write(text);
                }
                
                bw.close();
                br.close();
            
                        String strread="ok";
                        return strread;

                }
                //extract text for getting text from file 
                 public  List<String> extractText() throws IOException {
                //reader2 for reading html code from first file
                  this.reader2 = new FileReader(this.c1filename);
                //List that holds html text 
                  this.list = new ArrayList<>();
                  
                ParserDelegator parserDelegator = new ParserDelegator();
                HTMLEditorKit.ParserCallback parserCallback;
                parserCallback = new HTMLEditorKit.ParserCallback() {
                    @Override
                    public void handleText(final char[] data, final int pos) {
                        list.add(new String(data));
                    }
                    @Override
                    public void handleStartTag(HTML.Tag tag, MutableAttributeSet attribute, int pos) { }
                    @Override
                    public void handleEndTag(HTML.Tag t, final int pos) {  }
                    @Override
                    public void handleSimpleTag(HTML.Tag t, MutableAttributeSet a, final int pos) { }
                    @Override
                    public void handleComment(final char[] data, final int pos) { }
                    @Override
                    public void handleError(final java.lang.String errMsg, final int pos) { }
                    };
                    parserDelegator.parse(reader2, parserCallback, true);
                    System.out.println(list); //apothikeyei to keimeno xwris html tags se lista me komma delimeter
                    return list;
                }
                public String SaveText2sentences() throws FileNotFoundException, IOException{
                              
                            FileWriter fw;
                            fw = new FileWriter(w1filename, true);
                            //buffer going to help us write sentences  to second file file
                            BufferedWriter bw = new BufferedWriter(fw);
                           
                            System.out.println(""+w1filename+"buffer writer also created");
                                 BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
                                 String htmltext = String.join(" ", list);//take the list from extracttext and pass it to a variable
                                iterator.setText(htmltext);
                                  int start = iterator.first();
                
                     for (int  end = iterator.next(); 
                            end != BreakIterator.DONE;
                            start = end, end = iterator.next()) {
                      //tokenize using the fullstop "." character as a reference
                          //List that holds html text sentences
                        //list2.add(htmltext.substring(start,end));
                       // System.out.println(htmltext.substring(start,end));
                        //it writes the sentence in the file2   
                           bw.write(htmltext.substring(start,end));
                           bw.newLine();
                                    // System.out.println(htmltext.substring(start,end));

                         }
                            //System.out.println(list2.size());
                                bw.close();
                        return htmltext;

                }
                
                public void SaveText2title1() throws IOException{                                       //save text to title from the the first file extract the title use HTMLEditor kit parser
                            
                            this.html2str = new String(Files.readAllBytes(Paths.get(c1filename)));      //read html code
                            HTMLEditorKit kit = new HTMLEditorKit(); 
                                try 
                                { 
                                    HTMLDocument doc = new HTMLDocument();                                  //create document doc that has a frame of html page  
                                    doc.putProperty("IgnoreCharsetDirective", new Boolean(true));           // all the pages have a charset (Access with f12) we use this line so the program will not read according with the charset of the page but with the charset of the computer. If the program does otherwise then we will get an error
                                    kit.read(new StringReader(html2str), doc, 0);                           //use the kit editor in order to compare the string of the html code with the doc
                                    
                                     html2title = (String) doc.getProperty(Document.TitleProperty);
                                    
                                    System.out.println("HTMLDocument Title: " + html2title);
                                } catch (Exception e) 
                                {
                                    System.err.println("Unexpected " + e + " thrown");
                                }
                            
                                             
                }
               
                
               public void sentence2mysql() throws IOException{
                               System.out.println("searching  sentences open file ");
                              FileInputStream fstream = null;
                       //READ FROM SECOND FILE- sentences
			try {
                             fstream = new FileInputStream(w1filename);//stream form pure text 
                        } catch (IOException e) {
                               // handle an exception2
                        } 
                       
                        BufferedReader br1 = new BufferedReader(new InputStreamReader(fstream));
                           System.out.println("searching  sentences 2");
					String sentenceLine;
                             
                         try {
			//Read File Line By Line        
				while ((sentenceLine = br1.readLine()) != null)   {         //define sentence line 
					  // Print the content on the console
                                          // System.out.println(sentenceLine);
                                                    //select and insert values in database
                         //connect to database AND INSERT FILE LINES
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
                                        String insert2 = "INSERT INTO htmlcontent (`SENTENCES`, `TITLE`, `H1TAG`, `H2TAG`, `H3TAGE`) VALUES ( ?, ?, ?, ?, ?)";    // string query insert2 
                                        //Statement st = conn.createStatement();
                                        preparedStatement = conn.prepareStatement(insert2);     //  make insert2 dynamic

                                      //preparedStatement.setString(1,"NULL");	
                                        preparedStatement.setString(1, sentenceLine);                       // insert the sentences
                                              preparedStatement.setString(2, this.html2title);              // insert the titles
                                              preparedStatement.setString(3, "system");
                                              preparedStatement.setString(4, "system");
                                              preparedStatement.setString(5, "system");

                                              // execute insert SQL stetement
                                              preparedStatement.executeUpdate();                        //executeUpdate so the db will open and we will write to the table
                                             preparedStatement.close();                                 //close the preparedStatement
                                             conn.close();
                                              System.out.println("Record is inserted into DBUSER table!");


                                       
                                       // ResultSet res = st.executeQuery("SELECT * FROM  sentence");
                                       // while (res.next()) {
                                        //int id = res.getInt("id");
                                        //String msg = res.getString("msg");
                                        //System.out.println(id + "\t" + msg);
                                     } catch (SQLException e) {
                                         
                                         System.out.println(e.getMessage());
                                     } catch (ClassNotFoundException ex) {		  
                                        
                                        }
                                }                          
                          } catch (IOException e) {
                                               // handle an exception, or often we just ignore it
                                                 }
                               

                          
                    }
                 public void h12mysql() throws IOException, ClassNotFoundException, SQLException{                   //method that takes the h1 tags from the list and put it inside mysql
                               System.out.println("seerching  h1list ");
                             
                       //READ FROM SECOND h1list- tags
			
                        	String h1listelement;
                              //databse connection
                                 //connect to database AND INSERT FILE LINES
                                        String url = "jdbc:mysql://localhost:3306/";
                                        String dbName = "url2text";//ennoeitai oti exeis hdh ftiaxei th bash url2mysql sth mysql
                                        String driver = "com.mysql.jdbc.Driver";
                                        String userName = "root"; //enoeitai oti o root einai o apolytos diaxeirisths ths mysql
                                        String password = "over";
                                        PreparedStatement preparedStatement = null;
                              //db
                                        
                                        Class.forName(driver);
                                        System.out.println("MySQL JDBC Driver");
                                        Connection conn = DriverManager.getConnection(url+dbName,userName,password);
                                       String insert2 = "INSERT INTO htagcontent ( `TITLE`, `H1TAG`, `H2TAG`, `H3TAGE`) VALUES ( ?, ?, ?, ?)";  // the questionmarks will accept the iformation
                                                                                                                                                // the fisrt ? will have the TITLE information
                                                                                                                                                // the questionmarks show the dynamic nature of the 
                                                                                                                                                // four fields
                                       
                                       //Statement st = conn.createStatement();
                                       preparedStatement = conn.prepareStatement(insert2);
                                       //  loop over  h1list
                                       System.out.println("#loop over h1list");
                                       for (int i = 0; i < h1list.size(); i++) {                        // start searching the tag list till the end of the list 
                                           System.out.println(h1list.get(i));
                                       
                                       //preparedStatement.setString(1,"NULL");
                                       preparedStatement.setString(1, this.html2title);                 // in the position 1 which is TITLE insert the Title
                                       preparedStatement.setString(2, h1list.get(i));                   //get me the first, second third... element of the list
                                       preparedStatement.setString(3, "system");                        //
                                       preparedStatement.setString(4, "system");                        //
                  
                                       
                                       // execute insert SQL stetement
                                       preparedStatement.executeUpdate();
                                       
                                   
                                              System.out.println("Record is inserted into DBUSER table!");
                                       }
                                       preparedStatement.close();

                                        //
                                       // ResultSet res = st.executeQuery("SELECT * FROM  sentence");//ennoeitai oti exeis ftiaksei ena pinaka "sentence" inside the base "url2mysql"
                                       // while (res.next()) {
                                        //int id = res.getInt("id");
                                        //String msg = res.getString("msg");
                                        //System.out.println(id + "\t" + msg);
                                    
                                                          
                          
                         
                               

                          
                    }
                public void  extractH1() throws IOException {
                                            // Load HTML file 
                                                try{
                             // open input stream domain.html for reading purpose.
                             is = new FileInputStream(c1filename);

                             // create new input stream reader
                             isr = new InputStreamReader(is);

                             // create new buffered reader
                             br = new BufferedReader(isr);
                             
                             //create array list h1list
                             this.h1list  = new ArrayList<>();
                             HTMLEditorKit htmlKit = new HTMLEditorKit();                                   // create parsing object
                                HTMLDocument htmlDoc = (HTMLDocument) htmlKit.createDefaultDocument();      // create an empty HTML document
                                HTMLEditorKit.Parser parser = new ParserDelegator();                        // create the parser      
                                HTMLEditorKit.ParserCallback callback = htmlDoc.getReader(0);               // and a feedback information object
                                parser.parse(br, callback, true);                                           // the parse method reads every character of the buffered reader br which contains the html code gives feedback  
                                
                              // Parse
                                ElementIterator iterator = new ElementIterator(htmlDoc);                    // the iterator has the information of the html document
                                Element element;                                                            // create 
                                while ((element = iterator.next()) != null) {                               // while you find html tags
                                  AttributeSet attributes = element.getAttributes();                        // draw the tags based on their attributes
                                  Object name = attributes.getAttribute(StyleConstants.NameAttribute);
                                  if ((name instanceof HTML.Tag)                                                            // if the name of the attribute is the same with the html.tag and it is h1, h2 and h3
                                      && ((name == HTML.Tag.H1) || (name == HTML.Tag.H2) || (name == HTML.Tag.H3))) {       //then go inside the for and at 449 find the content isnide the h1,h2, h3 tags
                                    // Build up content text as it may be within multiple elements
                                    stbuff = new StringBuffer();
                                    int count = element.getElementCount();
                                    for (int i = 0; i < count; i++) {
                                      Element child = element.getElement(i);
                                      AttributeSet childAttributes = child.getAttributes();
                                      if (childAttributes                                                                   //get the contents of the h1,h2,h3 tags
                                          .getAttribute(StyleConstants.NameAttribute) == HTML.Tag.CONTENT) {                
                                        int startOffset = child.getStartOffset();
                                        int endOffset = child.getEndOffset();
                                        int length = endOffset - startOffset;
                                        stbuff.append(htmlDoc.getText(startOffset, length));                            //  save the contents of the h1 tags thta we found inside teh stbuff then go to 445 and execute the for loop again 
                                           //add stbuff to a list
                                        
                                       }
                                    }
                                    h1list.add(stbuff.toString());                                               // take h1list and add a string to the bottom of the list
                                    System.out.println(name + ": " + stbuff.toString());        
                                  }
                                } 
                                //System.exit(0);

                          }catch(Exception e){
                             e.printStackTrace();
                          }finally{

                             // releases resources associated with the streams
                             if(is!=null)
                                is.close();
                             if(isr!=null)
                                isr.close();
                             if(br!=null)
                                br.close();
                          }
                       }

        
        
    }
}
