
package textfileiosimulator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;


public class ReadTextFile {
    private Scanner input;
   
   public void openFile() { // enable user to open file
      try {
         input = new Scanner(new File("C:\\Users\\Dimit\\Documents\\OOP\\S5\\TextFileIOFiles\\clients_out.txt"));
      } // end try
      catch (FileNotFoundException fileNotFoundException) {
         System.err.println("Error opening file.");
         System.exit(1);
      } // end catch
   } // end method openFile

   // read records from file.  Method added by RJR 11/3/09
   public void readRecords(Vector recordSet) {
      // object to be read from file
      AccountRecord record = new AccountRecord();

      try // read records from file using Scanner object
      {
         while (input.hasNext()) {

            record.setRecord(input);

            recordSet.add(new AccountRecord(record));
         } // end while
      } // end try
      catch (NoSuchElementException elementException) {
         System.err.println("File improperly formed.");
         input.close();
         System.exit(1);
      } // end catch
      catch (IllegalStateException stateException) {
         System.err.println("Error reading from file.");
         System.exit(1);
      } // end catch
   } // end method readRecords (Vector)

   public void readRecords() { // read record from file
      // object to be written to screen
      AccountRecord record = new AccountRecord();

      System.out.printf("%-10s%-12s%-12s%10s\n", "Account",
            "First Name", "Last Name", "Balance");

      try // read records from file using Scanner object
      {
         while (input.hasNext()) {
            record.setRecord(input);

            // display record contents
            record.displayRecord();
         } // end while
      } // end try
      catch (NoSuchElementException elementException) {
         System.err.println("File improperly formed.");
         input.close();
         System.exit(1);
      } // end catch
      catch (IllegalStateException stateException) {
         System.err.println("Error reading from file.");
         System.exit(1);
      } // end catch
   } // end method readRecords

   // close file and terminate application
   public void closeFile() {
      if (input != null) {
         input.close(); // close file
      }
   } // end method closeFile
}
