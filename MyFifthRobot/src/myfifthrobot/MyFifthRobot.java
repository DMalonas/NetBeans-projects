
package myfifthrobot;


import java.awt.Color;
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class MyFifthRobot extends Robot {


    private boolean peek;
    private double moveAmount;
 public void run(){
        setBodyColor(Color.yellow);
        setGunColor(Color.red);
        setRadarColor(Color.black);
        setBulletColor(Color.cyan);
        setScanColor(Color.white);
        
        
     moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
     
     peek = false;
     
     turnLeft(getHeading() %90);
     ahead(moveAmount);
     peek = true;
     turnGunRight(90);
     turnRight(90);
     
     while(true){
         peek = true;
         ahead(moveAmount);
         peek = false;
         turnRight(90);
    }
}
    

    
    public void onScannedRobot(ScannedRobotEvent e) {
            fire(5);

    }
    
    public void onHitRobot(HitRobotEvent e){
        if(e.getBearing() > -90 && e.getBearing() <90){
            back(100);
            fire(5);
        }
        else{
            ahead(100);
            fire(5);
        }
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
