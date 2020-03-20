
package problem.solving;


public class ExceptionaHandling {
    
    /*  
   
    the first think is 
    what is EXCEPTION is
    
    exception is spmething like that 
    sometimes we did fault in our program 
    
    and those fault are accured in runtime and it's called runtimeException 
    
    AND WE MUST FIED THE RUNTIME EXCEPTION
    
    IF WE DON'T FIX THE RUNTIME EXCEPTION OUR NEXT LINE OF PROGRAM OR REST OF PROGRAM 
    WILL NOT EXICUITED 
    
    
    *** we know or don't know that our super most class name is 
    ***********OBJECT********
    Throwable class extends objects class and Exception class extends throwable
    so *** EXCEPTION ***is a class
    
    
    Exception are two type 
    *************** Checked 
    *************** Unchecked
    
    1) Checked Exception
    The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g
    IOException, SQLException etc. Checked exceptions are checked at *compile-time.*
    
    
    2) Unchecked Exception
    
    The classes which inherit RuntimeException are known as unchecked exceptions
    ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.
    Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
    
    
    ********************** we need to fix runtime eception******************
    

    
    */
    
    
    // take care about a method 
    
    public static void main(String[] args) {
        
        
        
        /*
        System.out.println("before excception");
        int a=12,b=0, result;
        result=a/b;
        
        System.out.println(result);
       
        System.out.println("after Exception");
        
        
        
        ************OUTPUT**************
        before excception
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at problem.solving.ExceptionaHandling.main(ExceptionaHandling.java:58)
       C:\Users\User\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)

        
        */
        
        
        
        // so we have an ArithmaticException
        
        // so the last line after Exception does not print
        
        
        // Now the main point ........... try {}catch{}
        
        
         System.out.println("before excception");
        int a=12,b=0, result;
       
        try{
            result=a/b;// it throw an exception
            
        }
        catch(Exception ex){ // the thrwoable exception catch here
            
            System.out.println("sorry we got an error");// and sent any message
            
        }
        System.out.println("after Exception");// and also run this last lline also
        
        
        
    }
    
    /*
    
    
    
    ******************* output *****************
    before excception
   sorry we got an error
   after Exception
BUILD SUCCESSFUL (total time: 0 seconds)

    
    
    
    
    
    */
    
    
    
    
    
    
    
    

}
