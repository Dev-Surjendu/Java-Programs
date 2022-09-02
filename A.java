import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter a number ::");
        int a=obj.nextInt();

        System.out.println(""+a);

        obj.close();
    }   
}