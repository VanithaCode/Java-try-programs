package ExceptionHandling;

import java.util.Scanner;
class NotValidException1 extends Exception
{
	//private static final long serialVersionUID = 1L;

	public NotValidException1(String s)
	{
		super(s);
	}
}
public class UserDefindException {

	
		public static void main(String[] args)  {
			Scanner sc =new Scanner(System.in);
			try
			{
				System.out.println("Enter your age : ");
				int a=sc.nextInt();

				if(a==0)
					throw new NotValidException1("Age will not be zero "); // user defined exception 
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
