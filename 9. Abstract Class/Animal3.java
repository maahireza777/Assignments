
//abstract parent class

abstract class Animal3{
   //abstract method
   public abstract void sound();

   public void fun1(){
	System.out.println("This is concrete method");
   }

}

class Animal3{

   public void sound(){
	System.out.println("Woof");
   }


   public static void main(String args[]){
	Animal3 obj = new Animal3();
	obj.fun1();
   }
}