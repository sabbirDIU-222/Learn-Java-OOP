
package javaalgorithm;

import java.util.EnumMap;
import java.util.Map;


public class EnumMapDemo {
    public static void main(String[] args) {
       try
       {
           EnumMap<people,String> map = new EnumMap<>(people.class);
        
        map.put(people.buira,"my dearest friend ");
        map.put(people.sabbir,"it's me");
        map.put(people.hasib,"my jigri dost");
        map.put(people.kawser, "my beaib");
        
        
        
        // print 
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " "  + m.getValue());
        }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        
        
    }
    
}


enum people
{
    sabbir,moti,kawser,oli,hasib,buira,sagor,nemo;
}

/*
EnumMap class is a member of the Java Collections Framework & is not synchronized.
EnumMap is ordered collection and they are maintained in the natural order of their keys( natural order of keys means the order on which enum constant are declared inside enum type )
It’s a high performance map implementation, much faster than HashMap.
All keys of each EnumMap instance must be keys of a single enum type.
EnumMap doesn’t allow null key and throw NullPointerException, at same time null values are permitted*/

/*
run:
sabbir it's me
kawser my beaib
hasib my jigri dost
buira my dearest friend 
BUILD SUCCESSFUL (total time: 0 seconds)
*/