
package boardgamesimulator;

import java.util.ArrayList;
import java.util.List;


public class Board {

    private int width, height; 
    private List tiles;
    
    public Board(int height, int width){
        this.width = width;
        this.height = height;
        initialise();
    }
    
    private void initialise(){
        tiles = new ArrayList(width);
        for (int i=0; i<width; i++){
            tiles.add(i, new ArrayList(height));
            for (int j=0; j<height; j++)
            ((ArrayList)tiles.get(i)).add(j, new Tile());
        }
    }
    
    public void getTile(int x, int y){
        
    }
    
    public void addUnit( int u, int x, int y){
        
    }
    
    public void getUnits(int x, int y){
        
    }
}
