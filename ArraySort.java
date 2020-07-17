
package selectionsortdemo;

import java.util.Scanner;


public class ArraySort {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    // Java matrix program to to transpose any matrix 
     transposematrix();

     // transpose matrix unsing manually
     transposeMatrixmanualy();
         

        
    } 
    
    public static void transposematrix(){
                // Java matrix program to to transpose any matrix 
        
        
        // in general way
        
        int[][] original = {{1,4,3},{2,4,5},{3,6,7}};
        
        
        System.out.println("print the original one");
        for(int i = 0;i<3 ; i++){
            for(int j = 0; j<3 ; j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        // so it's look lke 
//        1 4 3 
//        2 4 5 
//        3 6 7 
        System.out.println("");
        System.out.println("transpose the matrix colum goes to row -");
        
        // it will look like
        
//        1 2 3 
//        4 4 6
//        3 5 7

         for(int i = 0;i<3;i++){
             for(int j=0; j<3 ;j++){
                 System.out.print(original[j][i] + " ");
             }
             System.out.println("");
         }
     
    }
    
    
    public static void transposeMatrixmanualy(){
       
        
        
       System.out.println("take row and coloumn");
       Scanner sc = new Scanner(System.in);
       
       int row = sc.nextInt();
       int column = sc.nextInt();
       
       int[][] original = new int[row][column];
       
       
        System.out.println("input matrix");
        
        for(int i = 0;i<row; i++){
            for(int j = 0;j<column; j++){
                original[i][j] = sc.nextInt();
                System.out.print(" ");
            }
        }
       
        // now print the original matrix what it will be look like 
        System.out.println("now the original matrix");
        for(int i = 0;i<row; i++){
            for(int j=0 ; j<column; j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        
        System.out.println("now the transpose code ");

        
       for(int i = 0;i<row; i++){
            for(int j=0 ; j<column; j++){
                System.out.print(original[j][i] + " ");
            }
            System.out.println("");
        }
       
//       
//       take row and coloumn
//3
//3
//input matrix
//2 4 6
//   1 4 8
//   4 4 4
//   now the original matrix
//2 4 6 
//1 4 8 
//4 4 4 
//
//now the transpose code 
//2 1 4 
//4 4 4 
//6 8 4 
//BUILD SUCCESSFUL (total time: 28 seconds)
//
//       
       
       
       
        
    }
    
    
}
