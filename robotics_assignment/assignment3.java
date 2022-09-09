/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotics_assignment;

/**
 *
 * @author sreej
 */
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.Part;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
public class assignment3 {
    assignment3() {
        final LegoRobot r = new LegoRobot();
        final Gear g = new Gear();
        final LightSensor l1 = new LightSensor(SensorPort.S1);
        final LightSensor l2 = new LightSensor(SensorPort.S2);
        r.addPart((Part)g);
        r.addPart((Part)l1);
        r.addPart((Part)l2);
        g.forward();
        g.setSpeed(100);
        while (true) {
            final int rightValue = l1.getValue();
            final int leftValue = l2.getValue();
            if (leftValue < 10) {
                g.rightArc(0.05);
            }
            else if (rightValue < 10) {
                g.leftArc(0.05);
            }
            if (leftValue > 10 && rightValue > 10) {
                g.forward();
            }
        }
    }
    
    public static void main(final String[] args) {
        new assignment3();
    }
    
    static {
        RobotContext.setStartPosition(80, 440);
        RobotContext.useBackground("sprites/track.png");
    }
    
}
