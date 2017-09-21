
package oreillybyname;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class OReillyByName {


    public static void main(String[] args){
        
        try {
            InetAddress address = InetAddress.getByName("208.201.239.100");
            System.out.println(address.getHostName());
            
            InetAddress addresses[] = InetAddress.getAllByName(("www.oreilly.com"));
            for (InetAddress address1 : addresses){
                System.out.println(address1);
            }
            InetAddress me = InetAddress.getLocalHost();
            System.out.println(me);
        } catch (UnknownHostException ex){
            System.out.println("Could not find www.oreilly.com");
        }
    }
    
}
