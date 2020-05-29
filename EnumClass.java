
package javaalgorithm;


public enum EnumClass {
    //Every enum constant is always implicitly public static final. Since it is static, 
    //we can access it by using enum Name. 
    //Since it is final, we can’t create child enums.
    
    sabbir,samiwon;
    
}

class Test{
    public static void main(String[] args) {
        EnumClass test= EnumClass.samiwon;
        System.out.println(EnumClass.sabbir +  "  love "+ test);
      
    }
    // we can not declare any enumeration in any method 
    // we can call it from main method 
    public void test()
    {
        EnumClass i = EnumClass.samiwon;
        System.out.println(EnumClass.sabbir +  "  hate "+ i);
    }
}

/*
sabbir  love samiwon
BUILD SUCCESSFUL (total time: 0 seconds)
*/
