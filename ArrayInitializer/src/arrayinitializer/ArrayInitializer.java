
package arrayinitializer;


public class ArrayInitializer {

    public static void main(String[] args) {
        //initialiser list specifies the value of each element
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        
        System.out.printf("%s%8s\n", "Index", "Value");
        
        //output each array element's value
        for ( int counter = 0; counter < array.length; counter++ ){
            System.out.printf("%5d%8d\n", counter, array[ counter ] );
        }
    }
    
}
