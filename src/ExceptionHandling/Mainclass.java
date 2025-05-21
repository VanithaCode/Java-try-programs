package ExceptionHandling;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter intput");
		int a=sc.nextInt();
		int c=50/a;
// changes made after commit 
		System.out.println("divi is "+c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("inside Arithmetic Exception ");
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Program ended with "+e);
	}
	finally 
	{
		System.out.println("Inside finally block ");
		sc.close();
	}
	}

}
