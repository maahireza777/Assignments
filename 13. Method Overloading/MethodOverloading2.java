public class MethodOverloading2{
	static void display(int iNum)
	{
		System.out.println("iNum : " + iNum);
	}

	static void display(int iNum1, float fNum2)
	{
		System.out.println("iNum1 : " + iNum1);
		System.out.println("fNum2 : " + fNum2);
	}

	public static void main(String[] args)
	{
		display(10);
		display(20,30.0f);
	}

}