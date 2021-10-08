import java.util.*;

class EvenOddSwitch{
	public static void main(String arg[]){
	System.out.print("Enter a number ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();

	switch(a%2)
	{
	case 0:
	{System.out.print("even");
	break;}

	default:
	System.out.print("Odd");


	}
	}


}