/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaalgorithm;

/**
 *
 * @author User
 */
public class GenericDemo {
    
    public static void main(String[] args) {
        
        Integer[] iary = {1,2,3,4};
        Character[] cray = {'m','o','o','n'};
        String[] srau = {"sabbir","madam"};
        
        Integer i = 8;
        
        generic(i);
        System.out.println("integer data are  : " );
        generic(iary);
        
        
        System.out.println("character data are : " );
        generic(cray);
        
        System.out.println("string data are : ");
        generic(srau);
    }
    
    /// generic method insted of method overloading 
    public static<T> void generic(T[] i)
    {
        for(T array : i)
        {
            System.out.printf("%s " , array);
        }
        System.out.println();
    }
   
    // the same things i can do by method overloading 
    
    public static void generic(Integer ir)
    {
       
        System.out.println(ir);
    }
    
    
}
/*
run:
8
integer data are  : 
1 2 3 4 
character data are : 
m o o n 
string data are : 
sabbir madam 
BUILD SUCCESSFUL (total time: 0 seconds)

*/