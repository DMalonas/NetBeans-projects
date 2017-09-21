
package mysecondbot;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class MySecondBot extends Robot {
    public void run(){
        while(true){
            ahead(50);
            turnGunRight(180);
            back(100);
            turnGunRight(360);
        }
    }

    
    public void onScannedRobot(ScannedRobotEvent e) {
            fire(1);

    }

    public static void main(String[] args) {

    }
    
}
