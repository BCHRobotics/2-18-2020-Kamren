/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

public class Ryan {

    private AutoCommands mAutoCommands;

    public Ryan(AutoCommands mAutoCommands){
        this.mAutoCommands = mAutoCommands;
    }

    public void driveToBalls(){
        mAutoCommands.encoderDrive(100, 0.5, 0.5, 250, 10000);
    }

}
