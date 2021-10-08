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
	int size1=list.size()-1;
	
	// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list);
		int size=list.size()-1;

	

		System.out.println("size " + size); 
		System.out.println("After Sorting: "+ list); 
		
		int result=list.get(size1)-list.get(0);
		System.out.println(list.get(size1)+" - "+list.get(0)+" = "+result); 
		
	


	}
}


public class DiffBwLargestSmallestWithMethod{
	public static void main(String args[])
	{
		Fun1 fn=new Fun1();
		fn.method1();
		
	}
}
