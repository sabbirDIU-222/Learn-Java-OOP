
package multi_thread;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DateClass implements Runnable{
    // in this program we check various of our localdate program 
    public void run()
    {
        
        System.out.println("inside the run method : " + Thread.currentThread().getName());
        LocalDate local = LocalDate.now();
        LocalDate yesterday = local.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        
        System.out.println("local date today is : " + local);
        System.out.println("yesterday date is : " + yesterday);
        System.out.println("tomorrow date  is : " + tomorrow);
        
        try {
          Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
          

          // Logger.getLogger(DateClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    // *********************************************       Main Thread **********************************
    public static void main(String[] args) {
         // first we need to mention LocalDate class if you want to know the today's date
  
    DateClass date = new DateClass();
    Thread t1 = new Thread(date , "this t1 go tor run method");
     System.out.println("inside the main method "+Thread.currentThread().getName());
    
     t1.start();
       try {
            t1.join();
        } catch (InterruptedException ex) {
           
                System.out.println(ex);            

//Logger.getLogger(DateClass.class.getName()).log(Level.SEVERE, null, ex);
        }
   
     LocalTime time = LocalTime.now();
     System.out.println("this is from main time in: " + time);
    
    
    
    }    
}


************** output **************

run:
inside the main method main
inside the run method : this t1 go tor run method
local date today is : 2020-04-08
yesterday date is : 2020-04-07
tomorrow date  is : 2020-04-09
this is from main time in: 13:34:59.165
BUILD SUCCESSFUL (total time: 5 seconds)
