import java.util.Scanner;
class Trim{
    public static void main(String args[]) {
        
        String name="   RAHUL   ";
        System.out.println(name.trim());  // removes whitesapce

        Scanner obj=new Scanner(System.in);

        System.out.printf("Enter your name :: ");
        String store=obj.nextLine();
        System.out.println(store.trim());
    }
}