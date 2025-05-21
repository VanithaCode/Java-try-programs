package polymorphism;

public class dynamicoverriding extends Parents{

	//@overloading
	void marriage()
	{
		System.out.println("My life my rules ");
		
	}
 void getproperties ()
	{
		System.out.println(" child is overriding parent class private method ");
	} 
	public static void main(String[] args) {
		//Parents obj = new dynamicoverriding ();
		dynamicoverriding obj = new dynamicoverriding ();
		obj.getproperties();
		obj.marriage();
		
	}

}
