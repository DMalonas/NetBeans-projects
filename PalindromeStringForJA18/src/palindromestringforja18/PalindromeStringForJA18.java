package palindromestringforja18;
import java.util.Scanner;
public class PalindromeStringForJA18 {
       public static void main(String[] args) 
       {
           String reverseString="";
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("Enter a String to check if it a palindrome: ");
           String inputString = scanner.nextLine();
           
           int length = inputString.length();
           
           for (int i = length -1; i>=0; i--)
               reverseString = reverseString + inputString.charAt(i);
           
           if (inputString.equals(reverseString))
               System.out.println("Input String is a palindrome.");
           
           else 
               
               System.out.println("Input string is not a palindrome.");
         }
    
}
