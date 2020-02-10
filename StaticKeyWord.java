
package online_shop;


public class StaticKeyWord {
    
    private int id;
    private String name;
   
    
  
    
    

    
    public static String universityName = "Daffodil International University";
    
    StaticKeyWord(int id, String name)
    {
        this.id = id;
        this.name = name;
        
    }
    
    void display()
    {
        System.out.println(id + " " + name + " " + universityName);
        System.out.println(" \n\n\n");
    }
    
    static  void change()
    {
        universityName =  "Shanta mariam university";
    }
    
    
    
    
    public static void main(String[] args) {
        
        StaticKeyWord obj = new StaticKeyWord(123,"robiwul awal");
        obj.display();
      
        
        StaticKeyWord.change();
        
        
        StaticKeyWord obj1 = new StaticKeyWord(123,"robiwul awal");
        obj1.display();
        
        
        StaticKeyWord obj2 = new StaticKeyWord(323,"somrat ali");
        obj2.display();
        
        StaticKeyWord obj3 = new StaticKeyWord(1233,"akbar ali");
        obj3.display();
        
        StaticKeyWord obj4 = new StaticKeyWord(233,"bristy kumari");
        obj4.display();
        
        StaticKeyWord obj5 = new StaticKeyWord(1313,"rjiborah nowfol");
        obj5.display();
      
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
