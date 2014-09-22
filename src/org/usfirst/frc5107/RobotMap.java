package org.usfirst.frc5107;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    public static final int
            fLeftMotor = 9,
            rLeftMotor = 10,
            fRightMotor = 8,
            rRightMotor = 7,
            cMotor1 = 3,
            cMotor2 = 4,
            //cameraPan = 5,
            //cameraTilt = 6,
            cFeed = 6,
            cScrew1 = 2,
            cScrew2 = 5,
            solenoid1 = 3,
            solenoid2 = 2;
   
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int
            clawLimit = 2,
            screwUp = 3,
            screwDown = 4;
    
    public static final double
            cMotorSpeed = -.75,
            cFeedSpeed = .5,
            cScrewSpeed = .75;
            
}
