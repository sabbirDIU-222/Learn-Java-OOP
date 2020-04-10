
package multi_thread;


public class Innerclass {
    int variable = 100;
    // neted class under Innerclass

    public Innerclass() {
    }

    public Innerclass(int variable) {
        this.variable=variable;
    }
    
    class inside
    {
 
        int variable2 = 200;  
    }  
}
class testclass
{
    public static void main(String[] args) {
        
        // to get variable we need an object of Innerclass       
        Innerclass obj = new Innerclass(122);
        Innerclass.inside obj1 = obj.new inside();
        System.out.println(obj.variable);
        System.out.println(obj1.variable2);      
    }
}
/*
run:
122
200
BUILD SUCCESSFUL (total time: 0 seconds)

*/
// what if we have static class inside the inner class
class outerclass
{
    String message = "to acces the static class";
    static class innerclass
    {
        String msg = " this time we need no object of cretion static class object";
        public void print()
        {
            System.out.println("*** i can also call method from static clss");
        }
    }
    
}
class mian{
    public static void main(String[] args) {
        outerclass obj = new outerclass();
        System.out.println(obj.message);
        // we create object for accesss outerclass data
        
        /// innerclass is static that's why we no need of outerclass object 
        // we need outerclass and dot operator to assscess innerclass
        outerclass.innerclass reference = new outerclass.innerclass();
        System.out.println(reference.msg);
        reference.print();
        
    }
}
/*
run:
to acces the static class
 this time we need no object of cretion static class object
*** i can also call method from static clss
BUILD SUCCESSFUL (total time: 0 seconds)

*/

interface phone
{
    // annonymous class
    void show();

}
class Miann
{
    

    public static void main(String[] args) {
        phone obj = ()-> System.out.println("annonymous inner class");// using lamdba exp
    // cz it interface classs is h=funtional interface
    obj.show();
    }
    
}