interface printable1{  
void print();  
}

interface printable2{  
void print();  
}
  
class InterQuesn5 implements printable1, printable2{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
InterQuesn5 obj = new InterQuesn5();
obj.print();  
 }  
}  