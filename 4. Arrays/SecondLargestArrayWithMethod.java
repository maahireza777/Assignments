import java.util.*;

class Fun1{

void method1(){

		ArrayList<Integer>
			list = new ArrayList<Integer>();

		list.add(5);
		list.add(69);
		list.add(672);
		list.add(52);
		list.add(7);

		// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list);
		int size=list.size()-1;


		System.out.println("size " + size); 
		System.out.println("After Sorting: "+ list); 
		System.out.println(list.get(size-1)); 

	}


}


public class SecondLargestArrayWithMethod{
	public static void main(String args[])
	{
		Fun1 fn=new Fun1();
		fn.method1();
		
	}
}
