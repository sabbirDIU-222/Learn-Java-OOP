
package advancejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;


public class HashsetDemo {
    public static void main(String[] args) {
        
        
        
        
        
        // hash set always have to different element
        
        
        
        HashSet<String> email= new HashSet<>();
        email.add("asif@gmail");
        email.add("rajib@gmail");
        email.add("mosi@gmail");
        email.add("jhon@gmail");
        email.add("bobi@gmail");
        email.add("dengoo@gmail");
        email.add("dude@gmail");
        email.add("jhon@gmail");
        System.out.println("all elements are : " + email);
               
        System.out.println("size of this hashset : " + email.size()); // it show the size 7 
        // jhon@gmail element duplicate that's why it is not count
        
        
        email.remove("mosi@gmail");// remove mosi@gmail
        System.out.println("after removing mosi :" + email);
        
        HashSet<String> email1= new HashSet<>();// using another hashset
        
        email1.add("sabbir@gmail");// add new element
        email1.addAll(email);// calling addall method
      
        
        System.out.println(email1);
        
        /*
        email.clear();
        System.out.println(email);
       */ 
        System.out.println(email.isEmpty()); //  if clear method called then true
        
        
        System.out.println("contain jhon in email: "  + email.contains("jhon@gmail"));
        System.out.println("contain an element is not exit : " + email1.contains("zamboooo"));
        System.out.println("\n");
        // for each loop to print all value
        for(String s : email1)
        {
            System.out.println(s);
        }
        
        System.out.println("\n");
        System.out.println("Iterator class to iterate all the value");
        System.out.println("\n");
        Iterator itr = email1.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    
    }
}

/*




Difference between List and Set

 ******************************************
A list can contain duplicate elements whereas Set contains unique elements only.




Hierarchy of HashSet class
The HashSet class extends*** AbstractSet class ***which implements** Set **interface.
The Set interface inherits Collection and Iterable interfaces in hierarchical order.



***********************OUTPUT*******************



run:
all elements are : [asif@gmail, jhon@gmail, rajib@gmail, dude@gmail, dengoo@gmail, mosi@gmail, bobi@gmail]
size of this hashset : 7
after removing mosi :[asif@gmail, jhon@gmail, rajib@gmail, dude@gmail, dengoo@gmail, bobi@gmail]
[asif@gmail, jhon@gmail, rajib@gmail, dude@gmail, dengoo@gmail, bobi@gmail, sabbir@gmail]
false
contain jhon in email: true
contain an element is not exit : false


asif@gmail
jhon@gmail
rajib@gmail
dude@gmail
dengoo@gmail
bobi@gmail
sabbir@gmail


Iterator class to iterate all the value


asif@gmail
jhon@gmail
rajib@gmail
dude@gmail
dengoo@gmail
bobi@gmail
sabbir@gmail
BUILD SUCCESSFUL (total time: 0 seconds)






*/