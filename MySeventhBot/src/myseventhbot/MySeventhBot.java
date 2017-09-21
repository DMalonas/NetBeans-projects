
package myseventhbot;

import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class MySeventhBot extends AdvancedRobot{
    
    private boolean peek;
    private double moveAmount; 
    
    public void run(){
        
        setBodyColor(Color.yellow);
        setGunColor(Color.red);
        setRadarColor(Color.black);
        setBulletColor(Color.cyan);
        setScanColor(Color.white);
        
        turnRadarRightRadians(Double.POSITIVE_INFINITY);
        do{
            moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
            peek = false;
            turnLeft(getHeading() %90);
            ahead(moveAmount);
            peek = true;
            turnGunRight(90);
            turnRight(90);
            scan();
            }while(true);
               
    }
    
   
    public void onScannedRobot(ScannedRobotEvent e) {
         fire(5);
        double angleToEnemy = getHeadingRadians() + e.getBearingRadians();
        
        double radarTurn = Utils.normalRelativeAngle(angleToEnemy - getRadarHeadingRadians());
        
        double extraTurn = Math.min(Math.atan(36.0 / e.getDistance()), Rules.RADAR_TURN_RATE_RADIANS);
        
        radarTurn += (radarTurn < 0 ? -extraTurn : extraTurn );
        
        setTurnRadarRightRadians(radarTurn);
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
        
    }
    
}
