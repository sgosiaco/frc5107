/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.auto;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc5107.commands.ClawDown;
import org.usfirst.frc5107.commands.FeedForward;
import org.usfirst.frc5107.commands.PneumaticsFire;
import org.usfirst.frc5107.commands.SpringForward;
import org.usfirst.frc5107.commands.xTrack;

/**
 *
 * @author Developer
 */
public class AutonSt00f extends CommandGroup{
    
    public AutonSt00f(){
        //addSequential(new MoveToGoal(-.5, 0, .5));
        //addParallel(new SpringForward(), 3);
        //addParallel(new ClawDown(), 3);
        addSequential(new MoveToGoal(-.25, 0, 1));
        addSequential(new MoveToGoal(0, 0, .25));
        addSequential(new MoveToGoal(.5, 0, 1));
        addSequential(new MoveToGoal(0, 0, .25));
        addSequential(new MoveToGoal(.25, .25, 1));
        //addParallel(new FeedForward(), 3);
        //addSequential(new xTrack());
        //addSequential(new AimClaw());    //Like yTrack
        //addSequential(new PneumaticsFire());
    
    }
    
}
