
package vouchersystemsimulator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




import java.util.*;


public class VoucherDatabase {
    
    private List vouchers;
    
    
    public VoucherDatabase() { 
        vouchers = new LinkedList();
    }
    
    public void addVoucher(String voucherCode, boolean gift,String purchaseName, 
            String giftRecipientName, String deliveryAddress
           ,String emailAddress, String purchaseDate) {
        
        Voucher voucher = new Voucher(voucherCode, gift, 
                  purchaseName, giftRecipientName,
                  deliveryAddress, emailAddress, purchaseDate);
        vouchers.add(voucher);   
    }
    
    
    
    public Voucher getVoucher(String voucherCode){
        for( Iterator i = vouchers.iterator(); i.hasNext(); ){
            Voucher voucher = (Voucher)i.next();
            if (voucher.getVoucherCode().equals(voucherCode)) {
                return voucher; 
            }
        }
        return null;
    }
    
    
    public Voucher search(Voucher searchVoucher) {
        for (Iterator i = vouchers.iterator(); i.hasNext(); ){
            Voucher voucher = (Voucher)i.next();
            
            String purchaseName = searchVoucher.getPurchaseName();
            if((purchaseName != null ) && (!purchaseName.equals("")) &&
               (!purchaseName.equals(voucher.getPurchaseName())))
              continue;
            String giftRecipientName = searchVoucher.getGiftRecipientName(); 
            if ((giftRecipientName != null) && (!giftRecipientName.equals("")) && 
                (!giftRecipientName.equals(voucher.getGiftRecipientName())))
                continue;
            String deliveryAddress = searchVoucher.getDeliveryAddress();
            if ((deliveryAddress != null) && (!searchVoucher.equals("")) &&
                (!deliveryAddress.equals(voucher.getDeliveryAddress())))
                continue;
            String emailAddress = searchVoucher.getEmailAddress();
            if ((emailAddress != null) && (!emailAddress.equals("")) &&
                (!emailAddress.equals(voucher.getEmailAddress())))
               continue;
            String purchaseDate = searchVoucher.getPurchaseDate();
            if ((purchaseDate != null) && (!purchaseDate.equals(""))&&
                (!purchaseDate.equals(voucher.getPurchaseDate())))
              continue;
            return voucher; 
        }
        return null;
    }
}

