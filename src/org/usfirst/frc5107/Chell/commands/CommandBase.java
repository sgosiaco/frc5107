/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc5107.Chell.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5107.Chell.OI;
import org.usfirst.frc5107.Chell.subsystems.DriveTrain;
import org.usfirst.frc5107.Chell.subsystems.CameraGimbal;
import org.usfirst.frc5107.Chell.subsystems.Claw;
import org.usfirst.frc5107.Chell.subsystems.Pneumatics;


/**
 * <p>The CommandBase class is automatically generated when the project is created.
 * However, whenever you create a new subsystem, you must create a public static
 * reference to it in the CommandBase class. All commands (except for
 * CommandGroups) should be subclasses of CommandBase.</p>
 * 
 * <p>Recommended next step: {@link ClawDoNothing}</p>
 * 
 * @author Alex Henning
 */
public abstract class CommandBase extends Command {
    // CommandBase holds a static instance of OI
    public static OI oi;
    
    // Instances of each subsystem
    public static DriveTrain driveTrain = new DriveTrain();
    public static CameraGimbal cameraGimbal = new CameraGimbal();
    public static Pneumatics pneumatics = new Pneumatics();
    public static Claw claw = new Claw();
    
    /**
     * Call this command to properly finish initializing the CommandBase.
     * This call is automatically included in the default template.
     */
    public static void init() {
        oi = new OI();
        
        // Optional: Logs the currently running command for each subsystem in
        //           the SmartDashboard. This can be useful for debugging.
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(cameraGimbal);
        SmartDashboard.putData(pneumatics);
        SmartDashboard.putData(claw);
    }
    
    // Automatically created constructors.
    public CommandBase(String name) { super(name); }
    public CommandBase() { super(); }
}
