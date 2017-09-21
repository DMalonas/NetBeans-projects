
package vouchersystemsimulator;


public class Voucher {
    
    
    private String voucherCode, purchaseName, giftRecipientName,
                   deliveryAddress, emailAddress, purchaseDate;
    private boolean gift;
    
    public Voucher(String voucherCode, boolean gift, 
                  String purchaseName, String giftRecipientName,
                  String deliveryAddress, 
                  String emailAddress, String purchaseDate) {
        this.voucherCode = voucherCode;
        this.gift = gift;
        this.purchaseName = purchaseName;
        this.giftRecipientName = giftRecipientName;
        this.deliveryAddress = deliveryAddress;
        this.emailAddress = emailAddress;
        this.purchaseDate = purchaseDate;
    }
    
    
    public String getVoucherCode(){
        return voucherCode;
    }
    
    public boolean getGift(){
        return gift;
    }
    
    public String getPurchaseName(){
        return purchaseName;
    }
    
    public String getGiftRecipientName(){
        return giftRecipientName;
    }
    
    public String getDeliveryAddress(){
        return deliveryAddress;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public String getPurchaseDate(){
        return purchaseDate;
    }
    

}
