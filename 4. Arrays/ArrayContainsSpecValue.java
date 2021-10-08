
import java.util.*;
public class ArrayContainsSpecValue{


	public static String specValue(int arr[], int t)
	{

		// if array is Null
		if (arr == null) {
			return "Null";
		}

		
		int len = arr.length;
		int i = 0;

		while (i < len) {
		if (arr[i] == t) {
			return "Contains";
			}
		
		else if (arr[i] == t){i = i + 1;}	
		
		else{i = i + 1;}

		}
		return "Do not Contain";
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

		System.out.println( specValue(my_array, 7));

	}
}
