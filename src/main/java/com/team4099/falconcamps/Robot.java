package com.team4099.falconcamps;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
    // These fields have been created for you, but you'll need to add an assignment
    private TalonSRX intake;
    private CANSparkMax shooter;
    private CANSparkMax shooterFollower;
}
