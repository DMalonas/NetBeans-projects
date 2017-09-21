
package mythirdrobot;


import java.awt.Color;
import robocode.Robot;
import robocode.ScannedRobotEvent;


public class MyThirdRobot extends Robot {
    public void run(){
        setBodyColor(Color.black);
        setGunColor(Color.red);
        setRadarColor(Color.black);
        setBulletColor(Color.cyan);
        setScanColor(Color.white);
        while(true){
            ahead(50);
            turnGunRight(180);
            back(100);
            turnGunRight(360);
        }
    }
    

    
    public void onScannedRobot(ScannedRobotEvent e) {
            fire(3);

    }

    public static void main(String[] args) {

    }
    
}