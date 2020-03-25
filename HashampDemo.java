
package advancejava;

import java.util.HashMap;
import java.util.Map;

public class HashampDemo {
    public static void main(String[] args) {
        
        
        HashMap<String,Integer> staff = new HashMap<>();
        
        
       staff.put("shamim", 33334);
       staff.put("emem", 44443);
       staff.put("robi", 11112);
       staff.put("koli", 333331);
       
       //staff.remove("shamim");
       // we can also replacce the value 
       staff.replace("emem", null);
       staff.putIfAbsent("raib", null);
        
       // System.out.println(staff);
       /* output
       {shamim=33334, robi=11112, koli=333331, emem=44443}
       */
        

       // staff.clear();           clear all the map 
        // System.out.println(staff.isEmpty());          return boolean type is empty or not
        //System.out.println(  staff.clone()); 	        It is used to return a shallow copy of this HashMap instance:
        
        //System.out.println(staff.entrySet());              t is used to return a collection view of the mappings contained in this map.
        
       /* 
        
        
        for(Integer d : staff.values())
        {
            System.out.println(d);
        }

        
        output

run:
33334
11112
333331
44443
BUILD SUCCESSFUL (total time: 0 seconds)
        
        for(Integer d : staff.keySet())
        {
            System.out.println(d);
        }
output;;;;;;;;;;
        shamim
        emem 
        robi 
        koli
        
   
            */
       
       
       // conataing any value or key to use those method 
       // it return true or flase
       
        System.out.println(staff.containsValue(33334));
        System.out.println(staff.containsKey("habib"));
       
       for(String s : staff.keySet()){
           
           
           System.out.println(" " +s +"  : " + staff.get(s) );
       }
       
       // i can also use Map subinteerface to use getKey() and getValue() method
        for(Map.Entry m:staff.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      } 
      /*
       i can also create any instance of hashmap
       
       HashMap happy = new HashMap();
       
       happy.put("h","mama");
       
        System.out.println(happy.get("h")); 
        
        */
      
     
    }
}


/*

output

true
false
 shamim  : 33334
 robi  : 11112
 koli  : 333331
 raib  : null
 emem  : null
shamim 33334
robi 11112
koli 333331
raib null
emem null
BUI




*/