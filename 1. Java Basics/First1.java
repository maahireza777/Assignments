import java.util.*;

class Demo{
void globalFun(){
System.out.print("This is function");
}
}

class First1{
	public static void main(String arg[]){
	Demo d=new Demo();
	d.globalFun();
	}


}