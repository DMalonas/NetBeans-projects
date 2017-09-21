/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html3a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.ElementIterator;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

/**
 *
 * @author mnemo
 */
public class Html3a {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        // TODO code application logic here
        //declare class object variable
         System.out.println("rfkjhgk1");
        Url2info url2info1;
        url2info1 = new Url2info();
        url2info1.SetUrl();
        url2info1.GetUrl();
        url2info1.FileCr();
        url2info1.ReadHttp();
        //up to here we have saved html code in domain.txt file
        
        //lets ectract title and save it at a third file domain.titletag.html
        url2info1.SaveText2title1();
        
        //lets extract h1tags
        url2info1.extractH1();
        //lets save them in mysql table
        url2info1.h12mysql();
        //lets extract text
        url2info1.extractText();
        
        //lets  extracte protaseis and save to second file domain.protaseis.hmtl
        url2info1.SaveText2sentences();
        
        //lets insert protaseis to mysql
        url2info1.sentence2mysql();
        
        
        
        
        
    }
    //class declaration
    public static class Url2info{
        private  BufferedWriter out1;
        private   URL  url1;
        
        private String text, urlstr, htmltext, html2str;
        private String html2title;
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
        
        
        //here is constructor of object
            public Url2info(){
            }
        
        //below are methods of obect
                //set url 
                public void SetUrl() throws MalformedURLException{
                        System.out.println("rfkjhgk3");
                        Scanner user_input = new Scanner(System.in);
                        urlstr = user_input.next();
                        URL url1 = new URL(urlstr);
                        this.url1 = url1;
                       
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
                                this.w1filename = url1.getHost()+"protaseis.html";
                                this.r1filename = url1.getHost()+"title.html";
                                System.out.println(c1filename);
                                File file = new File(c1filename);//holds html code

                                if (!file.exists()) {
                                        file.createNewFile();
                                }
                                File file1 = new File(w1filename);//holds text

                                if (!file1.exists()) {
                                        file1.createNewFile();
                                }
                                File file2 = new File(r1filename);//holds title

                                if (!file2.exists()) {
                                        file2.createNewFile();
                                }
                                //use FileWriter to write  html page to  file
                                //FileWriter fw = new FileWriter(file.getAbsoluteFile());
                                //buffer going to help us write html code to first file
                                //BufferedWriter bw = new BufferedWriter(fw);
                                //reader for this file
                                
                                System.out.println(""+c1filename+"3 files holding text+sentences+title from url page are now created empty. buffer writer alos created");
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
                      //ksexorizei  tis protaseis tou keimenou me bash thn teleia
                          //List that holds html text sentences
                        //list2.add(htmltext.substring(start,end));
                       // System.out.println(htmltext.substring(start,end));
                        //grafei tin protash sto arxeio file2   
                           bw.write(htmltext.substring(start,end));
                           bw.newLine();
                                    // System.out.println(htmltext.substring(start,end));

                         }
                            //System.out.println(list2.size());
                                bw.close();
                        return htmltext;

                }
                
                public void SaveText2title1() throws IOException{
                            
                            this.html2str = new String(Files.readAllBytes(Paths.get(c1filename)));//read html code
                            HTMLEditorKit kit = new HTMLEditorKit(); 
                                try 
                                {
                                    HTMLDocument doc = new HTMLDocument();
                                    doc.putProperty("IgnoreCharsetDirective", new Boolean(true));
                                    kit.read(new StringReader(html2str), doc, 0);
                                    
                                     html2title = (String) doc.getProperty(Document.TitleProperty);
                                    
                                    System.out.println("HTMLDocument Title: " + html2title);
                                } catch (Exception e) 
                                {
                                    System.err.println("Unexpected " + e + " thrown");
                                }
                            
                                             
                }
               
                
               public void sentence2mysql() throws IOException{
                               System.out.println("seerching  sentences open file ktl ");
                              FileInputStream fstream = null;
                       //READ FROM SECOND FILE- PROTASEIS
			try {
                             fstream = new FileInputStream(w1filename);//stream form pure text 
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
                                        String insert2 = "INSERT INTO htmlcontent (`SENTENCES`, `TITLE`, `H1TAG`, `H2TAG`, `H3TAGE`) VALUES ( ?, ?, ?, ?, ?)";
                                        //Statement st = conn.createStatement();
                                        preparedStatement = conn.prepareStatement(insert2);

                                      //preparedStatement.setString(1,"NULL");	
                                        preparedStatement.setString(1, sentenceLine);
                                              preparedStatement.setString(2, this.html2title);
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
                                     } catch (SQLException e) {
                                         
                                         System.out.println(e.getMessage());
                                     } catch (ClassNotFoundException ex) {		  
                                        
                                        }
                                }                          
                          } catch (IOException e) {
                                               // handle an exception, or often we just ignore it
                                                 }
                               

                          
                    }
                 public void h12mysql() throws IOException, ClassNotFoundException, SQLException{
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
                                       String insert2 = "INSERT INTO htagcontent ( `TITLE`, `H1TAG`, `H2TAG`, `H3TAGE`) VALUES ( ?, ?, ?, ?)";
                                       
                                       
                                       //Statement st = conn.createStatement();
                                       preparedStatement = conn.prepareStatement(insert2);
                                       //  loop over  h1list
                                       System.out.println("#loop over h1list");
                                       for (int i = 0; i < h1list.size(); i++) {
                                           System.out.println(h1list.get(i));
                                       
                                       //preparedStatement.setString(1,"NULL");
                                       preparedStatement.setString(1, this.html2title);
                                       preparedStatement.setString(2, h1list.get(i));
                                       preparedStatement.setString(3, "system");
                                       preparedStatement.setString(4, "system");
                  
                                       
                                       // execute insert SQL stetement
                                       preparedStatement.executeUpdate();
                                       
                                   
                                              System.out.println("Record is inserted into DBUSER table!");
                                       }
                                       preparedStatement.close();

                                        //trabame dedomena apo th bash - den einai aparaitito
                                       // ResultSet res = st.executeQuery("SELECT * FROM  sentence");//ennoeitai oti exeis ftiaksei ena pinaka "sentence" mesa sth bash "url2mysql"
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
                             
                             //create array list
                             this.h1list  = new ArrayList<>();
                             HTMLEditorKit htmlKit = new HTMLEditorKit();
                                HTMLDocument htmlDoc = (HTMLDocument) htmlKit.createDefaultDocument();
                                HTMLEditorKit.Parser parser = new ParserDelegator();
                                HTMLEditorKit.ParserCallback callback = htmlDoc.getReader(0);
                                parser.parse(br, callback, true);
                                
                              // Parse
                                ElementIterator iterator = new ElementIterator(htmlDoc);
                                Element element;
                                while ((element = iterator.next()) != null) {
                                  AttributeSet attributes = element.getAttributes();
                                  Object name = attributes.getAttribute(StyleConstants.NameAttribute);
                                  if ((name instanceof HTML.Tag)
                                      && ((name == HTML.Tag.H1) || (name == HTML.Tag.H2) || (name == HTML.Tag.H3))) {
                                    // Build up content text as it may be within multiple elements
                                    stbuff = new StringBuffer();
                                    int count = element.getElementCount();
                                    for (int i = 0; i < count; i++) {
                                      Element child = element.getElement(i);
                                      AttributeSet childAttributes = child.getAttributes();
                                      if (childAttributes
                                          .getAttribute(StyleConstants.NameAttribute) == HTML.Tag.CONTENT) {
                                        int startOffset = child.getStartOffset();
                                        int endOffset = child.getEndOffset();
                                        int length = endOffset - startOffset;
                                        stbuff.append(htmlDoc.getText(startOffset, length));//  h1 contents pou vrike se ayto to loop
                                           //add stbuff to a list
                                        
                                       }
                                    }
                                    h1list.add(stbuff.toString());
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
