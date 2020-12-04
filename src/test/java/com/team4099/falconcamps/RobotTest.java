package com.team4099.falconcamps;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.then;

@RunWith(MockitoJUnitRunner.class)
public class RobotTest {
    @InjectMocks
    Robot robot;

    @Mock
    TalonSRX intake;

    @Mock
    CANSparkMax shooter;

    @Mock
    CANSparkMax shooterFollower;

    @Test
    public void testIntake() {
        robot.robotInit();
        robot.robotPeriodic();
        robot.teleopInit();
        robot.teleopPeriodic();

        then(intake).should().set(ControlMode.PercentOutput, 0.5);
    }

    @Test
    public void testShooter() {
        robot.robotInit();
        robot.robotPeriodic();
        robot.teleopInit();
        robot.teleopPeriodic();

        then(shooter).should().set(0.5);
    }

    @Test
    public void testShooterFollow() {
        robot.robotInit();
        robot.robotPeriodic();
        robot.teleopInit();
        robot.teleopPeriodic();

        then(shooterFollower).should().follow(shooter, true);
    }
}
