import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
 
        StringBuilder rv=new StringBuilder(num);
        rv.reverse();
        String result = rv.toString();
        
        if(result.equals(num) ){
            System.out.println("palidrome number");
        }else{
            System.out.println("not a palidrome number");
        }
            
    }
}
