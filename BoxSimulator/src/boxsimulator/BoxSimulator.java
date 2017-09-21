
package boxsimulator;


public class BoxSimulator {

    public static void main(String[] args) {
        //Box myBox = new Box();
        ShoeBox myShoeBox = new ShoeBox();
    
        myShoeBox.open();
        myShoeBox.close();
        System.out.println("Number of Boxes:  " + Box.getCount() + "");
        
        myShoeBox.getShoe();
        
    }
}
