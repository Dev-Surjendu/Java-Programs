import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the value of N");
        int num=sc.nextInt();

        System.out.println("The Fibonacci series is : ");
        for (int i = 0; i < num; i++) {
            System.out.print(" "+a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
