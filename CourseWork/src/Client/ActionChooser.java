
package Client;

import java.util.Scanner;


public class ActionChooser {
    
    private String name;
    private int number;
    
    public int choiceOfAction(){
        System.out.println("What would you like to do? "
                + "(1:Buy Voucher, 2:Redeem Voucher, 3: Complete Voucher\n");
        
        Scanner sc = new Scanner(System.in);
        
        while(!sc.hasNextInt()) {
            System.out.println("Wrong input\n");
            sc.next();
        }
        while(sc.hasNextInt()){
            number = sc.nextInt();
            if(number == 1 || number == 2 || number == 3){
                break;
            }
            else{
                System.out.println("Wrong input\n");
                sc.next();
            }
        }
        ClientGUI cg = new ClientGUI();
        
        if(number == 1){
            System.out.println("Buy a voucher");
            
        }
        return number;
    }
}
