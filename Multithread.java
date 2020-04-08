/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Multithread extends Thread{
    int num;
    
    public void run()
    {
        for(num =0; num<100000;num++)
        {
           num++;
        }
        
        
    }
   
}

class test{
    public static void main(String[] args) {
        
        Multithread t = new Multithread();
        Multithread t1 = new Multithread();
        t.start();
        t1.start();// this gonna print 0;
        
         System.out.println(t.num);
        // initially mian thread comes here to claculate the value of number
        
       // by calling this sleep method 
       /// we actually don't know how many times need to sllep it 
       // so it is not the standered from
       /*
 
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        */
        try {
            t.join();// until run method die , the main thread wait here
            
        } catch (InterruptedException ex) {

            System.out.println(ex);
            
/// Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    System.out.println(t.num);
   
    }  
  
}
