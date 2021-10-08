
//abstract parent class

abstract class Animal{
   //abstract method
   public abstract void sound();

   public void fun1(){
	System.out.println("This is concrete method");
   }

}


//ChildClass1 class extends Animal class
public class ChildClass1 extends Animal{

   public void sound(){
	System.out.println("Woof");
   }


   public static void main(String args[]){
	Animal obj = new ChildClass1();
	obj.fun1();
   }
}