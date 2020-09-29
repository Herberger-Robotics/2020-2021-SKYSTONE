package org.firstinspires.ftc.teamcode.subsystems.Turret;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.SimpleMotor;
import com.arcrobotics.ftclib.hardware.motors.SimpleMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.hardwaremaps.motors.HowlersMotor;

public class Turret extends SubsystemBase {

    public enum FlywheelState {
        OFF,
        SPINNING_UP_MIN,
        SPINNING_UP_MAX,
        SPINNING_DOWN,
        MIN,
        MAX
    }

    public FlywheelState flywheelState;

    private HowlersMotor m_flywheel;

    public Turret(final HardwareMap hMap, final HowlersMotor flywheel) {

        m_flywheel = flywheel;
        flywheelState = FlywheelState.MAX;
    }

    public void setSpeed(double speed) {
        m_flywheel.set(speed);
    }

    public void stop() {
        m_flywheel.stopMotor();
    }

    public void setState(FlywheelState state) {
        flywheelState = state;
    }

    public double getCurrentTicks() {
        return m_flywheel.getEncoderCount();
    }

}
