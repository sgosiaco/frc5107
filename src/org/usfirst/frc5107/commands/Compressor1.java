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
public class Compressor1 extends CommandBase {
    
    /**
     * Initialize the command so that it requires the claw. This means it will
     * be interrupted if another command requiring the claw is run.
     */
    public Compressor1() {
        requires(pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1, "          ");
        DriverStationLCD.getInstance().updateLCD();
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1, "ON");
        DriverStationLCD.getInstance().updateLCD();
        pneumatics.compEnable();
    }

    // Called repeatedly when this Command is scheduled to run
    /**
     * Tells the claw to do nothing, stopping any previous movement.
     */
    protected void execute() {
        System.out.println("Comp exec");
        if(pneumatics.compSwitch()==false){
            System.out.println("Comp on");
            pneumatics.compOn();
        }
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
        //pneumatics.compOff();
                DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1, "          ");
        DriverStationLCD.getInstance().updateLCD();
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser3, 1, "OFF");
        DriverStationLCD.getInstance().updateLCD();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}