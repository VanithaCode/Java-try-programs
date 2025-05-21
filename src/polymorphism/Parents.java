package polymorphism;

public class Parents {
	static int si=10;
	private void getproperties ()
	{
		System.out.println("You can take my house");
	}
	void marriage ()
	{
		getproperties();
		System.out.println("Calling private method in side default method ");
		System.out.println("Marry my sister daughter ");
	}
	void cook()
	{
		System.out.println("Inside parent  Cook method");
	}
	static void land()
	{
		System.out.println("inside static method");
	}

}
