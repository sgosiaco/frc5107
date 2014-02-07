/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc5107.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc5107.RobotMap;
import org.usfirst.frc5107.commands.PneumaticsNeutral;

/**
 *
 * @author BITKRUSHER
 */
public class Pneumatics extends Subsystem {

    Solenoid solenoid1;
    Solenoid solenoid2;
    
    public Pneumatics() {
        solenoid1 = new Solenoid(RobotMap.solenoid1);
        solenoid2 = new Solenoid(RobotMap.solenoid2);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new PneumaticsNeutral());
    }

    public void neutral() {
        solenoid1.set(false);
        solenoid2.set(true);
    }

    public void fire() {
            solenoid1.set(true);
            solenoid2.set(false);
    }

}
