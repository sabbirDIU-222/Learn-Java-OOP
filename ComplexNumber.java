
package online_shop;


public class ComplexNumber {
    
    int real,image;
    
    ComplexNumber()
    {
        
    }
    
    ComplexNumber(int real,int image)
    {
        this.image = image;
        this.real = real;
        
    }
    
    void display()
    {
        System.out.println(real+ "+" + image+"i");
    }
    
   
    
       ComplexNumber add(ComplexNumber obj,ComplexNumber obj1)
    {
        ComplexNumber obj3 = new ComplexNumber();
        
        obj3.real = obj.real + obj1.real;
        obj3.image = obj.image + obj1.image;
        
        return obj3;
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        ComplexNumber obj = new ComplexNumber(5,9);
        ComplexNumber obj1 = new ComplexNumber(10,4);
        
        obj.display();
        obj1.display();
        
        ComplexNumber obj4 = new ComplexNumber();
        
        obj4 = obj4.add(obj, obj1);
        obj4.display();
        
        
        
        
    }
    
    
    
}




run:


5+9i
10+4i


15+13i


BUILD SUCCESSFUL (total time: 0 seconds)


 
