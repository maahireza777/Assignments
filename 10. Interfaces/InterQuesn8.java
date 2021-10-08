interface printable{ 
int a=7; 
void print();  
}  
class InterQuesn8 implements printable{  
int a=10;
public void print(){
System.out.println("Hello");}  
  
public static void main(String args[]){  
InterQuesn8 obj = new InterQuesn8();  
obj.print();
      System.out.println("Value of num of the interface "+printable.a);
      System.out.println("Value of num of the class "+obj.a);
 }  
}  