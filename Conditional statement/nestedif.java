import java.util.Scanner;

class nestedif{
    public static void main(String args[]) {
    
    int num1,num2,num3; 
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter 1st number ::");
    num1=obj.nextInt();

    System.out.println("Enter 2nd number ::");
    num2=obj.nextInt();

    System.out.println("Enter 3rd number ::");
    num3=obj.nextInt();
    
    if(num1>num2){
        if(num1>num3){
            System.out.println("MAx = "+num1);
        }
        else{
            System.out.println("MAx = "+num3);
    }
    }
    else{
        if(num2>num3){
            System.out.println("MAx = "+num2);
        }
        else{
            System.out.println("MAx = "+num3);
        }
    }
}
}