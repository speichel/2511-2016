package org.usfirst.frc.team2511.robot.commands;

import org.usfirst.frc.team2511.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LaunchCatapult extends Command {

	private boolean finished = false;
	
    public LaunchCatapult() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.catapultSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	finished = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
  		Robot.catapultSubsystem.fire();
    	this.finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return this.finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	this.finished = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
