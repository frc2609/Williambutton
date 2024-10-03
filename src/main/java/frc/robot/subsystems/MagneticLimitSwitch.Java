import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

DigitalInput toplimitSwitch = new DigitalInput(0);

public class MagneticLimisSwitch extends SubsystemBase {

    public MagneticLimisSwitch(){

    }

    @Override
    public void periodic(){
        checkLimitSwitch();
    }



    public void checkLimitSwitch(){

        if (toplimitSwitch.get()) {
            // We are going up and top limit is tripped so stop
            SmartDashboard.putData("magnetic", "top");

        }else{
            SmartDashboard.putData("magnetic", "No");
        }
    }

}