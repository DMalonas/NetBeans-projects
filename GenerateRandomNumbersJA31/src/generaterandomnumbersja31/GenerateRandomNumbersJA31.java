package generaterandomnumbersja31;

import java.util.*; 
public class GenerateRandomNumbersJA31 {

    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        
        System.out.println("Random Numbers: ");
        System.out.println("****************");
        for (counter = 1; counter <= 5; counter++){
            System.out.println(rnum.nextInt(300));
        }
    }
    
}
