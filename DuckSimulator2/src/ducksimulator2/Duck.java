
package ducksimulator2;


public abstract class Duck {

    FlyBehaviour flyBehaviour;
    VoiceBehaviour voiceBehaviour;  
    
    static int counter = 0, changeBehaviourIndicator = 1;
    
    public Duck(FlyBehaviour flyBehaviour, VoiceBehaviour voiceBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.voiceBehaviour = voiceBehaviour; 
        System.out.println("Duck Number " + counter++);
    }
    
    public void swim(){
        System.out.println("Swim");
    }
    
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
        
    }
    
    public void setVoiceBehaviour(VoiceBehaviour voiceBehaviour){
        this.voiceBehaviour = voiceBehaviour;
    }
    
    public void performFlyBehaviour(){
        System.out.print(display());
        flyBehaviour.fly();
        
    }
    
    public void performVoiceBehaviour(){
        System.out.print(display());
        voiceBehaviour.voice();
    }
    
    public abstract String display();
    
}
