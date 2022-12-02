import java.io.*;
public class Reverse {
 public static void main(String[] args) {
    String str="Rahul";
    System.out.println("Original String "+str);

    StringBuilder rv=new StringBuilder(str);
   
    // System.out.println("Reversed string: "+rv.reverse());      // directly u can print (output will be same)
    rv.reverse();
    String result = rv.toString();
    System.out.println("Reversed string: "+result);
 }   
}
