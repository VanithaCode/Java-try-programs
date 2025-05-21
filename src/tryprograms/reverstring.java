package tryprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reverstring {
	
	
	void normalidea()   // cant use .reverse method 
	{
		String reword="delicious";
		int l=reword.length();
		String newword="";
		char a;
		System.out.println("String Length is "+l);
		for(int i =0;i<l;i++)
		{
			a=reword.charAt(i);
			//System.out.println(a);
			newword=a+newword;
			System.out.println(newword);
		}
		System.out.println("String is : "+reword);
		System.out.println("Reverse word id " +newword);
	}
	void stringbufferidea()   // using bufferclass using .reverse method 
	{
		String reword = "important";
		StringBuffer buffer = new StringBuffer();
		buffer.append(reword);
		System.out.println("ReverString  using StringBuffer is :"+buffer.reverse());
		
	}
	void collectionidea()
	{
		String reword= "Collections";
		char[] array = reword.toCharArray();
		List<Character> list= new ArrayList<Character>();
		for (Character character : array) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator<Character> iterator = list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
reverstring r1 = new reverstring();
r1.normalidea();
r1.stringbufferidea();
r1.collectionidea();
		
}
}
