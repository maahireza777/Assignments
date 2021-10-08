interface printable{  
void print();  
}  
class InterQuesn3 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
printable obj = new printable();  
obj.print();  
 }  
}  