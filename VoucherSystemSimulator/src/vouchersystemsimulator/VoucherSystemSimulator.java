
package vouchersystemsimulator;

public class VoucherSystemSimulator {
    

    public static void main(String[] args) {
        VoucherDatabase voucherDatabase = new VoucherDatabase();
        initialiseVoucherDatabase(voucherDatabase);
        
        Voucher getAVoucher = new Voucher("123", false, "DimitriosMalonas", 
                                 "DimitriosMalonas", 
                "Istrou8", "dimitriosmalonas@outlook.com","1.12.2016");
        
        
        Voucher voucher = voucherDatabase.search(getAVoucher);
  
        if(voucher != null ){
            System.out.println("   Voucher:\n\t" +
                    "Voucher code:\t\t" 
                    +voucher.getVoucherCode() +  "\n\t" +
                    "Gift:\t\t\t" +
                    voucher.getGift() + "\n\t" +
                    "Purchase Name:\t\t"+
                    voucher.getPurchaseName() + "\n\t" +
                    "Gift Recipient Name:\t" +
                    voucher.getGiftRecipientName() + "\n\t" +
                    "Delivery address:\t" +
                    voucher.getDeliveryAddress() + "\n\t" +
                    "Purchase date:\t\t" +
                    voucher.getPurchaseDate() + "\n");
        } else {
          System.out.println("Sorry, this voucher does not exist.");
        }
    }
    
    
    private static void initialiseVoucherDatabase(VoucherDatabase voucherDatabase) { 
        voucherDatabase.addVoucher("123", false, "DimitriosMalonas", 
                "DimitriosMalonas","Istrou8", "dimitriosmalonas@outlook.com",
                "1.12.2016");
        voucherDatabase.addVoucher("1234", true, "TimJohnson", "JoshTimchin", 
                "PrioryStreet8", "timjohnson@outlook.com", "1.10.2017");
    }  
}
