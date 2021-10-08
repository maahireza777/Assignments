class Quesn3{  
    int id;  
    String name;  

	//creating a default constructor  
	public Quesn3(){System.out.println("Default constructor is created");}  


	//creating a parameterized constructor  
	protected Quesn3(String n){  
	name = n;  
	}  

	//creating a parameterized constructor  
	private Quesn3(int i, String n){  
	id = i;  	
	name = n;  
	}  


    //method to display the values  
    void display2(){System.out.println(name);} 
    void display3(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Quesn3 s1 = new Quesn3(); 
    Quesn3 s2 = new Quesn3("Maahi"); 
    Quesn3 s3 = new Quesn3(222,"Fatima");  
    //calling method to display the values of object
    s2.display2();
    s3.display3();  


   }  
}  