package ExceptionHandling;

import java.util.Scanner;
class NotValidException extends Exception
{
	
}

public class throwException {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Enter your age : ");
			int a=sc.nextInt();

			if(a==0)
				throw new NotValidException(); // user defined exception 
			else if(a<18)
				throw new Exception ("BelowAgeLimit");
			else
				System.out.println("Vote ID will be sent");
		}
		catch(NotValidException e )
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
	}
}
