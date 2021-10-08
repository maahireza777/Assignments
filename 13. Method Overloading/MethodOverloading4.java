public class MethodOverloading4{
	static void display(int iNum1, int iNum2)
	{
		System.out.println("iNum : " + iNum1);
		System.out.println("iNum : " + iNum2);
	}

	static void display(float fNum1, float fNum2)
	{
		System.out.println("fNum1 : " + fNum1);
		System.out.println("fNum2 : " + fNum2);
	}

	public static void main(String[] args)
	{
		display(10, 20);
		display(20.0f ,30.0f);
	}

}