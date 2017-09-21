
package atmcasestudy;


public class BalanceInquiry {
    
    public BalanceInquiry( int userAccountNumber, Screen atmScreen, 
            BankDatabase atmBankDatabase)
    {
        super( userAccountNumber, atmScreen, atmBankDatabase );
    }
    
    @override
    public void execute()
    {
        BankDataBase bankDatabase =  GETbANKdATABASE();
        Screen screen = getScreen();
        
        double availableBalnce = 
                bankDatabase.getAvailableBalance( getAccountNumber());
        
        double totalBalancee = 
                bnkDatabase.getAvailableBalance( getAccountNumber());
        
        
        screen.displayMessageLine("\nBalance Information: ");
        screen.displayMessage("- Available balance: ");
        screen.displayDollarAmount(availableBalance);
        screen.displayMessage("\n-Total balance:    ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    }
}
