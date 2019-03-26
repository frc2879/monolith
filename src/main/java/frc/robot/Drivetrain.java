/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
private static final double deadZone = 0.4;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX frw;
  WPI_TalonSRX flw;
  WPI_TalonSRX brw;
  WPI_TalonSRX blw;
  public Drivetrain(WPI_TalonSRX frw,WPI_TalonSRX flw,WPI_TalonSRX brw,WPI_TalonSRX blw){
    this.frw = frw;
    this.flw = flw;
    this.brw = brw;
    this.blw = blw;

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

public void testdrive(double speed){

  frw.set(speed);

}

public void stickdrive(double speed, double angle){
  
  /*
  if(angle > deadZone || angle < -deadZone) {
    blw.setNeutralMode(NeutralMode.Coast);
    brw.setNeutralMode(NeutralMode.Coast);
    blw.set(0);
    brw.set(0);
    frw.set((speed+angle)/-3);
    flw.set((speed-angle)/3);
  } else {
    */
    frw.set((speed+angle)/-5);
    flw.set((speed-angle)/5);
    brw.set((speed+angle)/-5);
    blw.set((speed-angle)/5);
  // }

}

public void testwheel(WPI_TalonSRX wheel,double speed){

  wheel.set(speed);

}
}
