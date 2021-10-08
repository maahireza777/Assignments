import java.util.*;

class MaleFemaleSwitch{
	public static void main(String arg[]){
	System.out.print("Enter M or F ");
	Scanner sc=new Scanner(System.in);
	String a=sc.next();

	switch(a)
	{
	case "M":
	{System.out.print("Male");
	break;}

	case "F" :
	{System.out.print("Female");
	break;}


	default:
	System.out.print("Invalid input");


	}
	}


}