
package itemlistparserdemo;

import java.util.ArrayList;

/**
 *
 * 
 * 
 * 
 * @author Dimitrios
 */

public class ItemListParserDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ItemListParse parser = new ItemListParser();
        ArrayList<LineItem> items = parser.parse("items.xml");
        for(LineItem anItem : items)
            System.out.println(anItem.format());
    }
}
