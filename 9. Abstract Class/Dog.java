
//abstract parent class

abstract class Animal{
   //abstract method
   public abstract void sound();

   public void fun1(){
	System.out.println("This is concrete method");
   }

}


//Dog class extends Animal class
public class Dog extends Animal{

   public void sound(){
	System.out.println("Woof");
   }


   public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
	obj.fun1();
   }
}