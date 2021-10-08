//Quesn 4

// Java code for using this() to
// invoke current class constructor
class Test4
{
	int a;
	int b;

	//Default constructor
	Test4()
	{
		this(10, 20);
		System.out.println("Inside default constructor \n");
	}
	
	//Parameterized constructor
	Test4(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args)
	{
		Test4 object = new Test4();
	}
}
