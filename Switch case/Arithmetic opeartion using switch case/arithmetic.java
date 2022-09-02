import java.util.Scanner;

class arithmetic{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double num1,num2,c;

        System.out.print("Enter 1st number ::");
        num1=obj.nextDouble();

        System.out.print("Enter 2nd number ::");
        num2=obj.nextDouble();

        System.out.print("Enter arithmetic operator::");
        char op = obj.next().charAt(0); // here (0) is index number ... suppose user give '+ - /' then console 
                                              //  will execute + because index number is 0

        switch(op){
            case '+': c=num1+num2;
                System.out.println("sum of two number = "+(int)c);
                break;
            case '-': c=num1-num2;
                System.out.println("sub of two number = "+(int)c);
                break;
            case '*': c=num1*num2;
                System.out.println("mul of two number = "+(int)c);
                break;
            case '/': c=num1/num2;
               System.out.println("div of two number = "+Math.round(c*1000.0)/1000.0);
                break;
            case '%': c=num1%num2;
                System.out.println("mod of two number = "+c);
                break;
            default :
                System.out.println("ERROR");
        }
    }
}