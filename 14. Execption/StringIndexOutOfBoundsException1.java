import java.util.*;


public class StringIndexOutOfBoundsException1
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input text : ");
        try{
            char c = sc.nextLine().charAt(4);
            System.out.println("The character at index 4 is : "+c);
        }catch(Exception e){
            //StringIndexOutOfBoundsException cannot be caught explicitly
            System.out.println("Caught exception : "+e.toString());
        }
    }
}