
package htmlparser1; 

import javax.swing.text.html.*;
import javax.swing.text.*;
import java.io.*;

public class Htmlparser1
{
  public static void main(String argv[]) 
  {
      String test = "<!DOCTYPE HTML PUBLIC \"-//w3c//DTD html 3.2//EN\">"
          + "<html><head>"
          + "<title>This is the title of my HTML document</title>"
          + "</head>"
          + "<body>"
          + "This is some text in the body of my document"
          + "</body></html>";

      HTMLEditorKit kit = new HTMLEditorKit(); 
      try 
      {
          HTMLDocument doc = new HTMLDocument();
          kit.read(new StringReader(test), doc, 0);         // read the html code with the kit
          String title = (String) doc.getProperty(Document.TitleProperty);  //then it extracts the title with the doc property
          System.out.println("HTMLDocument Title: " + title);
      } catch (Exception e) 
      {
          System.err.println("Unexpected " + e + " thrown");
      }
  }
}