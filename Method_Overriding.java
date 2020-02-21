
package javaoop;

public class Method_Overriding {
    int id;
    String name;
    
    
    public void info()
    {
        System.out.println("this method is in Methid_overriding class");
        
        System.out.println(name+ " " + " " + id);
    }
    
  
}



class NewClass extends Method_Overriding
{
    
    // suuppose we need any variable in this class
    // we already have the id and name variable from Method_overriding class
    // and also we have the info() method
    
    int age;
    
    @Override
     public void info()
     {
         // we can change this method
         System.out.println("this is overriding method");
         System.out.println(name+ "  " + id + " " + age);
         
         
         
         
     }
    
    
    
    
}



class test 
{
    
    public static void main(String[] args) {
        
        NewClass obj  = new NewClass();
        
        obj.age = 33;
        obj.id = 32;
        obj.name = "dada";
        
        obj.info();
        
        Method_Overriding obj1 = new Method_Overriding();
        obj1.info();
        
        
        
    }
   
}