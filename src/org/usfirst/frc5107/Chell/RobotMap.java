// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc5107.Chell;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftMotor;
    public static SpeedController driveTrainRightMotor;
    public static RobotDrive driveTrainRobotDrive;
    public static Compressor pneumaticsCompressor1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid1;
    public static Servo cameraGimbalServo1;
    public static Servo cameraGimbalServo2;
    public static SpeedController clawClawFeed;
    public static SpeedController clawWinchMotor1;
    public static SpeedController clawWinchMotor2;
    public static SpeedController clawSmallGearbox1;
    public static SpeedController clawSmallGearbox2;
    public static DigitalInput clawWinchLimit;
    public static DigitalInput clawClawUpLimit;
    public static DigitalInput clawClawDownLimit;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMotor = new Victor(1);
	LiveWindow.addActuator("Drive Train", "Left Motor", (Victor) driveTrainLeftMotor);
        
        driveTrainRightMotor = new Victor(2);
	LiveWindow.addActuator("Drive Train", "Right Motor", (Victor) driveTrainRightMotor);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
	
        driveTrainRobotDrive.setSafetyEnabled(false);
        //driveTrainRobotDrive.setExpiration(0.1);
        //driveTrainRobotDrive.setSensitivity(0.5);
        //driveTrainRobotDrive.setMaxOutput(1.0);
        
        pneumaticsCompressor1 = new Compressor(1, 1, 1, 1);
	
        
        pneumaticsDoubleSolenoid1 = new DoubleSolenoid(1, 1, 2);      
	
        
        cameraGimbalServo1 = new Servo(1, 5);
	LiveWindow.addActuator("Camera Gimbal", "Servo 1", cameraGimbalServo1);
        
        cameraGimbalServo2 = new Servo(1, 6);
	LiveWindow.addActuator("Camera Gimbal", "Servo 2", cameraGimbalServo2);
        
        clawClawFeed = new Victor(1, 7);
	LiveWindow.addActuator("Claw", "Claw Feed", (Victor) clawClawFeed);
        
        clawWinchMotor1 = new Jaguar(1, 3);
	LiveWindow.addActuator("Claw", "Winch Motor 1", (Jaguar) clawWinchMotor1);
        
        clawWinchMotor2 = new Jaguar(1, 4);
	LiveWindow.addActuator("Claw", "Winch Motor 2", (Jaguar) clawWinchMotor2);
        
        clawSmallGearbox1 = new Victor(1, 8);
	LiveWindow.addActuator("Claw", "SmallGearbox 1", (Victor) clawSmallGearbox1);
        
        clawSmallGearbox2 = new Victor(1, 9);
	LiveWindow.addActuator("Claw", "SmallGearbox 2", (Victor) clawSmallGearbox2);
        
        clawWinchLimit = new DigitalInput(1, 2);
	LiveWindow.addSensor("Claw", "WinchLimit", clawWinchLimit);
        
        clawClawUpLimit = new DigitalInput(1, 3);
	LiveWindow.addSensor("Claw", "ClawUp Limit", clawClawUpLimit);
        
        clawClawDownLimit = new DigitalInput(1, 4);
	LiveWindow.addSensor("Claw", "ClawDown Limit", clawClawDownLimit);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
