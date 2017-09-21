
package vouchersystemsimulator2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class VoucherDatabase2 {
    private List vouchers, vouchers_redeemed, vouchers_completed;
    int flag = 0;
    
    public VoucherDatabase2() { 
        vouchers = new LinkedList();
//        vouchers_redeemed = new LinkedList();
//        vouchers_completed = new LinkedList();
    }
    
    public void addVoucher(String voucherCode, boolean gift,String purchaseName, 
            String giftRecipientName, String deliveryAddress
           ,String emailAddress, String purchaseDate) {
        
        Voucher2 voucher2 = new Voucher2(voucherCode, gift, 
                  purchaseName, giftRecipientName,
                  deliveryAddress, emailAddress, purchaseDate);
        vouchers.add(voucher2);   
    }
    
    
    
    public Voucher2 getVoucher(String voucherCode){
        for( Iterator i = vouchers.iterator(); i.hasNext(); ){
            Voucher2 voucher = (Voucher2)i.next();
            if (voucher.getVoucherCode().equals(voucherCode)) {
                return voucher; 
            }
        }
        return null;
    }
    
    
    public Voucher2 search(Voucher2 searchVoucher) {
        for (Iterator i = vouchers.iterator(); i.hasNext(); ){
            Voucher2 voucher2 = (Voucher2)i.next();
            
            String purchaseName = searchVoucher.getPurchaseName();
            if((purchaseName != null ) && (!purchaseName.equals("")) &&
               (!purchaseName.equals(voucher2.getPurchaseName())))
              continue;
            String giftRecipientName = searchVoucher.getGiftRecipientName(); 
            if ((giftRecipientName != null) && (!giftRecipientName.equals("")) && 
                (!giftRecipientName.equals(voucher2.getGiftRecipientName())))
                continue;
            String deliveryAddress = searchVoucher.getDeliveryAddress();
            if ((deliveryAddress != null) && (!searchVoucher.equals("")) &&
                (!deliveryAddress.equals(voucher2.getDeliveryAddress())))
                continue;
            String emailAddress = searchVoucher.getEmailAddress();
            if ((emailAddress != null) && (!emailAddress.equals("")) &&
                (!emailAddress.equals(voucher2.getEmailAddress())))
               continue;
            String purchaseDate = searchVoucher.getPurchaseDate();
            if ((purchaseDate != null) && (!purchaseDate.equals(""))&&
                (!purchaseDate.equals(voucher2.getPurchaseDate())))
              continue;
            return voucher2; 
        }
        return null;
    }
    
    
    
    /*
        list manipulation to store the redeemed vouchers 
    */
    
       public void addVoucherRedeemed(String voucherCode, boolean gift,
            String purchaseName,String giftRecipientName,
            String deliveryAddress, String emailAddress,
            String purchaseDate,String flightDate, 
            String flightTime, String clubName,String flightType) {
        
        Voucher2 voucher2Redeemed = new Voucher2(voucherCode, gift, 
                  purchaseName, giftRecipientName,
                  deliveryAddress, emailAddress, purchaseDate,
                  flightDate, flightTime, clubName, flightType);
        vouchers.add(vouchers);   
    }
    
    
    
    public Voucher2 getVoucherRedeemed(String voucherCode){
        for( Iterator i = vouchers_redeemed.iterator(); i.hasNext(); ){
            Voucher2 voucher2Redeemed = (Voucher2)i.next();
            if (voucher2Redeemed.getVoucherCode().equals(voucherCode)) {
                return voucher2Redeemed; 
            }
        }
        return null;
    }
    
    
    public Voucher2 searchRedeemed(Voucher2 searchVoucher) {
        for (Iterator i = vouchers_redeemed.iterator(); i.hasNext(); ){
            Voucher2 voucher2Redeemed = (Voucher2)i.next();
            
            String purchaseName = searchVoucher.getPurchaseName();
            if((purchaseName != null ) && (!purchaseName.equals("")) &&
               (!purchaseName.equals(voucher2Redeemed.getPurchaseName())))
              continue;
            String giftRecipientName = searchVoucher.getGiftRecipientName(); 
            if ((giftRecipientName != null) && (!giftRecipientName.equals("")) && 
                (!giftRecipientName.equals(voucher2Redeemed.getGiftRecipientName())))
                continue;
            String deliveryAddress = searchVoucher.getDeliveryAddress();
            if ((deliveryAddress != null) && (!searchVoucher.equals("")) &&
                (!deliveryAddress.equals(voucher2Redeemed.getDeliveryAddress())))
                continue;
            String emailAddress = searchVoucher.getEmailAddress();
            if ((emailAddress != null) && (!emailAddress.equals("")) &&
                (!emailAddress.equals(voucher2Redeemed.getEmailAddress())))
               continue;
            String purchaseDate = searchVoucher.getPurchaseDate();
            if ((purchaseDate != null) && (!purchaseDate.equals(""))&&
                (!purchaseDate.equals(voucher2Redeemed.getPurchaseDate())))
              continue;
            
            String flightDate = searchVoucher.getFlightDate();
            if ((flightDate != null) && (!flightDate.equals(""))&&
                (!flightDate.equals(voucher2Redeemed.getFlightDate())))
              continue;
            String flightTime = searchVoucher.getFlightTime();
            if ((purchaseDate != null) && (!purchaseDate.equals(""))&&
                (!purchaseDate.equals(voucher2Redeemed.getFlightTime())))
              continue;
            String clubName = searchVoucher.getClubName();
            if ((clubName != null) && (!clubName.equals(""))&&
                (!clubName.equals(voucher2Redeemed.getClubName())))
              continue;
            String flightType = searchVoucher.getFlightType();
            if ((flightType != null) && (!flightType.equals(""))&&
                (!flightType.equals(voucher2Redeemed.getFlightType())))
              continue;
            return voucher2Redeemed; 
        }
        return null;
    }
    
    
    
        /*
        list manipulation to store the completed vouchers 
    */
    
       public void addVoucherCompleted(String voucherCode, boolean gift,
            String purchaseName,String giftRecipientName,
            String deliveryAddress, String emailAddress,
            String purchaseDate,String flightDate, 
            String flightTime, String clubName,String flightType,
            double flightDuration,String gliderNumber, String instructorName) {
        
        Voucher2 voucher2Completed = new Voucher2(voucherCode, gift, 
                  purchaseName, giftRecipientName,
                  deliveryAddress, emailAddress, purchaseDate,flightDate, 
                  flightTime, clubName, flightType, flightDuration,
                  gliderNumber, instructorName);
        vouchers.add(voucher2Completed);   
    }
    
    
    
    public Voucher2 getVoucherCompleted(String voucherCode){
        for( Iterator i = vouchers_completed.iterator(); i.hasNext(); ){
            Voucher2 voucher2Completed = (Voucher2)i.next();
            if (voucher2Completed.getVoucherCode().equals(voucherCode)) {
                return voucher2Completed; 
            }
        }
        return null;
    }
    
    
    public Voucher2 searchCompleted(Voucher2 searchVoucher) {
        for (Iterator i = vouchers_completed.iterator(); i.hasNext(); ){
            Voucher2 voucher2Completed = (Voucher2)i.next();
            
            String purchaseName = searchVoucher.getPurchaseName();
            if((purchaseName != null ) && (!purchaseName.equals("")) &&
               (!purchaseName.equals(voucher2Completed.getPurchaseName())))
              continue;
            String giftRecipientName = searchVoucher.getGiftRecipientName(); 
            if ((giftRecipientName != null) && (!giftRecipientName.equals("")) && 
                (!giftRecipientName.equals(voucher2Completed.getGiftRecipientName())))
                continue;
            String deliveryAddress = searchVoucher.getDeliveryAddress();
            if ((deliveryAddress != null) && (!searchVoucher.equals("")) &&
                (!deliveryAddress.equals(voucher2Completed.getDeliveryAddress())))
                continue;
            String emailAddress = searchVoucher.getEmailAddress();
            if ((emailAddress != null) && (!emailAddress.equals("")) &&
                (!emailAddress.equals(voucher2Completed.getEmailAddress())))
               continue;
            String purchaseDate = searchVoucher.getPurchaseDate();
            if ((purchaseDate != null) && (!purchaseDate.equals(""))&&
                (!purchaseDate.equals(voucher2Completed.getPurchaseDate())))
              continue;
            return voucher2Completed; 
        }
        return null;
    }
    
}
