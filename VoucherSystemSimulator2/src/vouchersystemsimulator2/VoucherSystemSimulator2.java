
package vouchersystemsimulator2;

public class VoucherSystemSimulator2 {


    public static void main(String[] args) {
    VoucherDatabase2 voucherDatabase2 = new VoucherDatabase2();
        initialiseVoucherDatabase2(voucherDatabase2);
        
        Voucher2 buyAVoucher = new Voucher2("123", false, "DimitriosMalonas", 
                                 "DimitriosMalonas", 
                "Istrou8", "dimitriosmalonas@outlook.com","1.12.2016");
        
                
        Voucher2 redeemAVoucher = new Voucher2("123", false, "DimitriosMalonas", 
                                 "DimitriosMalonas","Istrou8", 
                "dimitriosmalonas@outlook.com","1.12.2016","2.12.2016", 
                "15:30 - 16:00", "FlyClub1","Aerotow");
        
        Voucher2 completeAVoucher = new Voucher2("123", false, "DimitriosMalonas", 
                                 "DimitriosMalonas","Istrou8", 
                "dimitriosmalonas@outlook.com","1.12.2016","2.12.2016", 
                "15:30 - 16:00", "FlyClub1","Aerotow",30,"K-125",
                "James");
        
        
        Voucher2 voucherBought = voucherDatabase2.search(buyAVoucher);
        
        Voucher2 voucherRedeemed = voucherDatabase2.search(redeemAVoucher);
  
        Voucher2 voucherCompleted = voucherDatabase2.search(completeAVoucher);
   
  
        if(voucherBought != null ){
            System.out.println("   Voucher:\n\t" +
                    "Voucher code:\t\t" 
                    +buyAVoucher.getVoucherCode() +  "\n\t" +
                    "Gift:\t\t\t" +
                    buyAVoucher.getGift() + "\n\t" +
                    "Purchase Name:\t\t"+
                    buyAVoucher.getPurchaseName() + "\n\t" +
                    "Gift Recipient Name:\t" +
                    buyAVoucher.getGiftRecipientName() + "\n\t" +
                    "Delivery address:\t" +
                    buyAVoucher.getDeliveryAddress() + "\n\t" +
                    "Purchase date:\t\t" +
                    buyAVoucher.getPurchaseDate() + "\n");
        } else {
          System.out.println("Sorry, this voucher does not exist.");
        }
        
        
        

        if(voucherRedeemed != null ){
            System.out.println("   Voucher Redeemed:\n\t" +
                    "Voucher code:\t\t" 
                    +redeemAVoucher.getVoucherCode() +  "\n\t" +
                    "Gift:\t\t\t" +
                    redeemAVoucher.getGift() + "\n\t" +
                    "Purchase Name:\t\t"+
                    redeemAVoucher.getPurchaseName() + "\n\t" +
                    "Gift Recipient Name:\t" +
                    redeemAVoucher.getGiftRecipientName() + "\n\t" +
                    "Delivery address:\t" +
                    redeemAVoucher.getDeliveryAddress() + "\n\t" +
                    "Purchase date:\t\t" +
                    redeemAVoucher.getPurchaseDate() + "\n\t" +
                    "Flight date:\t\t" +
                    redeemAVoucher.getFlightDate() + "\n\t" +
                    "Flight time:\t\t" +
                    redeemAVoucher.getFlightTime() + "\n\t" +
                    "Club name:\t\t" + 
                    redeemAVoucher.getClubName() + "\n\t" +
                    "Flight type:\t\t" +
                    redeemAVoucher.getFlightType() + "\n\t");
        } else {
          System.out.println("Sorry, this voucher does not exist and "
                  + "therefore it cant be redeemed");
        }
        
        if(voucherCompleted != null ){
            System.out.println("   Voucher Completed:\n\t" +
                    "Voucher code:\t\t" 
                    +completeAVoucher.getVoucherCode() +  "\n\t" +
                    "Gift:\t\t\t" +
                    completeAVoucher.getGift() + "\n\t" +
                    "Purchase Name:\t\t"+
                    completeAVoucher.getPurchaseName() + "\n\t" +
                    "Gift Recipient Name:\t" +
                    completeAVoucher.getGiftRecipientName() + "\n\t" +
                    "Delivery address:\t" +
                    completeAVoucher.getDeliveryAddress() + "\n\t" +
                    "Purchase date:\t\t" +
                    completeAVoucher.getPurchaseDate() + "\n\t" +
                    "Flight date:\t\t" +
                    completeAVoucher.getFlightDate() + "\n\t" +
                    "Flight time:\t\t" +
                    completeAVoucher.getFlightTime() + "\n\t" +
                    "Club name:\t\t" + 
                    redeemAVoucher.getClubName() + "\n\t" +
                    "Flight type:\t\t" +
                    redeemAVoucher.getFlightType() + "\n\t" +
                    "Duration:\t\t" +
                    completeAVoucher.getDuration() + "\n\t" +
                    "Glider number:\t\t" +
                    completeAVoucher.getGliderNumber()+ "\n\t" +
                    "Instructor's name:\t" +
                    completeAVoucher.getInstructorName()+ "\n\t");
        } else {
          System.out.println("Sorry, this voucher does not exist and "
                  + "therefore it cant be completed");
        }
        
        
    }
    
    
    private static void initialiseVoucherDatabase2(VoucherDatabase2 voucherDatabase2) { 
        voucherDatabase2.addVoucher("123", false, "DimitriosMalonas", 
                "DimitriosMalonas","Istrou8", "dimitriosmalonas@outlook.com",
                "1.12.2016");
        voucherDatabase2.addVoucher("1234", true, "TimJohnson", "JoshTimchin", 
                "PrioryStreet8", "timjohnson@outlook.com", "1.10.2017");  
    }
    
    
    private static void initialiseVoucherDatabaseRedeemed2(VoucherDatabase2 voucherDatabase2) { 
        voucherDatabase2.addVoucherRedeemed("123", false, "DimitriosMalonas", 
                "DimitriosMalonas","Istrou8", "dimitriosmalonas@outlook.com",
                "1.12.2016","2.12.2016", "15:30 - 16:00", "FlyClub1","Aerotow");
        voucherDatabase2.addVoucherRedeemed("1234", true, "TimJohnson", 
                "JoshTimchin", "PrioryStreet8", "timjohnson@outlook.com", 
                "1.10.2017","2.02.2017", "15:30 - 16:00", "FlyClub2","Winch");  
    }
    
    
    
    private static void initialiseVoucherDatabaseCompleted2(VoucherDatabase2 voucherDatabase2) { 
        voucherDatabase2.addVoucherCompleted("123", false, "DimitriosMalonas", 
                "DimitriosMalonas","Istrou8", "dimitriosmalonas@outlook.com",
                "1.12.2016","2.12.2016", "15:30 - 16:00", "FlyClub1","Aerotow",
                30,"K-125", "James");
        voucherDatabase2.addVoucherCompleted("1234", true, "TimJohnson", 
                "JoshTimchin", "PrioryStreet8", "timjohnson@outlook.com", 
                "1.10.2017","2.02.2017", "15:30 - 16:00", "FlyClub2","Winch",
                30,"K-124","Stephen");  
    }
    
}
