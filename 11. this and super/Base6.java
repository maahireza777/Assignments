
//Quesn 6

// Program to illustrate super keyword
// refers super-class instance

class Parent {
	// instance variable
	int a = 10;

	// static variable
	static int b = 20;
}

class Base6 extends Parent {

	int c=7;


	void rr()
	{
		// referring parent class(i.e, class Parent)
		// instance variable(i.e, a)
		System.out.println(this.c);
		System.out.println(super.a);
	}

	public static void main(String[] args)
	{
		// Uncomment this and see here you get
		// Compile Time Error since cannot use 'super'
		// in static context.
		
		new Base6().rr();
	}
}
