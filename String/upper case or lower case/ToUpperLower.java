import java.util.Scanner;
class ToUpperLower{
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);

        System.out.print("Enter your name in small letter :: ");
        String s=num.nextLine();

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
    
        System.out.print("Enter your name in capital letter :: ");
        String str=num.nextLine();

        System.out.println(str.toLowerCase());
        System.out.println(str.length());
    
    }
}
