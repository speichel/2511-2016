package org.usfirst.frc.team2511.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2511.robot.OI;
import org.usfirst.frc.team2511.robot.Robot;
/**
 *
 */
public class DriveMove extends Command {

    public DriveMove() {
        requires(Robot.treadSubsystem);
    }

    double joyY = 0;
    double joyZ = 0;
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	joyY = OI.mainStick.getY();
    	joyZ = OI.mainStick.getZ();
    	Robot.treadSubsystem.changeSpeed(joyY, joyZ);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
