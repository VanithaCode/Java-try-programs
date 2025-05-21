package Prakash;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		
		boolean isCarStarted = c.start();
		
		if (isCarStarted) {
			c.drive();
			c.stop();
		}

	}

}
