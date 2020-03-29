
package advancejava;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

// IN THIS CLASS WE USE FORMATTER CLASS TO WRITE INTO FILE
// WHEN YOU DONE TO WRITE FILE YOU MUST  *********** CLOSE() METHOD USE TO CLOSE THE FILE


public class FileHandling3 {
    
    // in this season we e=write into a file
    public static void main(String[] args) {
        
        File file = new File("product");
        file.mkdir();// folder create method
        if(file.exists())
        {
            
            System.out.println("product folder created : " + file.getName());
            System.out.println(file.length());
        }
        else
        {
            System.out.println("folder does not exists");
        }
            String name = file.getAbsolutePath();
            System.out.println("path of folder : " + name);
            
            
        // creating file in product folder
        
        File daily = new File(name+"/daily.txt");
        File market = new File(name+"/market.txt");
        
        
        try {
            
            daily.createNewFile();
            market.createNewFile();
         
            System.out.println("folders are created ");
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
            String n = daily.getAbsolutePath();
            System.out.println(n);
           // so FOLDER and Files are created
                 
            // *********** now Write or put data into file
            String proName,proPrice,ExP;
            
            
          try { 
              // import formatter classs
              
            Formatter formatter = new Formatter("C:/Users/User/Documents/NetBeansProjects/AdvanceJava/product/daily.txt");
            Formatter formatter1 = new Formatter("C:/Users/User/Documents/NetBeansProjects/AdvanceJava/product/market.txt");
            Scanner input = new Scanner(System.in);
              System.out.print("enter your total product number : ");
            
            int num;
            num = input.nextInt();
            
            for(int i=1;i<=num;i++)
            {
                System.out.println("product name : price : expired date : ");
                proName = input.next();
                proPrice = input.next(); 
                ExP = input.next();
                formatter.format("%s %s %s\r\n", proName,proPrice,ExP);
                formatter1.format("%s", proName);
                
                
            }
           

            
            // ************ MUST HAVE CLOSE THE FORMATTER OBJECT < OR THE DATA NOT STORE>>
            formatter.close();
            formatter1.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("ex");
        }
          
       
        System.out.println(file.length());
        
    }
    
}
/*

 ************** the out put will be store in your file what you created by code 



*/