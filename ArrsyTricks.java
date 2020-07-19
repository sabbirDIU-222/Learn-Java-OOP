
package selectionsortdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrsyTricks {
    
    
     public static void main(String[] args) {
      // array tricks to reverse any array 
    // so how can we reverse any array
    
    // let's take an array 
    
    int[] array = {4,5,6,7,8,9};
    // our mission is to reverse this array 
    
         System.out.println("without reversing this array :"
                 + " " + Arrays.toString(array));
        
         
         
     
         
    
          reverseArray(array);
          
          
          // printing reverse string 
          
          String[] arrays = {"sabbir","kabie","hau","habu","lzon","sipu"};
          strinfReverse(arrays);
      
    }
     
     
     
     public static void reverseArray(int[] array){
         
         for(int left=0, right = array.length-1; 
                 left<right ; left++,right--){
             
             int temp = array[left];
             array[left]=array[right];
             array[right]=temp;
             
             
             
             
         }
         System.out.println("revers array ");
        for(int x : array){
            System.out.print(" " +x);
        } 
         
       // finished of reversearray method  
     }
     
     
     
     /// reverse any String array 
     public static void strinfReverse(String[] arrays){
         
         // to using the java collections framework we need a list
         List<String> list = Arrays.asList(arrays);
         // after finishing the converting as list
         // we call collection dot reverse method 
         // it's a static method 
         Collections.reverse(list);
         
         String[] reverse = list.toArray(arrays);
         System.out.println("");
         System.out.println("reversed string : " 
                 + Arrays.toString(arrays));
         
         
         
//         for(int left = 0, right = arrays.length ; left<right ;
//                 left++,right--){
//             
//             
//             
//             int temp = Integer.parseInt(arrays[left]);
//             Integer.parseInt(arrays[left]) = arrays[right];
// 
//         }
//         
         
     }
     
    
}
