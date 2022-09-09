/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotics_assignment;

/**
 *
 * @author sreej
 */
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Gear;
public class assignment1b {
    public assignment1b() {
        NxtRobot nxtRobot = new NxtRobot();
        Gear gearBox = new Gear();
        nxtRobot.addPart(gearBox);
        
        gearBox.setSpeed(100);
        while(true){
            gearBox.rightArc(0.5);
        }
    }
    
    public static void main(String[] args){
        assignment1b p =new assignment1b();
    }
    
}
