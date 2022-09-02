import java.util.Scanner;

class evenodd{

    public static void main(String args[]){
        int num;
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter a number ::");
        num=obj.nextInt();

        if(num % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

}