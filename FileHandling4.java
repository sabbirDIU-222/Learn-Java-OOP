
package advancejava;
// AFTER WRITE INTO A FILE  YOU MUST USE CLOSE() METHOD 

// in all privous lecturer we use Formatter class to write and format into a file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//In the following example, we use the FileWriter class together with its write() method to write some text to the file
public class FileHandling4 {
    public static void main(String[] args) {
        
        File crtfile = new File("student_list");
        crtfile.mkdir();
        if(crtfile.exists())
        {
            System.out.println("name of the folder : " + crtfile.getName());
            
        }
        else
        {
            System.out.println("folder is not created ");
        }  
        
        
            String path =  crtfile.getAbsolutePath();
            System.out.println("path = " +path);
        
       
        File file1 = new File(path+"/section_A.txt");// must be fill the type
        
        File file2 = new File(path+"/section_B.txt");//must be fill the type of file
        
        
        // create file for file1
        try {
            
            file1.createNewFile();
            if(file1.exists())
            {
                System.out.println("name of file : " + file1.getName());
            }
            else
            {
                System.out.println("fil is not created");
            }
        } 
        catch (IOException ex) {
            System.out.println(ex);
        }
        // create file for file2 
        try {
            file2.createNewFile();
              if(file2.exists())
            {
                System.out.println("name of file : " + file2.getName());
            }
            else
            {
                System.out.println("fil is not created");
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
  
        // write into file 
        // this time we use FileWriter class 
        System.out.println("to know the path of file");
        String n = file1.getAbsolutePath();
        System.out.println(n);
        String m = file2.getAbsolutePath();
        System.out.println(m);
      
        try {
            FileWriter writefile = new FileWriter(n);
            
            writefile.write("there are 34 student in section A");
            writefile.append("\n  you can also append any text ");
            writefile.write(" i am not ready for this");
            
            writefile.close();// must to be close() method 
            
            System.out.println("successfully write  file");
            
        } 
        
        catch (IOException ex) {
            System.out.println(ex);
        }
        
        try {
            FileWriter writefile = new FileWriter(m);
            writefile.write("there are 44 student in section B \nsakib is the class representative ");
            System.out.println("successfully write file into file B ");
            writefile.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
        
        
        
        
    }
}
