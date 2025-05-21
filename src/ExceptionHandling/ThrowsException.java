package ExceptionHandling;

class BelowException extends Exception
{
	public  BelowException(String s)
	{
		super(s);
	}
}
class calculate
{
	int  add (int a, int b)
	{
		return a+b;
	}
	int div (int a,int b) throws BelowException
	{
		if (a<5)
			throw new BelowException("Below");
		return(a/b);
	}
}

public class ThrowsException {
	public static void main(String[] args) {
		
		calculate c1= new calculate();
		try
		{
			System.out.println("addition is "+ c1.add(5, 30));
			int d=c1.div(7,0);
			
		}
		catch(BelowException e)
		{
			System.out.println("Below Exception ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
