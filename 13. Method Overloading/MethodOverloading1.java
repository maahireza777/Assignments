public class MethodOverloading1{
	static void display(int iNum)
	{
		System.out.println("iNum : " + iNum);
	}

	static void display(int iNum1, int iNum2)
	{
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
	}

	public static void main(String[] args)
	{
		display(10);
		display(20,30);
	}

}