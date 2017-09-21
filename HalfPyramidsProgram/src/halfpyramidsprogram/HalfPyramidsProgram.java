
package halfpyramidsprogram;

public class HalfPyramidsProgram {

    public static void main(String[] args) {
        
        int i = 0, j = 0;
        
        for( i = 0; i < 10; ++i )
        {
            for( j = 0; j <= i; ++j ){
                System.out.print("*");
            }
            System.out.println();
        }
           System.out.println();
           
           
           
           
        for( i = 0; i < 10; ++i )
        {
            for( j = 10; j > i; --j ){
                System.out.print("*");
            }
            System.out.println();
        }
        
           System.out.println();
        
           
           
           for( i = 0; i < 10; ++i )
        {
            for( j = 10; j > i; --j ){
                System.out.print("*");
            }
            System.out.println();
            for( int k = 0; k <= i; k++ )
                    System.out.print(" ");
        }
        
        
        
        for( i = 0; i < 10; ++i )
        {
            
            for( j = 10; j > i; --j ){
                System.out.print(" ");
            }
            for( int k = 0; k < i; ++k ){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
