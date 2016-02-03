package org.usfirst.frc.team2511.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {
    
    Solenoid solenoid1 = new Solenoid(1);
    
    public void fire() {
    	solenoid1.set(true);
    }
    public void retract() {
    	solenoid1.set(false);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

