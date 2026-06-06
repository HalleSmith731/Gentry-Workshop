package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.gentrifiedApps.gentrifiedAppsUtil.classes.drive.DrivePowerCoefficients;
import org.gentrifiedApps.gentrifiedAppsUtil.controllers.initMovement.InitMovementController;
import org.gentrifiedApps.gentrifiedAppsUtil.drive.MecanumDriver;
import org.gentrifiedApps.gentrifiedAppsUtil.looptime.LoopTimeController;

@TeleOp(name = "Gentrified")
public class Gentrify extends LinearOpMode {
    LoopTimeController loopTimeController = new LoopTimeController();

    @Override
    public void runOpMode() {

        // LooptimeController
        InitMovementController driveTrain = new InitMovementController(gamepad1, gamepad2);

        waitForStart();
        while (opModeIsActive()) {
            driveTrain.checkHasMovedOnInit();
            if(driveTrain.hasMovedOnInit()){

            }

            // LoopTimeController
            loopTimeController.update();
            loopTimeController.telemetry(telemetry);
            telemetry.update();

        }
    }
}