
package readtextfile;



import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadTextFile
{


    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner input = new Scanner(new File("clients.txt")); 
        
        int accountNumber;
        String firstName;
        String lastName;
        double balance;
        
        System.out.printf("%-10s%-12s%-12s%10s\n","Account","First Name", "Last Name", "Balance");
        
        while(input.hasNext())
        {
            accountNumber = input.nextInt();
            firstName = input.next();
            lastName = input.next();
            balance = input.nextDouble();
            
            System.out.printf("%-10d%-12s%-12s%10.2f\n",accountNumber,firstName,lastName,balance);
        }
        
        input.close();
    }
}
