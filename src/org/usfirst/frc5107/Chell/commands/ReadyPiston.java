// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc5107.Chell.commands;
import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5107.Chell.OI;
import org.usfirst.frc5107.Chell.Robot;
import org.usfirst.frc5107.Chell.RobotMap;
/**
 *
 */
public class  ReadyPiston extends Command {
    public static OI oi;
    private double cMotorSpeed;
    public ReadyPiston() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.claw);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        cMotorSpeed=.75;
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(RobotMap.clawWinchLimit.get()== false)
          {
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser2, 1, "Gearbox Start");
           DriverStationLCD.getInstance().updateLCD();
           RobotMap.clawWinchMotor1.set(cMotorSpeed);
           RobotMap.clawWinchMotor2.set(cMotorSpeed);
          }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
        RobotMap.clawWinchMotor1.set(0);
        RobotMap.clawWinchMotor2.set(0);
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}