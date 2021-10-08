import java.util.*;

class A{

private String method1(){
		
		String str="Hello";
		return str;
		//System.out.println(str);
	}


}


public class AccessModQues1_7{
	public static void main(String args[]) throws Exception
	{
		A fn=new A();
		//fn.method1();
		System.out.println(fn.method1());
	}
}
