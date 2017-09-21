
package clienttest;

import javax.swing.JFrame;


public class ClientTest 
{


    public static void main(String[] args) 
    {
        Client application;
        
        if( 0 == args.length )
            application = new Client( "127.0.0.1" );
        else
            application = new Client( args[ 0 ] );
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.runClient();
    }
    
}
