
package scope;


public class Scope {

    // field accessible to all methods of this class
    private static int x = 1;
    
    public static void main(String[] args) {
        int x = 5;  //local x shadows field x
        System.out.printf("local x in method begin is %d\n", x );
        
        userLocalVariable();;
        useField();
        userLocalVariable();;
        useField();
        
        
        System.out.printf( "\nLocal x in method begin is %d\n", x );
             
    }
    
    public static void userLocalVariable(){
        int x = 25;
        
        System.out.printf("\nLocal x on entering methdod userLocalVariablee is %d\n", x );
        ++x;
        System.out.printf(""
                + "local x before exiting method useLocalVariable is %d\n",x );
    }
    
    public static void useField(){
        System.out.printf(
        "\nField x on entering method useField is %d\n",x);
        x*=10;
        System.out.printf(
        "field x before exiting method useField is %d\n", x );
    }
}
