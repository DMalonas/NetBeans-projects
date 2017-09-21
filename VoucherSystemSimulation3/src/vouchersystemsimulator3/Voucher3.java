
package vouchersystemsimulator3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Voucher3{
    
    public int flag = -1;
    private static int counter = 0;
    private int voucherCode=0; 
    
    private String purchaseName, giftRecipientName,
                   deliveryAddress, emailAddress, purchaseDate,
                   flightDate, flightTime, clubName, flightType,
                   gliderNumber,instructorName;
    
    private boolean gift;
    double flightDuration;
    
    
    
    public Voucher3(){
        

    }


    
    
    public void buyVoucher(){
        Scanner sc = new Scanner(System.in);
        
        Voucher3 voucher3  = new Voucher3();
        this.voucherCode = counter;
        counter++;
        
        flag = 0;
        
        System.out.print("Voucher code:  " + voucherCode + "\n");
        
        System.out.print("Buyer's name: " );
        purchaseName = sc.nextLine();
        System.out.print("Gift (Yes=1/No=2): ");
        gift = sc.nextBoolean();
        System.out.print("Delivery Address: ");
        deliveryAddress = sc.nextLine();
        System.out.print("Email Adress: ");
        emailAddress = sc.nextLine();
        System.out.print("Purchase Date: ");
        purchaseDate = sc.nextLine();
        
    }
    
    public void validateVoucher(){
        
    }
    
    public void completeVoucher(){
        
    }
    
}
