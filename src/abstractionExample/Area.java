package abstractionExample;

public class Area {

	public static void main(String[] args) {
		Square o1= new Square();
	
		Triangel o2 = new Triangel();
		o1.display();
		System.out.println("Area of Square is " +o1.area());
		System.out.println("Area of Triangle is " +o2.area());
	}

}
