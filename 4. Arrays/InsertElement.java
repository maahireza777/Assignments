import java.util.ArrayList;
 
public class InsertElement {
 
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
         
        names.add("Java");
        names.add("Kotlin");
        names.add("Android");
         
        names.add(2,"Python");


	System.out.println(names);
         
       /* names.forEach(name -> {
            System.out.println(name);
        }); */
	



    }
}