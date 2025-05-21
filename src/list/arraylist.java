package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arraylist {
	public void ArrayList()
	{
		List<String> arraylistone = new ArrayList<String>();
		arraylistone.add("Apple");
		arraylistone.add("Orange");
		arraylistone.add("Banana");
		arraylistone.add("Kiwi");
		arraylistone.add("Banana"); // allow duplicate 
		
		System.out.println(arraylistone); // maintain insertion   order 
		System.out.println(arraylistone.get(2));
		System.out.println("First Element is "+ arraylistone.getFirst());
		System.out.println("Last Elementt is "+arraylistone.getLast());
		System.out.println(arraylistone.indexOf("Orange"));
		System.out.println(arraylistone.lastIndexOf("Banana"));
		System.out.println(arraylistone.lastIndexOf("banana")); // no item in the list 
		List <String> arraylistsecond = new ArrayList<String> ();
		arraylistsecond.addAll(arraylistone);
		System.out.println(arraylistsecond);
		arraylistone.remove(0);
		System.out.println(arraylistone);
		arraylistone.remove("Kiwi");
		System.out.println(arraylistone);
		arraylistone.add(null);  // we can add null value 
		System.out.println(arraylistone);
		
		arraylistone.set(0, "Apple");  // adding element in specfic location 
		System.out.println(arraylistone);
		
		
		
		// iterate  using list iterator 
		
		for(String string :arraylistone )
		{
			System.out.println("ForEach "+string);
		}
		
		for (int i =0;i<arraylistone.size();i++)
		{
			System.out.println("For loop  " +arraylistone.get(i));
		}
		ListIterator <String> listiterator = arraylistone.listIterator();
		
		System.out.println("Using Iteration ");
		while(listiterator.hasNext())
		{
			System.out.println(listiterator.next());
		}
		System.out.println("Reverse Itration is possible in listiteration  ");
		while (listiterator.hasPrevious())
		{
			System.out.println("iterator using previous  "+ listiterator.previous());
		}
		// iterate using iterator 
		Iterator<String> iterator = arraylistsecond.iterator();
		
		System.out.println("Using iterator : ");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("Iterator only print forward not backward (Reverse Print not possible in iteration) ");
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arraylist obj = new arraylist();
obj.ArrayList();

	}

}
