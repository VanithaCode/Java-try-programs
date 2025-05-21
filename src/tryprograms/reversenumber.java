package tryprograms;

public class reversenumber {

	public static void main(String[] args) {
		int givennumber =123;
		int revernumber=0;
		do
		{
		revernumber=revernumber*10;
			revernumber =revernumber+givennumber%10;
			givennumber=givennumber/10;
			System.out.println("Reverse number is "+revernumber);

		}while(givennumber>0);
		System.out.println("Reverse number is "+revernumber);

	}

}
