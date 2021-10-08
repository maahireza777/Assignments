interface printable1{  
void print1();  
} 

interface printable2{  
void print2();  
}
 
class InterQuesn4 implements printable1, printable2{  
public void print1(){System.out.println("Hello");}  
public void print2(){System.out.println("Maahi");}  

  
public static void main(String args[]){  
InterQuesn4 obj = new InterQuesn4();  
obj.print1();
obj.print2(); 
 }  
}  