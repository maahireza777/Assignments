import java.util.*;

public class ReverseArray{
	public static void main(String args[])
	{

		ArrayList<Integer>
			list = new ArrayList<Integer>();

		list.add(7);
		list.add(102);
		list.add(69);
		list.add(77);
		list.add(1);

		Collections.sort(list,Collections.reverseOrder());

		System.out.println("After Sorting: "+ list);  
		
	}
}
