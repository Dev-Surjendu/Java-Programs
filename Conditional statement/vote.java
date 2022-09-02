import java.util.Scanner;

class vote {
    public static void main(String args[]){
    
    String num;
    int age;
    
    Scanner obj=new Scanner(System.in);
    
    System.out.print("Enter your name::");
    num=obj.nextLine();
    System.out.print("Enter your age::");
    age=obj.nextInt();
    
    if(age>=18){
        System.out.println("you are eligible for voting");
    }
    else{
        System.out.println("you are not eligible for voting");
    }
    }

}