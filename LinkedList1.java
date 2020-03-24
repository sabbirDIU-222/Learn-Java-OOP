
package advancejava;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedList1 {
    
    public static void main(String[] args) {
        
        
        
        // linked lst are same of ArrayList in java
        
        LinkedList<String> stuName = new LinkedList<>();
        
        stuName.add("sabbir");
        stuName.add("karim");
        stuName.add("rahin");
        stuName.add("mahin");
        stuName.add("kana");
        stuName.add("motim");
        stuName.add("mamun");
        // i can use to add at the begining of my list
        stuName.addFirst("m a MOTIN");
        // i can ise to add method at the last of my list
        stuName.addLast("B i pasa");
        // i can insert anywhere i want
        stuName.set(3, "M o nir");
        // i also can remove my list
        stuName.remove("mamun");// mamun remove
       // stuName.remove(); i can remove singly
        
       // i can remove also by the callling of indeex number 
       
       stuName.remove(3);// M o nir will remove
        
        
       
        
        
        
        
        
        /*System.out.println(stuName);
        /[sabbir, karim, rahin, mahin, kana, motim, mamun]*/
        
        
     for(String name:stuName)
        {
            System.out.println(name);
            
        }
        System.out.println("\n");
     // get firat and last element
        System.out.println("first element : " + stuName.getFirst());
        System.out.println("last element : " + stuName.getLast());
       
        
        System.out.println("size of the list is : " + stuName.size());
        
        /*
     i also can use Iterator class for print all the list
     
        Iterator itr = stuName.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        */
    }
    
}
