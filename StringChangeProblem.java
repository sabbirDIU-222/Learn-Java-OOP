
package swingdemo;


public class StringChangeProblem {
    // main method must be public , otherwise the jvm gives you the error 
    public static void main(String[] args) {
        
       // let first take any Immutable String 
       String name = "Shimul Islam SaBBir";
       
       // although this is immuatable so we need a mutable things to changes it's 
       // character and behaivour 
       
       StringBuilder builder  = new StringBuilder(name);
       
       // now take a for loop to traverse all the character at in the immutable string 
       
       for(int i =0 ; i< name.length() ; i++){
           
           
           // using the help of character class we define everything ervery condition 
           
           if(Character.isLowerCase(name.charAt(i))){
               
               builder.setCharAt(i, Character.toUpperCase(name.charAt(i)));
               
           }
           /// we have to set the value 
           // where upper case thier lowe 
           // and where lower case found to uppper 
           // that's why string buffer / builder help us 
           
           else if(Character.isUpperCase(name.charAt(i))){
               builder.setCharAt(i, Character.toLowerCase(name.charAt(i)));
                    
           }
           
           // end of for loop // traversing 
           
       }
       
       // now print all the value 
        System.out.println("upper-> lower ::: lower-> upper :: " + builder);

        /// output
        //upper-> lower ::: lower-> upper :: sHIMUL iSLAM sAbbIR
    }
    
}
