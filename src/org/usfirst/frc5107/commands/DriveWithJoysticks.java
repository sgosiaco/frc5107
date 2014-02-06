/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc5107.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;

/**
 *
 * @author BITKRUSHER
 */
public class DriveWithJoysticks extends CommandBase {

    public DriveWithJoysticks() {
        requires(driveTrain);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Tank Drive Start");
        DriverStationLCD.getInstance().updateLCD();
    }

    // Called repeatedly when this Command is scheduled to run
    /**
     * Have the drivetrain drive tank drive with the latest values from joysticks.
     */
    protected void execute() {
        driveTrain.tankDrive(oi.getLeftSpeed(), oi.getRightSpeed());
    }

    // Make this return true when this Command no longer needs to run execute()
    /**
     * @return false, so that it executes forever or until another command
     *         interrupts it.
     */
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                  ");
        DriverStationLCD.getInstance().updateLCD();
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Tank Drive Stop");
        DriverStationLCD.getInstance().updateLCD();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }

}
