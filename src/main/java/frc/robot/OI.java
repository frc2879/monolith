
package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new DriveMecanumStick());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new DriveMecanumStick());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new DriveMecanumStick());
	
	private Joystick stick;
	//private JoystickPOVTrigger pov;
	
	public Joystick GetJoystick() {
		//enables the joystick for getting the things
		return stick;
		//gets the joystick things 
	}
	
	public double getStickX() {
		//sets the the x axis dead zone
		double xDed = .05;
		//gets the x axis from the joy stick-a-ma-thingy
		double in = stick.getX();
		//square the inputs for better response
		double x = in*in;
		//actually does the dead zone thing
		if (x <= xDed) {
			x=0;
		}else {
			//when outside deadzone actually do the motor thingy
			x = (x-xDed)/(1-xDed);
		}
		//if the input was negitive amke it negitive again 
		if (in<0) {
			x=-x;
		}
		return x;
	}
	
	//ALL THE SAME AS ABOVE
	public double getStickY() {
		double yDed = .05;
		double in = stick.getY();
		double y = in*in;
		if (y <= yDed) {
			y=0;
		}else {
			y = (y-yDed)/(1-yDed);
		}
		if (in<0) {
			y=-y;
		}
		return y;
	}
	
	public double getStickAngle() {
		double aDed = .05;
		double in = stick.getTwist();
		double a = in*in;
		if (a <= aDed) {
			a=0;
		}else {
			a = (a-aDed)/(1-aDed);
		}
		if (in<0) {
			a=-a;
		}
		return a;
	}
	//END SAME AS ABOVE
	
	public OI() {
		stick = new Joystick(PortLib.js);
		/*pov = new JoystickPOVTrigger(stick);
		//sets the commands for the buttons 
		new JoystickButton(stick, 6).whileHeld(new ConstantIntake(.5,false));
		new JoystickButton(stick, 5).whileHeld(new ConstantIntake(.5,true));
		new JoystickButton(stick, 4).whileHeld(new ConstantIntake(-.5,false));
		new JoystickButton(stick, 3).whileHeld(new ConstantIntake(-.5,true));
		new JoystickButton(stick, 1).whileHeld(new StickDriveWithPID());
		
		// this is the speed of the lift. negative retracts, positive extends.
		new JoystickButton(stick, 11).whileHeld(new lift(0.20));
		new JoystickButton(stick, 12).whileHeld(new lift(-0.20));
		
		// the arguments are the speed in the different directions. (sidways speed, forward speed, diagonal speed)
        pov.whileActive(new Strafe(.75,.25,.5));
        */
		
	}
		
}