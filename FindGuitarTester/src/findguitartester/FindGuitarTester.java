
package findguitartester;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);
        
        Guitar whatDimitriosLikes = new Guitar("", 0, "Fender", "Stratocastor",
                                                "electric", "Alder", "Alder");
        
        Guitar guitar = inventory.search(whatDimitriosLikes);
        if(guitar != null ){
            System.out.println("Dimitrios, you might like this " +
                    guitar.getBuilder() +  " " + guitar.getModel() + " " +
                    guitar.getType() + " guitar:\n  " +
                    guitar.getBackWood() + " back and sides, \n  " +
                    guitar.getTopWood() + " top.\nYou can have it for only $" +
                    guitar.getPrice() + "!");
        } else {
          System.out.println("Sorry, Dimitrios, we have nothing for you.");
        }
    }
    
    private static void initialiseInventory(Inventory inventory) { 
        inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
                            "Indian Rosewood", "Sitka");
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
                            "Alder", "Alder");
        inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electriic",
                            "Alder", "Alder");
        inventory.addGuitar("122784", 5495.95, "Martn", "D-18", "acoustic",
                            "Mahogany", "Adirondack");
        inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic",
                            "Brazilian Rosewood", "Adirondack");
        inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
                            "Mahogany", "Maple");
        inventory.addGuitar("77023", 6375.95, "Gibson", "SG !61 Reissue",
                            "electric", "Mahogany", "Mahogany");
    }  
}
