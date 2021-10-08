import java.util.*;

// Class A
protected class A {
    void display()
    {
        System.out.println("Yo");
    }
}


public class AccessModQues3_1 extends A{
	public static void main(String args[])
	{
		Fun1 fn=new Fun1();
		fn.method1();
		//System.out.println(fn.method1());
	}
}
