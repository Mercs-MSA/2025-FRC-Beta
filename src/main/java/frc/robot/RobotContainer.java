// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public class RobotContainer {

  // /* Setting up bindings for necessary control of the swerve drive platform */
  // private final CommandXboxController driverJoystick = new CommandXboxController(0); 
  // private final CommandXboxController operator = new CommandXboxController(1); 

  public RobotContainer() {
    driverControls();
    operatorControls();

    // NamedCommands.registerCommands(autonomousCommands);
    // autoChooser = AutoBuilder.buildAutoChooser("Do Nothing");
    // SmartDashboard.putData("Auto Mode", autoChooser);
  }

  public void driverControls(){
  }

  public void operatorControls(){
  }

}
