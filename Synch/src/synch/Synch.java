
package synch;


public class Synch {
    
    public Synch() { this.runThreads(); }
    public void runThreads() {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronised");
        Caller ob3 = new Caller(target, "World");
        
        
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    
    public static void main(String args[] ) {
        new Synch();
    }
    
}
