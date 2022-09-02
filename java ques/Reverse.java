import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter the String ::");
        String a = obj.nextLine();

        for(int i = a.length()-1; i>=0; i--){
            System.out.println(" "+i);
        }
    }   
}