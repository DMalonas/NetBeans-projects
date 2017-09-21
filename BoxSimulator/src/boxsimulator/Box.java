package boxsimulator;


abstract public class Box {
    
   private boolean isOpen;
   private static int getCount; 
   
   public Box(){
       getCount++;
   }
   
   public static int getCount(){
       return getCount;
   }
    
    
    public void open(){
        this.isOpen = true;
        System.out.println("Open");
        
    }
    
    public void close(){
        this.isOpen = false;
        System.out.println("Close");

    }
    
}
