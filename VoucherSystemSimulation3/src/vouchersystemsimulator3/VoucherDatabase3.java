
package vouchersystemsimulator3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class VoucherDatabase3 {
       
    private List vouchers;
    
    
    public VoucherDatabase3() { 
        vouchers = new LinkedList();
    }
    
    public void addVoucher(String voucherCode, boolean gift,String purchaseName, 
            String giftRecipientName, String deliveryAddress
           ,String emailAddress, String purchaseDate) {
        
        Voucher3 voucher3 = new Voucher3();
        vouchers.add(voucher3);   
    }
    
    
    
    public Voucher3 getVoucher(String voucherCode){
        for( Iterator i = vouchers.iterator(); i.hasNext(); ){
            Voucher3 voucher3 = (Voucher3)i.next();
            if (voucher3.getVoucherCode().equals(voucherCode)) {
                return voucher3; 
            }
        }
        return null;
    }
    
    
    public Voucher3 search(Voucher3 searchVoucher) {
        for (Iterator i = vouchers.iterator(); i.hasNext(); ){
            Voucher3 voucher3 = (Voucher3)i.next();
            
            String purchaseName = searchVoucher.();
            if((purchaseName != null ) && (!purchaseName.equals("")) &&
               (!purchaseName.equals(voucher3.getPurchaseName())))
              continue;
            String giftRecipientName = searchVoucher.getGiftRecipientName(); 
            if ((giftRecipientName != null) && (!giftRecipientName.equals("")) && 
                (!giftRecipientName.equals(voucher3.getGiftRecipientName())))
                continue;
            String deliveryAddress = searchVoucher.getDeliveryAddress();
            if ((deliveryAddress != null) && (!searchVoucher.equals("")) &&
                (!deliveryAddress.equals(voucher3.getDeliveryAddress())))
                continue;
            String emailAddress = searchVoucher.getEmailAddress();
            if ((emailAddress != null) && (!emailAddress.equals("")) &&
                (!emailAddress.equals(voucher3.getEmailAddress())))
               continue;
            String purchaseDate = searchVoucher.getPurchaseDate();
            if ((purchaseDate != null) && (!purchaseDate.equals(""))&&
                (!purchaseDate.equals(voucher3.getPurchaseDate())))
              continue;
            return voucher3; 
            }
        }
}
    

