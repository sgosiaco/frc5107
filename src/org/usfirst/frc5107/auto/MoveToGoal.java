/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.auto;

import org.usfirst.frc5107.commands.CommandBase;
import org.usfirst.frc5107.subsystems.DriveTrain;

/**
 *
 * @author Developer
 */
public class MoveToGoal extends CommandBase {

    private double speed;
    private double curve;
    
    private double time;
    public MoveToGoal(double speed, double curve, double timeout) {
        this.curve = curve;
        this.speed = speed;
        this.time = timeout;
        requires(driveTrain);
    }

    protected void initialize() {
        driveTrain.valDrive(speed, curve);
        setTimeout(time);
    }

    protected void execute() {
    
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        driveTrain.valDrive(0, 0);
    }

    protected void interrupted() {
    
    }
    
}
