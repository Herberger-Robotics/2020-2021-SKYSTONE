package org.firstinspires.ftc.teamcode.subsystems.driveTrain.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.driveTrain.DriveTrain;

public class BasicDrive extends CommandBase {

    private final DriveTrain m_driveTrain;
    private final GamepadEx m_driverOp;

    public BasicDrive(DriveTrain driveTrain, GamepadEx driverOp) {
        m_driveTrain = driveTrain;
        m_driverOp = driverOp;

        addRequirements(driveTrain);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double rotation = m_driverOp.getLeftX();
        double forward = m_driverOp.getLeftY();
        double strafe = 0;

        boolean leftBumperState = m_driverOp.getButton(GamepadKeys.Button.LEFT_BUMPER);
        boolean rightBumperState = m_driverOp.getButton(GamepadKeys.Button.RIGHT_BUMPER);

        if(!leftBumperState && !rightBumperState) {
            if(leftBumperState) {
                strafe = 0.25;
            } else if(rightBumperState) {
                strafe = -0.25;
            }
        }

        m_driveTrain.drive(strafe, forward, rotation);
    }

}
