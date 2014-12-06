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
public class GetValues {
    //TODO: Find out if we can call these from a static context in the instqnced class if we set these as public
    
    public GetValues() throws YamlException, IOException{
        FileConnection fc;
        fc = (FileConnection)Connector.open("file:///config.yml", Connector.READ);
        InputStream input = new DataInputStream((InputStream) fc);
        Reader joe  = new InputStreamReader(input);
        fc.close();
        YamlReader reader = new YamlReader(joe);
        Values parsed = (Values) reader.read(Values.class);
        input.close();
        joe.close();
        reader.close();
        
        RobotMap.cFeed = parsed.cFeed;
        RobotMap.cFeedSpeed = parsed.cFeedSpeed;
        RobotMap.cMotor1 = parsed.cMotor1;
        RobotMap.cMotor2 = parsed.cMotor2;
        RobotMap.cMotorSpeed = parsed.cMotorSpeed;
        RobotMap.cScrew1 = parsed.cScrew1;
        RobotMap.cScrew2 = parsed.cScrew2;
        RobotMap.cScrewSpeed = parsed.cScrewSpeed;
        RobotMap.clawLimit = parsed.clawLimit;
        RobotMap.fLeftMotor = parsed.fLeftMotor;
        RobotMap.fRightMotor = parsed.fRightMotor;
        RobotMap.rLeftMotor = parsed.rLeftMotor;
        RobotMap.rRightMotor = parsed.rRightMotor;
        RobotMap.screwDown = parsed.screwDown;
        RobotMap.screwUp = parsed.screwUp;
        RobotMap.solenoid1 = parsed.solenoid1;
        RobotMap.solenoid2 = parsed.solenoid2;
        
    }
}
