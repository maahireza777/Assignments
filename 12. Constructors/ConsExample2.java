
class Test{

  int id;  
    String name;  

	//creating a default constructor  
	Test(){System.out.println("Default constructor is created");}  


	//creating a parameterized constructor  
	Test(String n){  
	name = n;  
	}  

	//creating a parameterized constructor  
	Test(int i, String n){  
	id = i;  	
	name = n;  
	}  


    //method to display the values  
    void display2(){System.out.println(name);} 
    void display3(){System.out.println(id+" "+name);}  



}


class ConsExample2{  
    public static void main(String args[]){  
    //creating objects and passing values  
    Test s1 = new Test(); 
    Test s2 = new Test("Maahi"); 
    Test s3 = new Test(222,"Fatima");  
    //calling method to display the values of object
    s2.display2();
    s3.display3();  


   }  
}  