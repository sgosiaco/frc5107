
package org.usfirst.frc5107;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc5107.commands.ClawDown;
import org.usfirst.frc5107.commands.ClawUp;
import org.usfirst.frc5107.commands.FeedForward;
import org.usfirst.frc5107.commands.FeedReverse;
import org.usfirst.frc5107.commands.PneumaticsFire;
import org.usfirst.frc5107.commands.SpringForward;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    Joystick leftStick = new Joystick(1);
    Button  lButton1 = new JoystickButton(leftStick, 1),
            lButton2 = new JoystickButton(leftStick, 2),
            lButton3 = new JoystickButton(leftStick, 3),
            lButton4 = new JoystickButton(leftStick, 4),
            lButton5 = new JoystickButton(leftStick, 5),
            lButton6 = new JoystickButton(leftStick, 6),
            lButton7 = new JoystickButton(leftStick, 7),
            lButton8 = new JoystickButton(leftStick, 8);
    Joystick rightStick = new Joystick(2);
    Button  rButton1 = new JoystickButton(rightStick, 1),
            rButton2 = new JoystickButton(rightStick, 2),
            rButton3 = new JoystickButton(rightStick, 3),
            rButton4 = new JoystickButton(rightStick, 4),
            rButton5 = new JoystickButton(rightStick, 5),
            rButton6 = new JoystickButton(rightStick, 6),
            rButton7 = new JoystickButton(rightStick, 7),
            rButton8 = new JoystickButton(rightStick, 8);
    public OI(){
        lButton1.whileHeld(new SpringForward());
        rButton1.whenPressed(new PneumaticsFire());
        lButton3.whileHeld(new FeedForward());
        lButton2.whileHeld(new FeedReverse());
        rButton3.whileHeld(new ClawUp());
        rButton2.whileHeld(new ClawDown());
    }
    public double getLeftSpeed() {
        return leftStick.getY();
    }
    public double getRightSpeed() {
        return rightStick.getY();
    }
}

