/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc5107.RobotMap;
import org.usfirst.frc5107.commands.CommandBase;
import org.usfirst.frc5107.commands.DriveWithJoysticks;

/**
 *
 * @author BITKRUSHER
 */
public class DriveTrain extends Subsystem {
    RobotDrive drive;
    public DriveTrain(){
       drive = new RobotDrive(RobotMap.fRightMotor, RobotMap.rRightMotor, RobotMap.fLeftMotor, RobotMap.rLeftMotor);
       drive.setSafetyEnabled(false);
       drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
       drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
       drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
       drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
 }
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticks());
    }
    public void tankDrive(double left, double right) {
        drive.tankDrive(left, right);
    }

    public void valDrive(double magnitude, double curve) {
        drive.drive(magnitude, curve);
    }
}
