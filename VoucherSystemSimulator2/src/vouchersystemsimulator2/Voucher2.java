
package vouchersystemsimulator2;



public class Voucher2 {
    
        
    private String voucherCode, purchaseName, giftRecipientName,
                   deliveryAddress, emailAddress, purchaseDate,
                   flightDate, flightTime, clubName, flightType,
                   gliderNumber,instructorName;
    
    private boolean gift;
    double flightDuration;
    
    //initial voucher constructor
    public Voucher2(String voucherCode, boolean gift, 
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
    
    
    //redeemed voucher constructor
    public Voucher2(String voucherCode, boolean gift, 
                  String purchaseName, String giftRecipientName,
                  String deliveryAddress, 
                  String emailAddress, String purchaseDate,
                  String flightDate, String flightTime, String clubName,
                  String flightType){
        
        this.voucherCode = voucherCode;
        this.gift = gift;
        this.purchaseName = purchaseName;
        this.giftRecipientName = giftRecipientName;
        this.deliveryAddress = deliveryAddress;
        this.emailAddress = emailAddress;
        this.purchaseDate = purchaseDate;
        //extra attributtes 
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.clubName = clubName;
        this.flightType = flightType;
    }
    
    
   //completed voucher constructor
    public Voucher2(String voucherCode, boolean gift, 
                  String purchaseName, String giftRecipientName,
                  String deliveryAddress, 
                  String emailAddress, String purchaseDate,
                  String flightDate, String flightTime, String clubName,
                  String flightType, double flightDuration,
                  String gliderNumber, String instructorName){
        
        this.voucherCode = voucherCode;
        this.gift = gift;
        this.purchaseName = purchaseName;
        this.giftRecipientName = giftRecipientName;
        this.deliveryAddress = deliveryAddress;
        this.emailAddress = emailAddress;
        this.purchaseDate = purchaseDate;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.clubName = clubName;
        this.flightType = flightType;
        //extra attributtes 
        this.flightDuration = flightDuration;
        this.gliderNumber = gliderNumber;
        this.instructorName = instructorName;
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
    
    /*2nd Voucher state access
      specifier methods follow 
    */
    
    
    public String getFlightDate() {
        return flightDate;
    }
    
    public String getFlightTime(){
        return flightTime;
    }
    
    public String getClubName() {
        return clubName;
    }
    
    public String getFlightType() {
        return flightType;
    }
    
    /*3rd Voucher state access
      specifier methods follow 
    */
    
    
    public double getDuration(){
        return flightDuration;
    }
    
    public String getGliderNumber() {
        return gliderNumber;
    }
    
    public String getInstructorName() {
        return instructorName;
    }
}
