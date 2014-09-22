/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.commands;
 import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.networktables2.NetworkTableEntry;
import edu.wpi.first.wpilibj.tables.TableKeyNotDefinedException;
import edu.wpi.first.wpilibj.DriverStationLCD;
/**
 *
 * @author Developer
 */
public class VisionTargetXY {
    public double[] VisionTargetXY(){
        double FuckJava[] = new double[2];
        NetworkTable server = NetworkTable.getTable("Smart Dashboard");
        double xout = server.getNumber("COG_X", 0.0);
        double yout = server.getNumber("COG_Y", 0.0);
        FuckJava[0] = xout;
        FuckJava[1] = yout;
        return FuckJava;
    }
}
