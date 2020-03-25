
package advancejava;

import java.util.LinkedList;


public class LinkedList2 {
    
    String name;
    int id;
    static String inst = "Daffodil International University";
    
    LinkedList2(String name,int id)
    {
        this.name = name;
        this.id = id;
    }
    
    public String toString()
    {
        return name + "  " + id + "  " +inst;
    }
    

    
}

class Testlist{
    
    public static void main(String[] args) {
        // we declare Linked list
        //<> we use Linkedlist2 as object
        LinkedList<LinkedList2> list =  new LinkedList<>();
        
        
        
        
        LinkedList2 st1 = new LinkedList2("kamal",1001);
        LinkedList2 st2 = new LinkedList2("rafik",1002);
        LinkedList2 st3 = new LinkedList2("jobbar",1003);
        LinkedList2 st4 = new LinkedList2("borkot",1004);
        LinkedList2 st5 = new LinkedList2("jahangir",1005);
        LinkedList2 st6 = new LinkedList2("motiur",1006);
        LinkedList2 st22 = new LinkedList2("moinr",3333);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        list.remove(st2); // rafik 1002 will be remove
        list.add(1, st22);
        
        
        
        
       // LinkedList2.inst = "santo marion"; i can also change static reference
       
       
        
        
        
        
        
        
        
        for(LinkedList2 l : list)
        {
            System.out.println(l.toString());
            //System.out.println(l.id + " " + l.name); i can also print like this
        }
        
        
        
        
    }
   
}


/*
kamal  1001      Daffodil International University
moinr  3333      Daffodil International University
jobbar  1003      Daffodil International University
borkot  1004      Daffodil International University
jahangir  1005      Daffodil International University
motiur  1006      Daffodil International University



BUILD SUCCESSFUL (total time: 0 seconds)

*/