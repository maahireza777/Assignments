import java.util.*;

public class MaxMinArray{
	public static void main(String args[])
	{

		ArrayList<String>
			list = new ArrayList<String>();

		list.add("Maahi");
		list.add("Fatima");
		list.add("Ankit");
		list.add("Punkiis);
		list.add("A computer portal");

		// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list);
		int size=list.size()-1;


		System.out.println("size " + size); 
		System.out.println("After Sorting: "+ list); 
		System.out.println(list.get(0)+" "+list.get(size)); 
		
	}
}
