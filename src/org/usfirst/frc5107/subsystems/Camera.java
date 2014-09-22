/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc5107.subsystems;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import org.usfirst.frc5107.commands.yTrack;

/**
 *
 * @author Developer
 */
public class Camera extends Subsystem {

    Servo pan;
    NetworkTable server;
    public double xout;
    public double yout;
    public double boxsize;
    public double heightOut;
    double topY;
    double bottomY;
    
    public Camera(){
       server  = NetworkTable.getTable("");
       pan = new Servo(1);
    }
    public void initDefaultCommand() {
        //setDefaultCommand(new yTrack());
    }

    public void servoUp() {
        double up;
        up = pan.get()+.01;
        if (up < 1) {
            pan.set(up);
        }

    }
    public void servoDown() {
        double down;
        down = pan.get()-.01;
        if (down > 0) {
            pan.set(down);
        }
    }
    public double cogx(){
        return xout = server.getNumber("COG_X", 0.0);
    }
    public double cogy(){
        return yout = server.getNumber("COG_Y", 0.0);
    }
    public double boxsize(){
        return boxsize = server.getNumber("COG_BOX_SIZE", 0);
    }
    
    public double boundingHeight(){  
        return heightOut = server.getNumber("COG_BOX_SIZE", 0.0);       
    }
    
    public void yTrack(){
        if(server.getNumber("COG_Y")>140){
         double down;
         down = pan.get()-.005;
         if (down > 0) {
            pan.set(down);
            //Timer.delay(.01);
         }
       }
        else if(server.getNumber("COG_Y")<100){
          double up;
          up = pan.get()+.005;
          if (up < 1) {
            pan.set(up);
            //Timer.delay(.01);
          }

        }
      }
    
    public void distanceToTarget(){
        if(boxsize()<80){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: > 11 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>82&&boxsize()<88){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 10-11 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==82){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 11 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>88&&boxsize()<96){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 9-10 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==88){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 10 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>96&&boxsize()<102){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 8-9 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==96){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 9 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>102&&boxsize()<110){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 7-8 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==102){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 8 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>110&&boxsize()<120){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 6-7 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==110){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 7 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>120&&boxsize()<133){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 5-6 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==120){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 6 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>133&&boxsize()<149){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 4-5 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
        else if(boxsize()==133){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: 5 ft");
           DriverStationLCD.getInstance().updateLCD();
        }
        if(boxsize()>149){
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "                          ");
           DriverStationLCD.getInstance().updateLCD();
           DriverStationLCD.getInstance().println(DriverStationLCD.Line.kUser1, 1, "Distance: < 4 ft");
           DriverStationLCD.getInstance().updateLCD(); 
        }
    }
    double speedInches = 60;
    //double boxHeightPixels = camera.boundingHeight();
    double targetHeightInches = 40;
    double Y_IMAGE_RES = 240;
    double pi = 3.1415926;
    int targetHeightInch;
    public double computeDistance (boolean HotOrNot,double boxHeightPixels){
            double distanceInches = 36 * 120 / (boxHeightPixels * Math.tan(49*pi/(360)));
            double distanceFeet = distanceInches / 12;

            return distanceFeet;
    }
    }

