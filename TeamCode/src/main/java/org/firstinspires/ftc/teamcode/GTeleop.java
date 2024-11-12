package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "GirlsTeleop")
public class GTeleop extends OpMode {

    public MotorEx FLMotor;
    public MotorEx FRMotor;
    public MotorEx BLMotor;
    public MotorEx BRMotor;

    @Override
    public void init() {
    this.FLMotor = new MotorEx(hardwareMap, "FLMotor");
    this.FRMotor = new MotorEx(hardwareMap, "FRMotor");
    this.BLMotor = new MotorEx(hardwareMap, "BLMotor");
    this.BRMotor = new MotorEx(hardwareMap, "BRMotor");
    }

    @Override
    public void loop() {
        double axial   =  (gamepad1.left_stick_y); // forward and backward
        double lateral =  (gamepad1.left_stick_x); // turning left and right
        double yaw     =  (gamepad1.right_stick_x); // strafing

        double FRPower = axial + lateral + yaw;
        double FLPower = axial - lateral - yaw;
        double BRPower = axial - lateral + yaw;
        double BLPower = axial + lateral - yaw;

        FLMotor.set(FLPower);
        FRMotor.set(FRPower);
        BLMotor.set(BLPower);
        BRMotor.set(BRPower);

    }
}
