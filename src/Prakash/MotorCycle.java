package Prakash;

public class MotorCycle implements Vehicle {

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		System.out.println(" MotorCycle is started ");
		return true;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		System.out.println(" MotorCycle is stopped ");
		return true;
	}

	@Override
	public boolean drive() {
		// TODO Auto-generated method stub
		MotorCylcleDriver mcd = new MotorCylcleDriver();
		return mcd.driveVehicle();
	}

}
