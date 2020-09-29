package org.firstinspires.ftc.teamcode.subsystems.DriveTrain;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveTrain extends SubsystemBase {

    private final MecanumDrive driveTrain;

    public DriveTrain(final HardwareMap hMap, final MecanumDrive mecanumDrive) {

        driveTrain = mecanumDrive;
    }

    public void drive(double strafeSpeed, double forwardSpeed, double rotationSpeed) {

        //drives based off of the robots orientation
        driveTrain.driveRobotCentric(strafeSpeed, forwardSpeed, rotationSpeed);
    }

    public void stop() {
        driveTrain.stop();
    }
}
