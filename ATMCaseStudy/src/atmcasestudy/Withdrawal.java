
package atmcasestudy;


public class Withdrawal extends Transaction {
    
    
    
    
    private int amount;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    
    private final static int CANCELED = 6; 
    
    
    public Withdrawal(int userAccountNumber, Screen atmScreen, 
            BankDatabase atmBankDatabase, Keypad atmKeypad ,
            CashDispenser atmCashDispenser)
    {
        super( userAccountNumber, atmScreen, atmBankDatabase ) ;
        keypad = atmKeypad;
        cashDispenser = atmCashDispenser;
    }
    
    
    @Override 
    public void execute()
    {
        boolean cashDispensed = false;
        double availableBalance;
        
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        
        
        do
        {
            amount = displayMenuOfAmounts();
            
            
            if( amount != CANCELED)
            {
                availableBalance = 
                        bankDatabase.getAvailableBalance(getAccountNumber());
                
            }
            
            if(amount <= availableBalance)
            {
                if(cashDispenser.isSufficientCashAvailable(amount))
                {
                    bankDatabase.debit(getAccountNumber(),amount);
                    
                    cashDispenser.dispenseCash(amount);
                    cashDispensed = true;
                    
                    screen.displayMessageLine("\nYour cash has been"+
                            "dispensed. Please take your cash now.");
                    
                }
                else
                    screen.displayMessageLine("\nInsufficient cash available in the ATM."+
                            "\n\nPlease choose a smaller amount.");            
                }
                else
                {
                        screen.displayMessageLine(
                        "\nInsufficient funds in your account."+
                                "\n\nPlease choose a smaller amount");
                }
            }
            else
            {
                screen.displayMessageLine("\nCancelling transaction. . . ");
                return;
            }
        }while( !cashDispensed);
    }
    
    
    private int displayMenuOfAmounts()
    {
        int userChoice = 0;
        
        Screen screen = getScreen();
        
        
        int[] amounts = { 0, 20, 40, 60, 100, 200 };
        
        
        while( userChoice == 0)
        {
            screen.displayMessageLinee("\nWithdrawal Menu: ");
            screen.displayMessageLinee("1 - $20");
            screen.displayMessageLinee("2 - $40");
            screen.displayMessageLinee("3 - $60");
            screen.displayMessageLinee("4 - $100");
            screen.displayMessageLinee("5 - $200");
            screen.displayMessageLinee("6 - Cancel transaction");
            screen.displayMessageLine("\nChoose a withdrawal amount: ");
            
            int input  = keypad.getInput();
            
            switch( input )
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    userChoice =amounts[input];
                    break;
                case CANCELED;
                    userChoice = CANCELED;
                    break;
                default:
                    screen.displayMessageLine("\nInvalid selection. Try again. ");
            }
        }
    }
    
}
