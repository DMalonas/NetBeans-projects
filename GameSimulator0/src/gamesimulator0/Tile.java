
package gamesimulator0;

import java.util.LinkedList;
import java.util.List;


public class Tile {
    
    private List units; 
    
    
    public Tile(){
        units = new LinkedList();
    }
    
    protected void addUnit(Unit unit){
        units.add(unit);
    }
    
    protected void removeUnits(Unit unit){
        units.remove(unit);
    }
    
    protected List getUnits(){
        return units;
    }
    
}
