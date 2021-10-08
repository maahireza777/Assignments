import java.util.*;

class Demo{
String globalFun(){
String s="Global";
return s;}
}

class LocalGlobalVariable{
	public static void main(String arg[]){
		String s="Local";
		System.out.print(s);
	Demo d=new Demo();
	String s1=d.globalFun();
	System.out.print(s1);	
		
		

	}


}