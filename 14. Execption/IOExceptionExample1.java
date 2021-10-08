
import java.io.IOException;


public class IOExceptionExample1{
        public static void main(String[] args) throws IOException {
        
        boolean malfunction = false;
        
        System.out.println("Running ....");
        
        /*
         * code that determines the machine
         * is malfunctioning.
         */
        malfunction = true;
        
        if(malfunction) {
            throw new IOException();
        }
        
        System.out.println("Everything OK");
    }
}