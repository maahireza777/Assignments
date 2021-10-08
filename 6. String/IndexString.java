import java.lang.*;

class IndexString{
	public static void main(String arg[]){
		
// Declare String without using new operator
        String value= "Fatima";
 	int ind=value.indexOf("F");
	System.out.println(ind);

	String myStr1 = "Hello planet earth, you are a great planet.";
	System.out.println(myStr1.indexOf("planet"));
	
	//indexOf(String str, int fromIndex_index position to start the search from)
	String myStr2 = "Hello planet earth, you are a great planet.";
    	System.out.println(myStr2.indexOf("e", 5));

	}


}