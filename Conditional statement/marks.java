import java.util.Scanner;
class marks{
    public static void main(String args[]){
    
    int marks;
    Scanner obj=new Scanner(System.in);
    
    System.out.print("Enter your marks ::");
    marks=obj.nextInt();

    if(marks>=60 && marks<=100){
        System.out.println("First divison");
    }
    else if(marks>=45 && marks<60){
        System.out.println("Second divison");
     }
    else if(marks>=33 && marks<45){
        System.out.println("Third divison");
    }
    else if(marks>100 || marks<0){
        System.out.println("error.....");
        System.out.println("Enter correct marks");
    }
    else{
        System.out.println("fail");
        }
    }
}