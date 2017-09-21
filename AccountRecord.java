package textfileiotest;

import java.util.Formatter;
import java.util.Scanner;

public class AccountRecord {

   private int _accNum;
   private String _firstName;
   private String _lastName;
   private double _accBalance;

   public AccountRecord() {
   }  // end of default constructor

   public AccountRecord(AccountRecord accRec) {

      this._accNum = accRec._accNum;
      this._firstName = accRec._firstName;
      this._lastName = accRec._lastName;
      this._accBalance = accRec._accBalance;
   }  // end of copy constructor

   public void setAccount(int accNum) {
      this._accNum = accNum;
   }

   public void setFirstName(String firstName) {
      this._firstName = firstName;
   }

   public void setLastName(String lastName) {
      this._lastName = lastName;
   }

   public void setBalance(double accBalance) {
      this._accBalance = accBalance;
   }

   public int getAccount() {
      return this._accNum;
   }

   public String getFirstName() {
      return this._firstName;
   }

   public String getLastName() {
      return this._lastName;
   }

   public double getBalance() {
      return this._accBalance;
   }

   public void setRecord(Scanner input) {
      this.setAccount(input.nextInt()); // read account number
      this.setFirstName(input.next()); // read first name
      this.setLastName(input.next()); // read last name
      this.setBalance(input.nextDouble()); // read balance
   } // end method setRecord

   public void displayRecord() {
      System.out.printf("%-10d%-12s%-12s%10.2f\n",
              this.getAccount(),
              this.getFirstName(),
              this.getLastName(),
              this.getBalance());
   } // end method displayRecord

   public void outputRecord(Formatter output) {
      output.format("%d %s %s %.2f\r\n",
              this.getAccount(),
              this.getFirstName(),
              this.getLastName(),
              this.getBalance());
   } // end method displayRecord

}  // end of class AccountRecord

