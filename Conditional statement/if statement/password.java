import java.util.Scanner;
class password{
    public static void main(String args[]){
        int num;
        
        System.out.print("ENter a number ::");
        
        Scanner s=new Scanner(System.in);
        num = s.nextInt();

        if(num==12345){
            System.out.println("my name = Surjendu kar");
            System.out.println("my age = 18");
            System.out.println("ph no = 12345678");
            System.out.println("ay address = telkal para , purulia");
        }
        else{
            System.out.println("Error...");
            System.out.println("Enter correct password");
        }
    }
}