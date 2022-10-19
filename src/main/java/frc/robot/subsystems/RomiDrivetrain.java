// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RomiDrivetrain extends SubsystemBase {
  // The Romi has the left and right motors set to
  // PWM channels 0 and 1 respectively
  private final Spark leftMotor = new Spark(0);
  private final Spark rightMotor = new Spark(1);

  private final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor, rightMotor);

  /** Called when a new Drive Train is created */
  public RomiDrivetrain() {
    // Invert right side since motor is flipped
    m_rightMotor.setInverted(true);
  }

  // Arcade Drive is the control system we use on our main robot
  // One Axis of the joystick is mapped to robot speed, and the other is map to turning speed.
  public void arcadeDrive(double speed, double turnRate) {
    differentialDrive.arcadeDrive(speed, turnRate);
  }
}
