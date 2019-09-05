package org.usfirst.frc6991.Crossbotics;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.Encoder;


public class RobotMap{
    // public static DoubleSolenoid climb_Left_Solenoid = new DoubleSolenoid(0, 2, 3);
    // public static DoubleSolenoid climb_Right_Solenoid = new DoubleSolenoid(0, 4, 5);

    public static WPI_VictorSPX left_Front_Mac = new WPI_VictorSPX(2);
    public static WPI_VictorSPX left_Rear_Mac = new WPI_VictorSPX(7);
    public static WPI_VictorSPX right_Front_Mac = new WPI_VictorSPX(8);
    public static WPI_VictorSPX right_Rear_Mac = new WPI_VictorSPX(3);
    public static MecanumDrive mecanums = new MecanumDrive(left_Front_Mac, left_Rear_Mac,
    right_Front_Mac, right_Rear_Mac);

    public MecanumDrive getMecanumDrive(){
        return mecanums;
    }
    public static DoubleSolenoid intake_Plate = new DoubleSolenoid(20,7,0);
    // public static PWMVictorSPX rotate_Left_Motor = new PWMVictorSPX(8);
    // public static PWMVictorSPX rotate_Right_Motor = new PWMVictorSPX(2);
    // public static PWMVictorSPX intake_Left_Motor = new PWMVictorSPX(7);
    // public static PWMVictorSPX intatke_Right_Motor = new PWMVictorSPX(3);

}