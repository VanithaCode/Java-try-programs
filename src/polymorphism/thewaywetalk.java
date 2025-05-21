package polymorphism;

public class thewaywetalk {
	
public void talk(Boss talking)
{
	System.out.println(" only bussiness ");
}
public void talk(Parents talking )
{
	System.out.println("With love");
}
public void talk(Sister talking)
{
	System.out.println("With care");
}



	public static void main(String[] args) {
		
Parents parent = new Parents();
Sister sister = new Sister();
Boss boss = new Boss();
thewaywetalk way = new thewaywetalk();

way .talk(parent); // overloading class object 
way.talk(boss);
way.talk(sister);

	}
	
	// all the class are public inside the package . using parameters as a class object  
	// because it is inherited 
	// Overloading done is the same class 
}
