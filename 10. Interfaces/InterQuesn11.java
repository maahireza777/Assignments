interface printable{ 
static final int a=7; 
void print();  
}  
class InterQuesn11 implements printable{  
public void print(){
System.out.println("Hello");}  
  
public static void main(String args[]){  
InterQuesn11 obj = new InterQuesn11();  
obj.print();
      System.out.println("Value of num of the interface "+printable.a);
 }  
}  