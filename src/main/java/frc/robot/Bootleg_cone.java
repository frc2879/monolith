/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;


/**
 * Add your docs here.
 * try harder scrubs
 * hy did you hurt me like tthat
 * (͡ ° ͜ʖ ͡ °)
 * You need to change the class name to match the file name
 * okay uwu
 */
public class Bootleg_cone extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Solenoid coneMovement = new Solenoid(0);
  Solenoid coneOperation = new Solenoid(1);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new NoidCommander(false));
  }

public void pushingNoid(boolean pressure)
  {
    coneMovement.set(pressure);
  }

  public void openingNoid(boolean pressure)
  { 
    coneOperation.set(pressure);
  }

  

}