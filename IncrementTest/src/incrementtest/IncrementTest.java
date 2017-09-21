
package incrementtest;

public class IncrementTest {

    public static void main(String[] args) {
        
        
        Increment increment = new Increment(5);
        System.out.println(increment.toString());
        Increment increments = new Increment(6);
        increment.addIncrementToTotal();
        increments.addIncrementToTotal();
        System.out.println(increment.toString());
        System.out.println(increments.toString());
        increment.addIncrementToTotal();
        increments.addIncrementToTotal();
        System.out.println(increment.toString());
        System.out.println(increments.toString());
        
    }
    
}
