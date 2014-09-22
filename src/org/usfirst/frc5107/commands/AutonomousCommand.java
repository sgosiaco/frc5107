/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;
import org.usfirst.frc5107.subsystems.Camera;

/**
 *
 * @author Conner
 */
public class AutonomousCommand extends CommandBase{
    /**
    Camera camera;
    double speedInches = 60;
    //double boxHeightPixels = camera.boundingHeight();
    double targetHeightInches = 40;
    double Y_IMAGE_RES = 240;
    double pi = 3.1415926;
    public int targetHeightInch;
    double computeDistance (boolean HotOrNot,double boxHeightPixels){
            if(HotOrNot){
                targetHeightInch = 36;
            }else{
                targetHeightInch = 32;
            }
            //using the smaller of the estimated rectangle long side and the bounding rectangle height results in better performance
            //on skewed rectangles
            double distanceInches = targetHeightInch * 120 / (boxHeightPixels * Math.tan(49*pi/(360)));
            double distanceFeet = distanceInches / 12;

            return distanceFeet;
    }

    **/
    
    protected void initialize() {
        DriverStationLCD.getInstance().clear();
        DriverStationLCD.getInstance().updateLCD();
        
    }

    protected void execute() {
      /**  double box = camera.boundingHeight();
        double dist = computeDistance(true,box);
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser6, 1, "DIST:"+dist);
        DriverStationLCD.getInstance().updateLCD();
      //  if(dist > 8){
            if(camera.cogx() > 290){
                driveTrain.valDrive(.25, -.25);
            } else if(camera.cogx() < 50){
                driveTrain.valDrive(.25, .25);
            }else{
                driveTrain.valDrive(.25, 0);
            }
            
      //  }
      * 
      **/
        driveTrain.valDrive(.1, 0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Autonomous Finished");
        DriverStationLCD.getInstance().updateLCD();
    }

    protected void interrupted() {
        
    }
    
}
