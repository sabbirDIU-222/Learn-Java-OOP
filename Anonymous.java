
package javaoop;


public class Anonymous {
    
    //  first of all we start to know about 
    /*   anonymous class extending a class 
       what we do to extend any claas in java 
        
    
    public class Abc{
    
    public void show()

    {
    System.out.println("i am from class Abc");
    }
    }
    
    class Def extends Abc{
    
    @Override
    public void show()
    {
    system.out.println("i am from Def class");
    }    
    
    public static void main(String[]args)
    {
    Abc obj = new Def();
    obj.show();
    
    }
  
    }
    
    **************************program output *****************
    i am from  Def class
   
    ////////////********
    WHAT  IF WE DON'T NEED TO CREATE Def  CLASS IN THIS PROGRAM 
    AND WE CREATE A NESTED CLASS 
    THAT CAN HAVE A CLASS WHICH HAVE NO NAME
    AND IT'S CALLED            ANONYMOUS CLASS 
    
    ANONYMOUS CLASS USUALLY EXTENDS SUPER CLASS AND IMPLEMENTS INTERFACES
    
    
    
    ***************************anonymous class looks like********************
    
    public class myclass{
    
    Abc obj  = new Abc()
    {
    
    // body of anonymous class
    // or can override any method 
    
    
    };
    
    when we need anonymous class
    Anonymous classes enable you to make your code more     *---concise.  
    They enable you to declare and instantiate a class at the same time. 
    They are like local classes except that they do not have a name.
    
    let's look an example of anonymous class extends a class
    

    

    
    */
    int x = 9;
    public void display()
    {
        System.out.println("this display is from Anonymous class" );
        System.out.println("x + " + x);
    }

}

class TestAnonymous
{
    
             // we create an anonymous class that extends Anonymous class'
    
    public void print()
    {
                 Anonymous ani = new Anonymous()
    {
        @Override
        public void display() {
            System.out.println("this ddisplay is from Testanonymous class");
            System.out.println(x);
        }
        
    };
    
    ani.display();
 
    }
    
        
    
    public void printinterface()
    {
          // anonymous is for code concise
          // it's not meaning that interfaces have create any object
        
        Abc obj = new Abc()// there is showing an suggestion that 
                             // this new Abc() anonymous will be lamda expresion
    {
        @Override
        public void into() {
            System.out.println("this method is from TestAnonymous class and override ");
        }
    
    };
          
         obj.into();
    
    }

    public static void main(String[] args) {
        
        
    
   TestAnonymous tani = new TestAnonymous();

   // firstly we can access it by object and object
   
   /*tani.ani.display();*/
   
        tani.print();
        tani.printinterface();
    }
  
}

/*lets check ANONYMOUS CLASS IMPLEMENTS ANY INTERFACES
*/

interface Abc{
    void into();
            
}



    // anonymous is for code concise
  
     //In anonymous classes, objects are created whenever they are required. 
//That is, objects are created to perform some specific tasks
    
