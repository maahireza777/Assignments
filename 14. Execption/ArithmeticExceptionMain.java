class Fun1{
	void method1(){
	
			try{
         				int num1=30, num2=0;
       				int output=num1/num2;
         				System.out.println ("Result: "+output);
    			  }
      			catch(ArithmeticException e){
       				System.out.println ("You Shouldn't divide a number by zero");
     			 }

	}

}




class  ArithmeticExceptionMain{

   public static void main(String args[])
   { 
	Fun1 fn=new Fun1();
	fn.method1();
   }
}