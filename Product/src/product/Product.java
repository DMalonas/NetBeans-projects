

package product;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *Calculate the product of three integers
 * @author Dimitrios
 */
public class Product 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        JOptionPane box = new JOptionPane(); 
        
        
        int x=0,y=0,z=0,i=0;
        
        while((i++)<4)
        {
     
            switch(i)
            {
                case 1: 
                    x = Integer.parseInt(box.showInputDialog("Enter number1: "));
                 //   x = input.nextInt();
                    break;
                case 2:
                    y = Integer.parseInt(box.showInputDialog("Enter number2: "));
                   // y = input.nextInt();
                    break;
                case 3:
                    z =  Integer.parseInt(box.showInputDialog("Enter number3: "));
                   // z = input.nextInt();
                    break;
            }
        }
        String message = String.format("Product is %d ",x*z*y);
        box.showMessageDialog(null,message);
    }
    
}
