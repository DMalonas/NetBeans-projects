
package arrayelementsja12;
import java.util.Scanner;
public class ArrayElementsJA12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Enter the Elements:");
        for (int i=0; i<5; i++)
        {
            array[i] =scanner.nextInt();
        }
        for( int num : array){
            
            sum = sum+num;
        }
        System.out.println("Sum of array element is:" +sum);
            }
    
}
