protected interface printable{ 
int a=7; 
void print();  
}  
class InterQuesn9 implements printable{  
int a=10;
public void print(){
System.out.println("Hello");}  
  
public static void main(String args[]){  
InterQuesn9 obj = new InterQuesn9();  
obj.print();
      System.out.println("Value of num of the interface "+printable.a);
      System.out.println("Value of num of the class "+obj.a);
 }  
}  