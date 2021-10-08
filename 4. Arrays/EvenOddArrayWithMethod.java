import java.util.*;

class Fun1{

void method1(){

		ArrayList<Integer>
			list = new ArrayList<Integer>();

		list.add(5);
		list.add(69);
		list.add(672);
		list.add(52);
		list.add(7);
	int size1=list.size()-1;
	

	while(size1>0){

		//System.out.println("index"+size1); 
		if(list.get(size1)%2==0){
		System.out.println(list.get(size1) + " Even"); }
		else{
		System.out.println(list.get(size1) + " Odd"); }
	
	size1--;
	}

	}


}


public class EvenOddArrayWithMethod{
	public static void main(String args[])
	{
		Fun1 fn=new Fun1();
		fn.method1();
		
	}
}
