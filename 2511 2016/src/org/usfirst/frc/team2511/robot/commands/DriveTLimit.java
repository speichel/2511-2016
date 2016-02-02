package org.usfirst.frc.team2511.robot.commands;

import org.usfirst.frc.team2511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTLimit extends Command {
	
	private boolean finished = false;

    public DriveTLimit() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.treadSubsystem);
    }
    

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.treadSubsystem.isLimited) {
    		Robot.treadSubsystem.isLimited=false;
    		Robot.treadSubsystem.limit(1);
    	} else {
    		Robot.treadSubsystem.isLimited=true;
    		Robot.treadSubsystem.limit(.65);
    	}
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	finished = false;    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
