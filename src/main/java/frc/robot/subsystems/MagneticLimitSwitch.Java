package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class MagneticLimitSwitch extends SubsystemBase {
    private final DigitalInput toplimitSwitch ;

    public MagneticLimitSwitch(){
        toplimitSwitch = new DigitalInput(0);
    }

    @Override
    public void periodic(){
        checkLimitSwitch();
    }



    public void checkLimitSwitch(){

        if (toplimitSwitch.get()) {
            // We are going up and top limit is tripped so stop
            SmartDashboard.putString("magnetic", "top");

        }else{
            SmartDashboard.putString("magnetic", "No");
        }
    }

}