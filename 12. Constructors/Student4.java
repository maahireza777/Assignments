class Student4{  
    int id;  
    String name;  

	//creating a default constructor  
	Student4(){System.out.println("Default constructor is created");}  


	//creating a parameterized constructor  
	Student4(String n){  
	name = n;  
	}  

	//creating a parameterized constructor  
	Student4(int i, String n){  
	id = i;  	
	name = n;  
	}  


    //method to display the values  
    void display2(){System.out.println(name);} 
    void display3(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4(); 
    Student4 s2 = new Student4("Maahi"); 
    Student4 s3 = new Student4(222,"Fatima");  
    //calling method to display the values of object
    s2.display2();
    s3.display3();  


   }  
}  