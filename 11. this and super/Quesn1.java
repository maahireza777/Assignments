import java.util.*;

class A{
public int a=7;
}


public class Quesn1 extends A {

int a=100;

	public static void main(String args[]) throws Exception
	{	int var=super.a;
		System.out.println(var);
	}
}
