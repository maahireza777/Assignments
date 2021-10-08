// Java Program for copying one ArrayList to another

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

class ArrayCopy{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr1= new ArrayList<>();

		// adding elements to first ArrayList
		arr1.add(10);
		arr1.add(21);
		arr1.add(22);
		arr1.add(35);

		// Assigning the first reference to second
		ArrayList<Integer> arr2 = arr1;

		// Iterating over second ArrayList
		System.out.println("-----Iterating over the second ArrayList----");
		for (Integer value : arr2) {
			System.out.println(value);
		}

		for (int i=0; i<arr1.size(); i++) {
  		// Assuming arr is an ArrayList object
  			System.out.println(arr1.get(i));

		}

	//second method
	System.out.println(arr2);

ArrayList< Integer > masterColors = ArrayList.copyOf( arr1 ) ; 
System.out.println(masterColors);


/*ArrayList< String > colors = new ArrayList<>( 4 ) ;          // Creates a modifiable `List`. 
colors.add ( "AliceBlue" ) ;
colors.add ( "PapayaWhip" ) ;
colors.add ( "Chartreuse" ) ;
colors.add ( "DarkSlateGray" ) ;
ArrayList< String > masterColors = ArrayList.copyOf( colors ) ; 
System.out.println(masterColors);*/


	}
}
