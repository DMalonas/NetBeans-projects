package Client;


import Client.ClientGUI;
import java.util.Scanner;


public class Voucher {
     
    private String clientName;


    public Voucher(){}
    
    
    
    
     public Voucher(String clientName) {
        this.clientName = clientName;
    }
    
     
     
     
    public String getClientName(){
       return clientName;
    }
    
    
    public void setClientName(String clientName){
        this.clientName = clientName;
    }
    
    
    @Override
    public String toString() {
        return ("username: \"" + clientName + "\"");
    }
    
}
