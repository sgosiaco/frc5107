/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc5107.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc5107.RobotMap;
import org.usfirst.frc5107.commands.Compressor1;

/**
 *
 * @author BITKRUSHER
 */
public class Pneumatics extends Subsystem {

    Solenoid solenoid1;
    Solenoid solenoid2;
    Compressor comp1;
    
    public Pneumatics() {
        solenoid1 = new Solenoid(3);
        solenoid2 = new Solenoid(RobotMap.solenoid2);
        comp1 = new Compressor(1,1);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new Compressor1());
    }

    public void neutral() {
        solenoid1.set(false);
        solenoid2.set(true);
    }

    public void fire() {
            solenoid1.set(true);
            solenoid2.set(false);
    }
    public void compOn(){
        comp1.start();
    }
    public void compOff(){
        comp1.stop();
    }
    public void compEnable(){
        comp1.enabled();
    }
    public boolean compSwitch(){
        return comp1.getPressureSwitchValue();
    }

}
