
package hello;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Static {
    int rollNum;
    String stuNme;
    
    public static String UniName = "Daffodil International University";
    
    // creating a constructor
    Static(String stuNme,int rollNum)
    {
        this.stuNme = stuNme;
        this.rollNum = rollNum;
    }
    
    public String toString()
    {
        return stuNme + " " + rollNum + " " + UniName;
    }
    
    
}

class TestTer
{
    public static void main(String[] args) {
        
        // just take any kind of list pr vector '
        // in this seasson i use linked list that's help me to manage 
        List<Static> stuinfo = new LinkedList<>();
        
        stuinfo.add(new Static("sabbir",999));
        stuinfo.add(new Static("rasel",321));
        stuinfo.add(new Static("kobir",922));
        stuinfo.add(new Static("ibrahim",111));
        stuinfo.add(new Static("roky",9090));
        stuinfo.add(new Static("jubayer",3332));
        //
        
      //  Static.UniName = "--------Open in 2009";
        
        // you can use forEach to traverse the whole list 
        // but i use iterator class 
        /// it helpes me to better code 
        
        Iterator itr = stuinfo.iterator();
        // print any messsage 
        
        System.out.println("the stdent list ---------\n\n");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        /*
       
        this gonna show us this out put 
        
        
        run:
the stdent list ---------


sabbir 999 Daffodil International University
rasel 321 Daffodil International University
kobir 922 Daffodil International University
ibrahim 111 Daffodil International University
roky 9090 Daffodil International University
jubayer 3332 Daffodil International University
BUILD SUCCESSFUL (total time: 0 seconds)

        */
        
        //  but what happen if you wanna change your static value
        // like that our uniNme or university name has been changed 
        // so what progrramer do , they do call this static variable using it's class nme
        // and it must be before at iterator so the program should changed and traverse 
        // let's watch
        
        
        
        Static.UniName = " Daffodil Bangladesh University";
        
        Iterator itr2 = stuinfo.iterator();
        // print any messsage 
        
        System.out.println("the stdent list ---------\n\n");
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
        
        
 
        
    }
}