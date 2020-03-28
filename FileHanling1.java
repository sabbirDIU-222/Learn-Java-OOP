
package advancejava;

import java.io.File;
import java.io.IOException;

/*




when we create or done any program we did a lot of things

but you know where our rest of program or where our data stored ??????

yes ! it is RAM random access memorary

Nand when we shhut down or restrt our pc the random memory are totally clear 
that's why we don't find our rest of program 

SO .... what's the solution 

the solution is 
               if we save our data in our computer hard disk then our rest of program 
or our data though we input privously 
it must be saved

.......................... SO let's learn JAVA FILE HAnDliNG



*/


public class FileHanling1 {
    public static void main(String[] args)  {
        
        File dir = new File("hello world");//we can create folder only by name or also the path location

        dir.mkdir();// our directory or folder creation method 
        String path = dir.getAbsolutePath();// it will show us the folder path
        System.out.println(path);// though it return a string so we store it in a string named path
        
        // output::::::: C:\Users\User\Documents\hello world
        
        // we already know the folder name 
        // but if you wnat to shoe it 
        System.out.println(dir.getName());// hello world will be printed
        
        System.out.println(dir.getClass());// class java.io.File printed
        
        System.out.println(dir.getParent());//C:\Users\User\Documents printed
        // i can also delete the folder by using Delete() method
        
       /* if(dir.delete())
        {
            System.out.println("directory deleted");
        }*/
       
       
       
       
    /*  ************************** now it's time to  cretae a file *******************/
       
       
       File file1 = new File(path+"/hello.txt");
       File file2 = new File(path+"/world.txt");
       File file3 = new File(path+"/fotka.txt");
       
       
       
       try{
          file1.createNewFile();// to create file use createNewFile() method
          file2.createNewFile();
          file3.createNewFile();
          
           System.out.println("file are successfully created");// if file  created a message 
       }
       catch(IOException e)
       {
           System.out.println(e);// if any exception found it must be catched
           System.out.println("file are not created");
       }
       
        file3.delete();
       // i can check 
      if(file3.exists())
      {
          System.out.println("file exists");// if file found then print it
      }
     
      else{
          System.out.println("file not found");
      }
       
        System.out.println(file3.canExecute());
    }
    
}

/*
run:
C:\Users\User\Documents\NetBeansProjects\AdvanceJava\hello world
hello world
class java.io.File
null
file are successfully created
file not found
false
BUILD SUCCESSFUL (total time: 0 seconds)



*/