
package problem.solving;

import java.util.Scanner;


public class ExceptionHandling3 {

    public static void main(String[] args) {
        
        
           
    Scanner input = new Scanner(System.in);
    
    int num1,num2,result,count=0;
       
       
        // taking two number
        
          do  {
            
        
        try{
            
            
            
         System.out.print("enter num1: "); 
         num1=input.nextInt();
        
        System.out.print("enter num2: ");
         num2=input.nextInt();
        
        result = num1/num2;
        System.out.println("result:"+result);
        count=2;

        
        }
        catch(Exception e)
        {
            System.out.println("Exception :"+e);
            System.out.println("Enter currect value");
        }
        
        
        finally{
            
         System.out.println("Good luck");
        
        }
       
        } 
        while(count==0);
        
  
        
    }
    
    
    
    
}




output

run:
enter num1: 10
enter num2: 0
Exception :java.lang.ArithmeticException: / by zero
Enter currect value
Good luck
enter num1: 3
enter num2: 88888
result:0
Good luck
BUILD SUCCESSFUL (total time: 13 seconds)



*/














