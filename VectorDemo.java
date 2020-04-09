
package multi_thread;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;
import java.util.function.Consumer;


public class VectorDemo {
    // to learn more about java collection framwork it is nessearry to know about vector
    // vector was introduce in jdl 1.0
    // vector is same as ArrayList 
    // and also it is implemented from java list 
    
    
    
    // so  let's start with it
    
    public static void main(String[] args) {
        
        
        Enumeration name;
        Vector<String> vector = new Vector<>();
        
        vector.add("mamu->daffodil");
        vector.add("rased->daffodil");
        vector.add("bappi->daffodil");
        vector.add("kumkum->daffodil");
        vector.add("tometo->daffodil");
        
        System.out.println(vector.capacity());// in vector i can know the capacity 
        // but in arraylist i can not find this capacity method otherwise i get sze() method
        Consumer<? super String> cnsmr;
        /*
        for(String g : vector)
        {
            System.out.println(g);
        }
        i can use for each loop to print all this program 
        
        but there are alternative also
        
        
        */
        
        
        vector.remove(2);
        //System.out.println(vector);// bappi gonna removed
        vector.add("the last pose");
        name = vector.elements();// if you use Elumeration class then you must initiaze with 
        // -> the reference of Elumeration class with vector object 
        
        // reference  =  vector_object.elements();
        
        while(name.hasMoreElements())// boolean method hasMoreElements()
        {
            System.out.println(name.nextElement());
        }
        
        
        // converted vetor to array
        ///***************************************************
        String[] array = vector.toArray(new String[vector.size()]);
        
        System.out.println("Arrray : " + Arrays.toString(array));/// we use Arrays clas to calll toStirng method
        
        
        
        
        
    }
    
}
/*


run:
10
mamu->daffodil
rased->daffodil
kumkum->daffodil
tometo->daffodil
the last pose

Arrray : [mamu->daffodil, rased->daffodil, kumkum->daffodil, tometo->daffodil, the last pose]
BUILD SUCCESSFUL (total time: 0 seconds)







*/