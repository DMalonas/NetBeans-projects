
package synch;

public class Caller implements Runnable{

    private String msg; 
    private CallMe target; 
    public Thread t;
    
    public Caller( CallMe targ, String s) {
        target = targ; msg = s;
        t = new Thread( this );
        t.start();
    }
    @Override
    public void run() { target.call( msg ); }
}
    

