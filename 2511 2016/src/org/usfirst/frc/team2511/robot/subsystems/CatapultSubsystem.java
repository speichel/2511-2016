package org.usfirst.frc.team2511.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {
    
    Solenoid solenoid1 = new Solenoid(1);
    
    public void fire() {
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	iterate();
//    	Timer.delay(2);
    	solenoid1.set(true);
    	Timer.delay(.225);
    	solenoid1.set(false);
    }
    
    public void iterate() {
    	solenoid1.set(true);
    	Timer.delay(0.1);
    	solenoid1.set(false);
    	Timer.delay(0.0075);
    }
    
//    public void retract() {
//    	solenoid1.set(false);
//    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

