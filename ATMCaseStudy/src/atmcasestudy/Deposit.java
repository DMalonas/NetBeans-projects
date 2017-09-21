
package atmcasestudy;


public class Deposit extends Transaction{

   private double amount;
   private Keypad keypad;
   private Deposit depositSlot;
   private final static int CANCELED = 0;




   public Deposit(int userAccountNumber, Screen atmScreen,
           BankDatabase atmBankDatabase, Keypad atmKeypad,
           Deposit atmDeposit)
   {
       super( userAccountNumber, atmScreen, atmBankDatabase) ;
       
       keypad = atmKeypad;
       depositSlot = atmDeposit;
   }
   
   @Override
   public void execute()
   {
       BankDatabase bankDatabase = getBankDatabase();
       Screen screen  = getScreen();
       
       amount = promptForDepositAmount();
       
       
       if( amount != CANCELED )
       {
           screen.displayMessage(
            "\nPlease insert a deposit envelope containing ");
           screen.displayMessage("\nPlease insert a deposit envelope containing ");
           screen.displayDollarAmmount(amount);
           screen.displayMessageLine(".");
           
           boolean envelopeReceived = depositSlot.isEnvelopeReceived();
           
           
           if( envelopeReceived)
           {
               screen.displayMessageLine("\nYour envelope has been " +
                       "received.\nNOTE: The money just deposited will not"+
                       "be available until we verify the amount of any" +
                       "enclosed cash and your checks clear.");
               
               bankDatabase.credit(getAccountNumber(), amount);
               
           }
           else
           {
               screen.displayMessageLine("\nYou did not insert an"+
                       "envelope, so the ATM has canceled the transaction.");
           }
       }
       else
       {
           screen.displayMessageLine("\nCancelling transaction... ");
       }
   }
   
   private double promptForDepositAmount()
   {
       Screen screen = getScreen();
       Screen.displayMessage("\nPlease enter a deposit amount in"+
               "CENTS (or 0 to cancel) : ");
       int input = keypad.getInput();
       
       
       if( input == CANCELED)
           return CANCELED;
       else
       {
           return( double ) input / 100;
       }
   }
}
