import java.util.Scanner;    // switch statement is also called as selective structure

public class Switchcase {
    public static void main(String []args){
        int n=4;            //  char support , double not support , String not support(support in 1.7 version)

        switch(n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                 break;            
            case 3:
                System.out.println("Three");
                break;            
            case 4:
                System.out.println("Four");
                break;            
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Error");
        }

    }    
}
