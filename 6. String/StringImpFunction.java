public class StringImpFunction{
  
  public static void main(String[] args) {
    String str1 = "Anish fatMA";
    String str2 = "anish fatma";
    String str3 = "anniiishhhh fatMAa";
    String str4 = "anish fatma";
  

//EQUAL IGNORE CASE
    // if we ignore the cases both the strings are equal.
    boolean result1 = str2.equalsIgnoreCase(str1);
    System.out.println("str2 is equal to str1 = " + result1);
  
    // even if ignoring the cases both the strings are not equal.
    boolean result2 = str2.equalsIgnoreCase(str3);
    System.out.println("str2 is equal to str3 = " + result2);

//STARTS WITH

String myStr1 = "Hello";
System.out.println(myStr1.startsWith("Hel"));   // true
System.out.println(myStr1.startsWith("llo"));   // false
System.out.println(myStr1.startsWith("o"));     // false

//ENDS WITH
System.out.println("ends with  "+myStr1.endsWith("llo"));   // true

//COMPARE TO

System.out.println("Anish fatMA and anish fatma is same "+str1.compareTo(str2));
System.out.println("anish fatma and anish fatma is same "+str4.compareTo(str2));


	
  }
}