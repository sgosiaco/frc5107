/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.commands;


/**
 *
 * @author Developer
 */
public class xTrack extends CommandBase{
    private boolean centered;
    public xTrack(){
        requires(camera);
    }
    protected void initialize() {
        
    }

    protected void execute() {
        if(camera.cogx() > 310){
            driveTrain.valDrive(-.25, -.1);
            centered = true;
        }else if(camera.cogx() < 270){
            driveTrain.valDrive(-.25, .1);
            centered = true;
        }else{
            driveTrain.valDrive(0, 0);
            centered = false;
        }
    }

    protected boolean isFinished() {
        return centered;
    }

    protected void end() {
    
    }

    protected void interrupted() {
    
    }
    
}
