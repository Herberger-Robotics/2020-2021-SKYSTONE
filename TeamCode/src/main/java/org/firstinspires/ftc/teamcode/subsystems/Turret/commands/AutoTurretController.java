package org.firstinspires.ftc.teamcode.subsystems.Turret.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.DriveTrain.DriveTrain;
import org.firstinspires.ftc.teamcode.subsystems.Turret.Turret;

public class AutoTurretController extends CommandBase {

    private final GamepadEx m_toolOp;
    private final Turret m_turret;

    public AutoTurretController(Turret turret, GamepadEx toolOp) {
        m_turret = turret;
        m_toolOp = toolOp;

        addRequirements(turret);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {


    }

}
