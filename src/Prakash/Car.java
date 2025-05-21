package Prakash;

public class Car implements Vehicle {

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		System.out.println(" The Car is Started..");
		return true;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		System.out.println(" The Car is Stopped..");
		return false;
	}

	@Override
	public boolean drive() {
		// TODO Auto-generated method stub
		CarDriver cd = new CarDriver();
		return cd.driveVehicle();
	}

}
