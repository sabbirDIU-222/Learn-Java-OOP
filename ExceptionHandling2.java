
package problem.solving;


public class ExceptionHandling2 {
    
    public static void main(String[] args) {
        
        
           // same cose as ExceptionHandling
        System.out.println("before excception");
        int a=12,b=0, result;
        int arr[] = new int[5];
        
        // null pointer exception 
        // here we take a string 
        // s is null
        // so we can not find the length of it
        
        String s = null;
        
        
         
        
        try{
            System.out.println(s.length());
             arr[10]=10;
        }
        // i can use multiple catch block for try block
        // if first catch can not canth the exception 
        catch(ArithmeticException e)
        {
            System.out.println("this is not arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        { 
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("the Exception class can catch");
            System.out.println(e);
            
        }
        
        
        
        System.out.println("");
       try{
            result=a/b;// it throw an exception
            
            // we can use nested try block
           try{
               
           }
           catch(Exception e)
           {
               
           }
            
        }
        
        // we can use mulitiple atch block here 
        // if we don't know what kind of exception it is 
        // then we can call Exception class 
        // BUT REMEMBER THE EXCEPTION CLASS WILL BE IN THE LAST
        
        
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception ex){ // the thrwoable exception catch here
            
            System.out.println(ex);// and sent any message
            
        }
       
       
       finally{
           // in this block we final what our rest of program exicuted 
           System.out.println("rest of program that must be print if catch can not catch any exception");
       }
        System.out.println("after Exception");// and also run this last lline also
        
        
        
        
      
    
    }
     

    
}
