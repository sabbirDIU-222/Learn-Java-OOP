
package javaalgorithm;

import java.util.EnumSet;


public class enumtest  {
   public static void main(String[] args)
   {
      for(constant c : constant.values())
      {
          System.out.println(c + " " + c.getDescription() + " " + c.getAge());
      }
      
      
      // let's put and out all things in EnumSet class
       System.out.println("\nnew line to check with EnumSet class static method range\n");
      for(constant d : EnumSet.range(constant.samiwon,constant.mahin))
      {
          System.out.println(d + " " + d.getDescription() + " " + d.getAge());
      }
   }
    
}

enum constant
{
    sabbir("vlo chele","22"),
    samiwon("poca meye","21"),
    nobel("stupid","17"),
    sinthia("talkative","21"),
    mahin("fotka","20");
    
    

    
    private String description,age;
    
    // constructor
    constant(String description,String age)
    {
        this.description = description;
        this.age = age;
    }

    // although it's private variable that's why we need getter 
    public String getDescription() {
        return description;
    }

    public String getAge() {
        return age;
    }
    
    
    
}
