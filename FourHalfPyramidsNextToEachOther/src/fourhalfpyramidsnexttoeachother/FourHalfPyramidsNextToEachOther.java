
package fourhalfpyramidsnexttoeachother;


public class FourHalfPyramidsNextToEachOther {
   
    public static void main(String[] args) {
        
        int i = 0, j = 0;
        
        for( i = 0; i < 10; ++i ){
            for( j = 0; j < i; ++j ){
                System.out.print("*");
            }
            for( j = 10; j > i; --j ){
                System.out.print(" ");
            }
            for( j = 10; j > i; --j ){
                System.out.print("*");
            }
            for( j = 0; j <= i; ++j ){
                System.out.print(" ");
            }    
          for( j = 0; j < i; ++j ){
                System.out.print(" ");
            }
            for( j = 10; j > i; --j ){
                System.out.print("*");
            }
             for( j = 10; j > i; --j ){
                System.out.print(" ");
            }
            for( j = 0; j <= i; ++j ){
                System.out.print("*");
            }    
            System.out.println();
        }
            System.out.println();
    }}

