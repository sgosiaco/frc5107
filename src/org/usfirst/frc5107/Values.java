/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107;

import net.sourceforge.yamlbeans.YamlException;
import net.sourceforge.yamlbeans.YamlReader;
import com.sun.squawk.microedition.io.FileConnection;
import javax.microedition.io.Connector;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/**
 *
 * @author Conner
 */
public class Values {
    //TODO: Find out if we can call these from a static context in the instqnced class if we set these as public
    private int
            fLeftMotor,
            rLeftMotor,
            fRightMotor,
            rRightMotor,
            cMotor1,
            cMotor2,
            cFeed,
            cScrew1,
            cScrew2,
            solenoid1,
            solenoid2;
    private int
            clawLimit,
            screwUp,
            screwDown;
    private double
            cMotorSpeed,
            cFeedSpeed,
            cScrewSpeed;
    
    public Values() throws YamlException, IOException{
        FileConnection fc;
        fc = (FileConnection)Connector.open("file:///config.yml", Connector.READ);
        InputStream input = new DataInputStream((InputStream) fc);
        Reader joe  = new InputStreamReader(input);
        fc.close();
        YamlReader reader = new YamlReader(joe);
        Object parsed = reader.read(vals.class);
        //Extend this for each variable
        this.cMotorSpeed = vals.cMotorSpeed;
    }
}
