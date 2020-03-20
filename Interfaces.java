/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.solving;


 interface Interfaces {
    // we also can use variable 
    // but variable must be constant 
    // and we know , the stabndered is the constant variable name must be in upppercase
    int A = 4;
    default void display()
    {
        System.out.println("it's default method");
    }
    
    // if we don't put public abstract key word in this line 
    // jvm automatically input it
    
    public void show();
    // it's like that 
    
    public abstract int add(int a,int b);
    
    public static void main(String[] args)
    {
        
    }
    
}

 class zio implements Interfaces
{

    @Override
    public void display() {
        System.out.println("thos is dispaly");
    }

    @Override
    public void show() {
        System.out.println("nothing");
        
    }
    

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    
    public static void main(String[ ]args){
        
        
        zio xi = new zio();
        
    }
     
    
}