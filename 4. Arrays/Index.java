
import java.util.*;
public class Index{


	public static int findIndex(int arr[], int t)
	{

		// if array is Null
		if (arr == null) {
			return -1;
		}

		
		int len = arr.length;
		int i = 0;

		while (i < len) {

			// if the i-th element is t
			// then return the index
			if (arr[i] == t) {
				return i;
			}
			else {
				i = i + 1;
			}
		}
		return -1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

		// find the index of 5
		System.out.println("Index position of 5 is: "
						+ findIndex(my_array, 14));

		// find the index of 7
		System.out.println("Index position of 7 is: "
						+ findIndex(my_array, 7));
	}
}