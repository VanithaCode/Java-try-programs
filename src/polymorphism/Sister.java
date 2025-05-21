package polymorphism;

public class Sister extends Parents{
	void cook()
	{
		System.out.println("Inside sister class Cook method ");
	}

	/*
	 * void land() { //we cant override Static method }
	 */
	
	public static void main(String[] args) {
		
		Sister s1= new Sister();
		System.out.println("parent sataic variable is "+si);
		si=20;
		System.out.println("parent sataic variable is overrided  "+si);
		
		s1.marriage();
	}

}
