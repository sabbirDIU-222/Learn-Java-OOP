
package advancejava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestThrow {
    
    
    void checkAge(int a) 
    {
        if(a<20)
        {
            //Throw keyword is used in the method body to throw an exception
            throw new ArithmeticException("you must be in age 18");// i declare any type of exception
        }
        else
        {
            System.out.println("welcome");
        }
    }
     
    void m1() throws IOException
    {
        throw new IOException("total exception");
    }
    
  /*   void m2()
    {
        throw new ArrayIndexOutOfBoundsException("holo");
    }
     
     it is unchecked exception
    it have no need to Throws keyword
    
    */
    
    
    public static void main(String[] args) throws IOException {
        
        TestThrow obj =  new TestThrow();
        
        obj.checkAge(10);
        System.out.println("rest of the code");
        
       obj.m1(); 

    }
}
/*
The main difference between throw and throws is like "One declares it and the other one actually does it.
" throw keyword is used to throw exception explicitly from any method or static block while 
throws keyword is used in method declaration, 
denoted which exception can possible be thrown by this method

*/



/*

      OutPut

Exception in thread "main" java.lang.ArithmeticException: you must be in age 18


	at advancejava.TestThrow.checkAge(TestThrow.java:12)
	at advancejava.TestThrow.main(TestThrow.java:29)
C:\Users\User\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)


*/








