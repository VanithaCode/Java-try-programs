package tryprograms;

public class swaptwonumbers {
	public void withthirdveriable()
	{
		int first =10,second =20,third;
		System.out.println("Swaping With Third Veriable");
		System.out.println("Befor Swaping  first is :"+first+" Second is "+second);
		third =first;
		first=second;
		second=third;
		System.out.println("After Swaping first is :"+first+" Second is "+second);
	}
	public void withoutthirdveriable()
	{
		int first =10,second =20;
		System.out.println("Swaping Without Third Veriable using + and - ");
		
		System.out.println("Befor Swaping  first is :"+first+" Second is "+second);
		first=first+second;
		second =first-second;
		first= first-second;
		System.out.println("After Swaping first is :"+first+" Second is "+second);
	}

	public static void main(String[] args) {
		swaptwonumbers s1= new swaptwonumbers();
		s1.withoutthirdveriable();
		s1.withthirdveriable();

	}

}
