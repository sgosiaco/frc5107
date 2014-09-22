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
public class Claw extends Subsystem {
        // The claws motor
    Victor cScrew1;
    Victor cScrew2;
    Jaguar cMotor1;
    Jaguar cMotor2;
    //Victor cFeed;
    DigitalInput clawLimit;
    DigitalInput clawUp;
    DigitalInput clawDown;
    
    // Initialize your subsystem here
    /**
     * Initialize the claw with the motor declared in {@link RobotMap}
     */
    public Claw() {
        cScrew1 = new Victor(RobotMap.cScrew1);
        cScrew2 = new Victor(RobotMap.cScrew2);
        clawUp = new DigitalInput(RobotMap.screwUp);
        clawDown = new DigitalInput(RobotMap.screwDown);
        cMotor1 = new Jaguar(RobotMap.cMotor1);
        cMotor2 = new Jaguar(RobotMap.cMotor2);
        clawLimit = new DigitalInput(RobotMap.clawLimit);
        //cFeed = new Victor(RobotMap.cFeed);
        
    }
    
    /**
     * Initialize the default command to be {@link ClawDoNothing}.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new ClawDoNothing());
    }
    public void clawUp(){
            cScrew1.set(RobotMap.cScrewSpeed);
            cScrew2.set(RobotMap.cScrewSpeed);
            
    }
    public void clawDown(){
            cScrew1.set(-RobotMap.cScrewSpeed);
            cScrew2.set(-RobotMap.cScrewSpeed);
    }
    public void clawOff(){
        cScrew1.set(0);
        cScrew2.set(0);
    }
    public void springForward(){
        cMotor1.set(RobotMap.cMotorSpeed);
        cMotor2.set(RobotMap.cMotorSpeed);

    }
    public void springReverse(){
        cMotor1.set(-RobotMap.cMotorSpeed);
        cMotor2.set(-RobotMap.cMotorSpeed);
    }
    public void springOff(){
        cMotor1.set(0);
        cMotor2.set(0);
    }
    //public void feedForward(){
    //    cFeed.set(RobotMap.cFeedSpeed);
    //}
    //public void feedReverse(){
    //    cFeed.set(-RobotMap.cFeedSpeed);
    //}
    //public void feedOff(){
    //    cFeed.set(0);
    //}
    public boolean clawlimit(){
        return clawLimit.get();
    }
}
