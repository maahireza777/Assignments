
import java.util.*;


class CommonElementTwoArray{
	public static void main(String[] args)
	{
ArrayList<String> list=new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Kajal");
        list.add("Salah");

ArrayList<String> list2=new ArrayList<String>();
        list2.add("Punk");
        list2.add("Kajal");
        list2.add("Mo Salah");
        list2.add("Firmino");
        list2.add("Love");
        list2.add("Steven");
        list2.add("Karius");
        list2.add("yo yo");


/*   for (int i = 0; i < list.size(); i++) {
     for (int j = i + 1 ; j <  list2.size(); j++) {
          if (list.get(i).equals(list2.get(j)))
	{
                   System.out.println(list.get(i));
         	 }
	
      }
continue;
 } */


// Find the common elements
        list.retainAll(list2);
  
        // print list
        System.out.println("Common elements: "
                           + list);


}}