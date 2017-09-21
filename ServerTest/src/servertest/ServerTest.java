



package servertest;

import javax.swing.JFrame;


public class ServerTest 
{

   
    public static void main(String[] args) 
    {
        Server application = new Server();
        Server2 application2 = new Server2();
      
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        application2.waitForPackets();
        application.runServer(); 
    }
    
}
