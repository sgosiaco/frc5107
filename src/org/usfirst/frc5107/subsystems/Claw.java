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
    Victor cFeed;
    Jaguar cMotor1;
    Jaguar cMotor2;
    DigitalInput clawUp;
    DigitalInput clawDown;
    DigitalInput clawLimit;
    
    // Initialize your subsystem here
    /**
     * Initialize the claw with the motor declared in {@link RobotMap}
     */
    public Claw() {
        cScrew1 = new Victor(RobotMap.cScrew1);
        cScrew2 = new Victor(RobotMap.cScrew2);
        cFeed = new Victor(RobotMap.cFeed);
        cMotor1 = new Jaguar(RobotMap.cMotor1);
        cMotor2 = new Jaguar(RobotMap.cMotor2);
        clawUp = new DigitalInput(RobotMap.screwUp);
        clawDown = new DigitalInput(RobotMap.screwDown);
        clawLimit = new DigitalInput(RobotMap.clawLimit);
        
    }
    
    /**
     * Initialize the default command to be {@link ClawDoNothing}.
     */
    public void initDefaultCommand() {
        setDefaultCommand(new ClawDoNothing());
    }
    public void springForward(){
        if(clawLimit.get()==false){
        cMotor1.set(RobotMap.cMotorSpeed);
        cMotor2.set(RobotMap.cMotorSpeed);
        }
    }
    public void springReverse(){
        if(clawLimit.get()==false){
        cMotor1.set(-RobotMap.cMotorSpeed);
        cMotor2.set(-RobotMap.cMotorSpeed);
        }
    }
    public void springOff(){
        cMotor1.set(0);
        cMotor2.set(0);
    }
    public void clawUp(){
        if(clawUp.get()==false){
            cScrew1.set(RobotMap.cScrewSpeed);
            cScrew2.set(RobotMap.cScrewSpeed);
        }
    }
    public void clawDown(){
        if(clawDown.get()==false){
            cScrew1.set(-RobotMap.cScrewSpeed);
            cScrew2.set(-RobotMap.cScrewSpeed);
        }
    }
    public void clawOff(){
        cScrew1.set(0);
        cScrew2.set(0);
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
