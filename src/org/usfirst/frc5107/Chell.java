/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5107;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Chell extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    //Outputs start
    RobotDrive drive = new RobotDrive(1,2);  //Base drive PWM 1&2
    Jaguar cMotor1 = new Jaguar(3); //First gearbox motor PWM 3
    Jaguar cMotor2 = new Jaguar(4); //Second gearbox motor PWM 4
    Servo cameraPan = new Servo(5); //Axis camera pan PWM 5
    Servo cameraTilt = new Servo(6); //Axis camera tilt PWM 6
    Victor cFeed = new Victor(7); //Claw feed motor PWM 7
    Victor cScrew = new Victor(8); //Leadscrew Motor PWM 8
    Solenoid solenoid1 = new Solenoid(1); //Pneumatic Solenoid 1 SOLENOID 1
    Solenoid solenoid2 = new Solenoid(2); //Pneumatic Solenoid 2 SOLENOID 2
    //Outputs end
    //Inputs start
    Joystick leftStick = new Joystick(1); //Left joystick
    Joystick rightStick = new Joystick(2); //Right joystick
    DigitalInput clawLimit = new DigitalInput(2); //Winch limit switch DIO 2
    DigitalInput screwUp = new DigitalInput(3); //Claw up limit DIO 3
    DigitalInput screwDown = new DigitalInput(4); //Claw down limit DIO 4
    //Inputs end
    
    Compressor compressor = new Compressor(1,1); //Air compressor DIO 1 & RELAY 1
    Preferences prefs;
    double cMotorSpeed; //Claw gearbox motor speed
    double cFeedSpeed; //Claw feed motor speed
    double cScrewSpeed; //Claw leadscrew speed
    
    public void autonomous() {
          //Variables start
          //cMotorSpeed = prefs.getDouble("GearboxSpeed", .25);
          //cFeedSpeed = prefs.getDouble("FeedMotorSpeed", .25);
          //cScrewSpeed = prefs.getDouble("ClawLeadscrewSpeed", .25);
          //Variables end
          compressor.enabled();
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
          drive.setSafetyEnabled(false); //TESTING PURPOSES
          //Variables start
          //cMotorSpeed = prefs.getDouble("Gearbox Speed", .25);
          //cFeedSpeed = prefs.getDouble("Feed Motor Speed", .25);
          //cScrewSpeed = prefs.getDouble("Claw Leadscrew Speed", .25);
          //Variables end
          compressor.enabled();
      while(true && isOperatorControl() && isEnabled()){
          System.out.println("Teleop Start");
          drive.tankDrive(leftStick, rightStick); //Tank drive
          
          //Gearbox motor control start
          while(leftStick.getTrigger() && clawLimit.get()== false)
          {
           cMotor1.set(cMotorSpeed);
           cMotor2.set(cMotorSpeed);
          }
          cMotor1.set(0);
          cMotor2.set(0);
          //Gearbox motor control end
          
          //Fire code start
          if(rightStick.getTrigger() && clawLimit.get() == true){
              solenoid1.set(true);
              solenoid2.set(false);
          }
          else
          {
              solenoid1.set(false);
              solenoid2.set(true);
          }
          //Fire code end
          
          //Compressor Auto start
          //while(compressor.getPressureSwitchValue()==true){
          //  compressor.start();
          //}
          //Compressor Auto end
          
          //Claw Feed Motor start
          while(leftStick.getRawButton(3)){
              cFeed.set(cFeedSpeed);
          }
          while(leftStick.getRawButton(2)){
              cFeed.set(-cFeedSpeed);
          }
          cFeed.set(0);
          //Claw Feed Motor end
          
          //Enter servo code here
          
          //Claw Up and Down start
          while(rightStick.getRawButton(3)&&screwUp.get()==false){
              System.out.println("UP");
              cScrew.set(-.25);
          }
          while(rightStick.getRawButton(2)&&screwDown.get()==false){
              System.out.println("DOWN");
              cScrew.set(.25);
          //Claw Up and Down end
          }
          cScrew.set(0);
       }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
