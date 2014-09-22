/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc5107.auto;

import org.usfirst.frc5107.commands.CommandBase;
/**
 *
 * @author Developer
 */
class AimClaw extends CommandBase {

    public AimClaw() {
        requires(claw);
    }

    protected void initialize() {
        claw.clawUp();
        setTimeout(1);
    }

    protected void execute() {
    
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        claw.clawOff();
    }

    protected void interrupted() {
    
    }
    
}
