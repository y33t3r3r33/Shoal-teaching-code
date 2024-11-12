package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp(name = "SimpleMDriveExample", group = "Linear Opmode")
public class SimpleMDriveExample extends OpMode {

    public MotorEx FLMotor;
    public MotorEx FRMotor;
    public MotorEx BLMotor;
    public MotorEx BRMotor;

    public MecanumDrive drive;

    @Override
    public void init() {
        this.FLMotor = new MotorEx(hardwareMap, "FLMotor");
        this.FRMotor = new MotorEx(hardwareMap, "FRMotor");
        this.BLMotor = new MotorEx(hardwareMap, "BLMotor");
        this.BRMotor = new MotorEx(hardwareMap, "BRMotor");

        drive = new MecanumDrive(this.FLMotor, this.FRMotor, this.BLMotor, this.BRMotor);
    }

    @Override
    public void loop() {
        this.drive.driveRobotCentric(
                -gamepad1.left_stick_x * 0.8,
                gamepad1.left_stick_y * 0.8,
                -gamepad1.right_stick_x * 0.8);
    }
}
