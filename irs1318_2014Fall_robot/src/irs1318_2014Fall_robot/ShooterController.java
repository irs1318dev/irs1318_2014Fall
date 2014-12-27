package irs1318_2014Fall_robot;

public class ShooterController implements IController
{
    private IJoystickComponent userInterface;
    private ShooterComponent component;

    public ShooterController(IJoystickComponent userInterface, ShooterComponent component)
    {
        this.userInterface = userInterface;
        this.component = component;
    }

    public void run()
    {
        if (this.userInterface.getShooterShoot())
        {
            boolean middle = false;
            boolean innerLeft = false;
            boolean innerRight = false;
            boolean outerLeft = false;
            boolean outerRight = false;

            int shooterMode = this.userInterface.getShooterMode();
            switch (shooterMode)
            {
                case 3:
                    middle = true;
                    outerLeft = true;
                    outerRight = true;
                    break;

                case 4:
                    innerLeft = true;
                    innerRight = true;
                    outerLeft = true;
                    outerRight = true;
                    break;

                case 5:
                    middle = true;
                    innerLeft = true;
                    innerRight = true;
                    outerLeft = true;
                    outerRight = true;
                    break;
            }

            this.component.setShooterSolenoids(middle, innerLeft, innerRight, outerLeft, outerRight);
        }
    }
}
