public class SplitString{
    public static void main(String args[])
    {
        String str = "fatimaaanishmaahi";
        String[] arrOfStr = str.split("a", 0);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }
}