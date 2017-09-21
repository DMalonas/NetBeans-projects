
package printtest;


public class PrintThread extends Thread{
    
    int sleepTime;
    
    public PrintThread(){
        super();
        
        sleepTime = (int) (Math.random() * 5000 );
        
        System.out.println("Name" + this.getName() +
                            "; sleep: " + sleepTime);
    }
    
    public void run() {
        
        try{
            Thread.sleep(sleepTime);
        }
        catch(InterruptedException exception){
            System.err.println(exception.toString());
        }
        System.out.println(getName());
    }
}
