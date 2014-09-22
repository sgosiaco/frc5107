/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc5107.RobotMap;
import org.usfirst.frc5107.commands.ClawDoNothing;

/**
 *
 * @author BITKRUSHER
 */
public class ClawFeed extends Subsystem {
        // The claws motor
    Victor cFeed;
    
    // Initialize your subsystem here
    /**
     * Initialize the claw with the motor declared in {@link RobotMap}
     */
    public ClawFeed() {
        cFeed = new Victor(RobotMap.cFeed);
        
    }
    
    /**
     * Initialize the default command to be {@link ClawDoNothing}.
     */
    public void initDefaultCommand() {
        //setDefaultCommand(new ClawDoNothing());
    }
    public void feedForward(){
        cFeed.set(RobotMap.cFeedSpeed);
    }
    public void feedReverse(){
        cFeed.set(-RobotMap.cFeedSpeed);
    }
    public void feedOff(){
        cFeed.set(0);
    }
}
