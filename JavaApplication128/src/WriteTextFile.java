
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class WriteTextFile {
     private Formatter output; // object used to output text to file

   // enable user to open file
   public void openFile() {
      try {
         output = new Formatter("clients_out.txt");
      } // end try
      catch (SecurityException securityException) {
         System.err.println(
               "You do not have write access to this file.");
         System.exit(1);
      } // end catch
      catch (FileNotFoundException filesNotFoundException) {
         System.err.println("Error creating file.");
         System.exit(1);
      } // end catch
   } // end method openFile

   // add records to file.  Method added by RJR 11/3/09
   public void addRecords(Vector recordSet) {
      int i;
      final int SIZE = recordSet.size();
      AccountRecord record = new AccountRecord();

      for (i = 0; i < SIZE; i++) {
         record = (AccountRecord) recordSet.get(i);       
         record.outputRecord(output);  // write new record
      }  // end of for writing records
   }  // end of method AddRecords(Vector)

   // add records to file
   public void addRecords() {
      // object to be written to file
      AccountRecord record = new AccountRecord();
      Scanner input = new Scanner(System.in);

      System.out.printf("%s\n%s\n%s\n%s\n\n",
            "To terminate input, type the end-of-file indicator ",
            "when you are prompted to enter input.",
            "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
            "On Windows type <ctrl> z then press Enter");

      System.out.printf("%s\n%s",
            "Enter account number (> 0), first name, last name and balance.",
            "? ");

      while (input.hasNext()) // loop until end-of-file indicator
      {
         try // output values to file
         {
            record.setRecord(input); // read into record reday for output

            if (record.getAccount() > 0) {               
               record.outputRecord(output);  // write new record
//            record.displayRecord(); // display record contents at console
            } // end if
            else {
               System.out.println(
                     "Account number must be greater than 0.");
            } // end else
         } // end try
         catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file.");
            return;
         } // end catch
         catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
            input.nextLine(); // discard input so user can try again
         } // end catch
         catch (Exception e) {
            System.err.println("Input complete");
            return;
         }

         System.out.printf("%s %s\n%s", "Enter account number (>0),",
               "first name, last name and balance.", "? ");
      } // end while
   } // end method addRecords

   // close file
   public void closeFile() {
      if (output != null) {
         output.close();
      }
   } // end method closeFile
} // end class CreateTextFile

    
