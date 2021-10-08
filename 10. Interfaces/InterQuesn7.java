interface printable1{  
void print();  
}

interface printable2 implements printable1{  
void print();
}
  
class InterQuesn7 implements printable2{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
InterQuesn7 obj = new InterQuesn7();
obj.print();  
 }  
}  