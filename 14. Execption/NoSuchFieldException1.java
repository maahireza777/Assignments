import java.io.*;
class NoSuchFieldException1{  
   public static void main(String args[]) 
   {
    FileInputStream fis = null;
    //Open a file 
         fis = new FileInputStream("C:/myfile.txt"); 
    int k; 
 
    //read contents of the file
        while(( k = fis.read() ) != -1) 
    { 
        System.out.print((char)k); 
    } 
 
    //close the file
    fis.close();    
   }
}