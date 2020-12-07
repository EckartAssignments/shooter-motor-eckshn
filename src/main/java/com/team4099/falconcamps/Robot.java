package com.team4099.falconcamps;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
    // These fields have been created for you, but you'll need to add an assignment
    private TalonSRX intake = new TalonSRX(5);
    private CANSparkMax shooter = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    private CANSparkMax shooterFollower = new CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless);

    @Override public void robotInit(){
        intake.set(ControlMode.PercentOutput, 0.5);
        shooter.set(0.5);
        shooterFollower.follow(shooter, false);
    }

    @Override public void autonomousInit(){

    }

    @Override public void teleopInit(){

    }

    @Override public void disabledInit(){

    }

    @Override public void robotPeriodic(){

    }

    @Override public void autonomousPeriodic(){

    }

    @Override public void disabledPeriodic(){

    }

}
