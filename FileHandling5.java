
package advancejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileHandling5 {
    public static void main(String[] args) {
        
        /*            read into a file java program */
        
        
        try{
            // first need to allocate the file 
            // from your folder and copy the link 
              File obj = new File("C:/Users/User/Documents/NetBeansProjects/AdvanceJava/student_list/section_B.txt");// 
              Scanner scanner = new Scanner(obj);// help of scanner classin the parenthisis type the reference of file class
              
              // though our file is so long then we need to a loop , 
              while(scanner.hasNextLine())// hasNextline() method return true or false 
              {
                   String sc = scanner.nextLine();// store all in any string type variable
                   System.out.println(sc);// and print it
                   
              }// *************** ust CLOSE the scanner reference 
             scanner.close();
             
        }
        catch(FileNotFoundException e)
        {
            System.out.println("file not found");
            System.out.println(e);
        }
      

    }
}


/*                                                          OUTPUT
run:



there are 44 student in section B 
sakib is the class representative 
BUILD SUCCESSFUL (total time: 0 seconds)









*/








