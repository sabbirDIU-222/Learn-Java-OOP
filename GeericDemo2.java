
package javaalgorithm;


public class GeericDemo2 {
    public static void main(String[] args) {
        System.out.println("maximum value is : -> "+maximum(20,30,50,89));
        System.out.println("maximum string  is :->"+maximum("kawser","sabbir","hasib","sokhina"));
        System.out.println("maximum value is : -> "+maximum(111231,1233434,345345,3492884));
        
    }
    
    
    // In this generic method we have a *** Return ** type
    // although generic method is used for alternative of method overloading 
    // here T is Data type ,
    // so we can use any kind of data put here and that is the benefit of generic method  
    // here T extends Comparable class which contain in daimon type < T >
    
    public static<T extends  Comparable<T>> T maximum(T a, T b, T c,T d)
            // look we have a return type and that is what we put in here as T in data tyoe
    {
        T max = a;
        if(b.compareTo(a) > 0)
        {
            max = b;
        }
        if(c.compareTo(b) > 0)
        {
            max = c;
        }
        if(d.compareTo(max) > 0)
        {
            max = d;
        }
        
        return max;
    }
}
   
    /*
run:
maximum value is : -> 89
maximum string  is :->sokhina
maximum value is : -> 3492884
BUILD SUCCESSFUL (total time: 0 seconds)


*/

