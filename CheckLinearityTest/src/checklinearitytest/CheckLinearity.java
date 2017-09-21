package checklinearitytest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CheckLinearity {
    
    
    private int row = 0;
    private final int col = 2;
    private int[][] points;

    public CheckLinearity(int rows, int columns ){
        
        
    }
    
  
    public static void printTableOfPoints(int[][] points){
        System.out.println("Current status of the points table: ");
        for( int r = 0; r < points.length; r++)
            for( int c = 0; c < points[r].length; c++)
                System.out.print(points[r][c] + " " );
            System.out.println();
    }
    
}
