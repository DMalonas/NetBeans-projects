
package createtextfile;


import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        Formatter output = new Formatter("clients.txt");
        Scanner input = new Scanner( System.in);
        
        int accountNumber;
        String firstName;
        String lastName;
        double balance;
        
        System.out.printf("%s\n%s\n%s\n\n","To terminate input, type the end-of-file indicator",
                          "whene you are prompted to enter input.",
                          "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                          "On Windows type <ctrl> z then press Enter");
        
        System.out.printf("%s\n%s",
                "Enter account number (>0),first name, last name and balance.","? ");
        int i =0;
        while(i++ <3)
        {
            accountNumber = input.nextInt();
            firstName = input.next();
            lastName = input.next();
            balance = input.nextDouble();
            
            if( accountNumber > 0 )
            {
                output.format("%d %s %s %.2f\n", accountNumber, firstName, lastName, balance);
            }
            else
            {
                System.out.println(
                "Account number must be greater than 0.");
            }
            
            System.out.printf("%s %s\n%s","Enter account number (>0),",
                    "first name, last name and balance.", "?");
        }   
        output.close();
    }
}
