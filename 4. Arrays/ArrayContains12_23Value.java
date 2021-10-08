
import java.util.*;
public class ArrayContains12_23Value{


	public static String specValue(int arr[])
	{

		// if array is Null
		if (arr == null) {
			return "Null";
		}

		
		int len = arr.length;
		int i = 0;

		while (i < len) {
		if (arr[i] == 12 || arr[i] == 23) {
			return "Contains";
			}

		else {i = i + 1;}

		}
		return "Do not Contain";
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 12 };

		System.out.println( specValue(my_array));

	}
}
