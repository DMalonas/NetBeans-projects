
package ducksimulator;


public abstract class Duck {
    
    private FlyBehaviour flyBehaviour;
    private VoiceBehaviour voiceBehaviour;
    private static int counter = 0;
    
    public Duck(FlyBehaviour flyBehaviour, VoiceBehaviour voiceBehaviour){
        
        this.flyBehaviour = flyBehaviour;
        this.voiceBehaviour = voiceBehaviour;
        
        System.out.println("Duck Number: " + counter++);
    }
    
    public abstract String display();
    
    public void swim(){
        System.out.println("Swim");
    }
    
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour; 
    }
    
    public void setVoiceBehaviour(VoiceBehaviour voiceBehaviour){
        this.voiceBehaviour = voiceBehaviour;
    }
    
    public void performVoiceBehaviour(){
        System.out.println(display());
        voiceBehaviour.voice();
    }
    
    public void performFlyBehaviour(){
        flyBehaviour.fly();
    }
    
}
