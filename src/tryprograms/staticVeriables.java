package tryprograms;

public class staticVeriables {
	
	// static blocks are called before main 
	
	static {
		System.out.println("First static block ");
	}
	static {
		System.out.println("Second ststic block ");
	}
	
	// Example to show Static variables are shared among objects.
	
	static int accbalance=0;
	String name;
	public static void main(String[] args) {
		accbalance =2000;
		// name = " riya";  static variable(accbalance) can be access without object, not normal string 
		
		staticVeriables obj1= new staticVeriables();
		obj1.accbalance=1000;
		obj1.name="martin";
		
		staticVeriables obj2= new staticVeriables();
		obj2.accbalance=2000;
		obj2.name="anjel";
		
		System.out.println("Obj1 name : "+obj1.name);
		System.err.println("obj1 balance  : "+obj1.accbalance);
		
		System.out.println("Obj2 name : "+obj2.name);
		System.err.println("obj2 balance  : "+obj2.accbalance);

	}

}
