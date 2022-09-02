import java.util.Scanner;

public class forinput{
        
    public static void main(String[] args){
    int a,b,c;        
    System.out.print("ENter any two number ::");
        Scanner obj=new Scanner(System.in);
    
        a=obj.nextInt();
        b=obj.nextInt();

        c=a+b;
        System.out.println("Sum of two numbers = "+c);
    }
}