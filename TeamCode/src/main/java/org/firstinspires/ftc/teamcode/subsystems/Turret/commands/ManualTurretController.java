package org.firstinspires.ftc.teamcode.subsystems.Turret.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.controller.PIDController;
import com.arcrobotics.ftclib.controller.PIDFController;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.EncoderEx;

import org.firstinspires.ftc.teamcode.subsystems.DriveTrain.DriveTrain;
import org.firstinspires.ftc.teamcode.subsystems.Turret.Turret;

public class ManualTurretController extends CommandBase {

    private final GamepadEx m_toolOp;
    private final Turret m_turret;
    private PIDController pid;
    private double _setPoint;

    public ManualTurretController(Turret turret, GamepadEx toolOp) {
        pid = new PIDController(new double[]{1 ,0 ,0});
        m_turret = turret;
        m_toolOp = toolOp;
        _setPoint = 0.5;

        addRequirements(turret);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        m_turret.setSpeed(pid.calculate(m_turret.getCurrentTicks(), _setPoint));
    }
    public void setSetPoint(double setPoint) {
        _setPoint = setPoint;
    }
}
