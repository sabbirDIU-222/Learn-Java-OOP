
package javaalgorithm;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;



enum Days
{
    saturday,sunday,monday,thusday,wednesday,thrusday,friday;
}

public class EnumsetDemo {
    public static void main(String[] args) {
        
        // lEt's use some method of java enumset class static method 
        Set<Days> set = EnumSet.of(Days.friday,Days.wednesday);
        Set<Days> set2 = EnumSet.allOf(Days.class);
        
        Iterator<Days> itr = set.iterator();
        Iterator<Days> itr2 = set2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("\nall elemts print by calling allof method \n");
        // In this we don't use any looop
        System.out.println("dyas : " + set2);
        
        
    }
}


/*
run:
wednesday
friday

all elemts print by calling allof method 

dyas : [saturday, sunday, monday, thusday, wednesday, thrusday, friday]
BUILD SUCCESSFUL (total time: 0 seconds)

*/
