
import java.util.*;


class RemoveDuplicateArrayElement2{
	public static void main(String[] args)
	{
ArrayList<String> list=new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");

 System.out.println("Before"+ list);

   for (int i = 0; i < list.size(); i++) {
     for (int j = i + 1 ; j <  list.size(); j++) {
          if (list.get(i).equals(list.get(j)))
	{
                  list.remove(i);
         	 }
	
      }
 }

 System.out.println("After"+ list);

}}