package org.firstinspires.ftc.teamcode.hardwaremaps;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.SimpleMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.internal.opengl.shaders.SimpleColorProgram;
import org.firstinspires.ftc.teamcode.subsystems.driveTrain.DriveTrain;

public class HowlersHardware {
    public SimpleMotor rightFront = null;
    public SimpleMotor rightBack = null;
    public SimpleMotor leftFront = null;
    public SimpleMotor leftBack = null;

    public DriveTrain driveTrain = null;


    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    public HowlersHardware(){

    }

    public void init(HardwareMap ahwMap){
        hwMap = ahwMap;
        rightFront = new SimpleMotor("rightFront", hwMap);
        rightBack = new SimpleMotor("rightBack", hwMap);
        leftBack = new SimpleMotor("leftBack", hwMap);
        leftFront = new SimpleMotor("leftFront", hwMap);

        //drive train
        MecanumDrive mecanumDrive = new MecanumDrive(leftFront, rightFront, leftBack, rightBack);
        driveTrain = new DriveTrain(hwMap, mecanumDrive);


    }

}