/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

/**
 *
 * @author dmalonas
 */
public class CompletedVoucher extends RedeemedVoucher
{
    
    public CompletedVoucher(String voucherCode, String purchaserName, boolean gift, String recipientName, String deliveryAddress, String emailAddress, String purchaseDate, String flightDate, String flightTime, String flightClub, String flightType) {
        super(voucherCode, purchaserName, gift, recipientName, deliveryAddress, emailAddress, purchaseDate, flightDate, flightTime, flightClub, flightType);
        // add completed
    }
    
}
