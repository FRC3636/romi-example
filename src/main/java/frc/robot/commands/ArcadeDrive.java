package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.RobotContainer;
import frc.robot.subsystems.RomiDrivetrain;

import java.util.Set;

public class ArcadeDrive implements Command {
  private final RomiDrivetrain drivetrain;

  public ArcadeDrive(RomiDrivetrain drivetrain) {
    this.drivetrain = drivetrain;
  }

  @Override
  public void execute() {
    drivetrain.arcadeDrive(RobotContainer.joystick.getY(), RobotContainer.joystick.getX());
  }

  @Override
  public Set<Subsystem> getRequirements() {
    return Set.of(drivetrain)
  }
}
