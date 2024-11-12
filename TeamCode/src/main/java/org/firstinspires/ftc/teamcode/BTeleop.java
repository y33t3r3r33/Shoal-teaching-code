package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name = "BoysTeleop")
public class BTeleop extends OpMode {

    public MotorEx left;
    public MotorEx right;

    public CRServo Intake;

    @Override
    public void init() {
    this.right = new MotorEx(hardwareMap, "Right");
    this.left = new MotorEx(hardwareMap, "Left");

    this.Intake = hardwareMap.get(CRServo.class,"Intake");
    }

    @Override
    public void loop() {
    double power1 = gamepad1.left_stick_y;
    double power2 = gamepad1.right_stick_y;

    double ipower = gamepad2.left_trigger;

    left.set(power1);
    right.set(power2);

    Intake.setPower(ipower);
    }
}
