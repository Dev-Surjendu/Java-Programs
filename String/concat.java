public class concat {
    public static void main(String args[]){
        String str = "Rahul"; // string is immutable (can't change)
        str.concat(" Kar");
        System.out.print(str);

        String str1 = "Rahul";              
        String str2 = str1.concat(" Kar");   // store the value in diff variable..then u will use concat method
        System.out.print("\n"+str2);
        
    }    
}