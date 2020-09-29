package org.firstinspires.ftc.teamcode.hardwaremaps;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.arcrobotics.ftclib.hardware.motors.SimpleMotor;
import com.arcrobotics.ftclib.hardware.motors.SimpleMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardwaremaps.motors.HowlersMotor;
import org.firstinspires.ftc.teamcode.subsystems.DriveTrain.DriveTrain;
import org.firstinspires.ftc.teamcode.subsystems.Turret.Turret;

public class HowlersHardware {

    public HowlersMotor rightFront = null;
    public HowlersMotor rightBack = null;
    public HowlersMotor leftFront = null;
    public HowlersMotor leftBack = null;
    public DriveTrain driveTrain = null;



    public HowlersMotor flywheel = null;

    public Turret turret = null;


    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    public HowlersHardware(){

    }

    public void init(HardwareMap ahwMap){
        hwMap = ahwMap;
        //rightFront = new HowlersMotor(hwMap, "rightFront", 145.6);
        //rightBack = new HowlersMotor(hwMap, "rightBack", 145.6);
        //leftBack = new HowlersMotor(hwMap, "leftBack", 145.6);
        //leftFront = new HowlersMotor(hwMap, "leftFront", 145.6);


        flywheel = new HowlersMotor(hwMap, "flywheel", 145.6);

        //drive train
        //MecanumDrive mecanumDrive = new MecanumDrive(leftFront, rightFront, leftBack, rightBack);
        //driveTrain = new DriveTrain(hwMap, mecanumDrive);

        //turret
        turret = new Turret(hwMap, flywheel);



    }

}