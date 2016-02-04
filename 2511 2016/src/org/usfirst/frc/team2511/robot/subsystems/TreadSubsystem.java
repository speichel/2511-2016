package org.usfirst.frc.team2511.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TreadSubsystem extends Subsystem {
    
	private static Talon talon1 = new Talon(0);
	private static Talon talon2 = new Talon(1);
	private static Talon talon3 = new Talon(2);
	private static Talon talon4 = new Talon(3);
	
	
	private double leftSpeed = 0;
	private double rightSpeed = 0;
	
	private double limiter = .65;
	private double yBoost = 1.12;
	private double zBoost = 1.1;
	
	public boolean isLimited = true;
	
	public void limit(double limiter) {
		this.limiter = limiter;
	}
	
	public void changeSpeed(double Y, double Z) {
		leftSpeed = (((Y*yBoost)-(Z*zBoost))*limiter);
		rightSpeed = (((Y*yBoost*-1)-(Z*zBoost))*limiter);
		talon1.set(leftSpeed*-1);
		talon2.set(leftSpeed*-1);
		talon3.set(rightSpeed);
		talon4.set(rightSpeed*-1);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

