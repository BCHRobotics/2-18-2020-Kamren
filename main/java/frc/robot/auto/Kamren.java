/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

public class Kamren {

    private AutoCommands mAutoCommands;

    public Kamren(AutoCommands mAutoCommands){
        this.mAutoCommands = mAutoCommands;
    }

    public void start3LowTrench(){
        mAutoCommands.straightDrive(12, -0.004, 0.005, 2, 250, 1700);
        mAutoCommands.gyroTurn(43, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(200, -0.004, 0.005, 2, 250, 1700);
        //shoot
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            //Dont Sleep
        }

        mAutoCommands.gyroTurn(71, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(211, -0.004, 0.005, 2, 250, 1700);
        
    }
    
    public void start2HighHome(){
        //drive towardsgoal
        mAutoCommands.straightDrive(12, -0.004, 0.005, 2,250, 1700);
        mAutoCommands.gyroTurn(45, 0.5, 3, 250, 1700);  
        mAutoCommands.straightDrive(87, -0.004, 0.005, 2, 250, 1700);
        mAutoCommands.gyroTurn(45, 0.5, 3, 250, 3750); 
        mAutoCommands.straightDrive(48, -0.004, 0.005, 2, 250, 1700);  
        mAutoCommands.gyroTurn(180, 0.5, 3, 250, 1700);
        //shoot
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            //Dont Sleep
        }
        //turn towards trench
        mAutoCommands.gyroTurn(180, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(240, -0.004, 0.005, 2, 250, 1700);
        mAutoCommands.gyroTurn(42, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(80, -0.004, 0.005, 2, 250, 1400);
    }

    public void start3HighHome(){
        mAutoCommands.straightDrive(12, -0.004, 0.005, 2, 250, 1700);
        mAutoCommands.gyroTurn(82, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(111, -0.004, 0.005, 2, 250, 1700);
            //shoot
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                //Dont Sleep
            }
            //turn towards trench
        mAutoCommands.gyroTurn(180, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(220, -0.004, 0.005, 2, 250, 1700);
        mAutoCommands.gyroTurn(42, 0.5, 3, 250, 1700);
        mAutoCommands.straightDrive(80, -0.004, 0.005, 2, 250, 1400);
    }
}
