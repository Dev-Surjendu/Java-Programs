import java.util.Scanner;

public class ArmstrongNumber {

    static int amstrong(int n){
        return n*n*n;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int mod,sum=0;
        int temp=num;

        while(num>0){
            mod=num%10;
            sum=sum+amstrong(mod);
            num=num/10;
        }
        if(temp ==  sum)
            System.out.println(temp+" is an Amstrong number");
        else
            System.out.println(temp+" is not an Amstrong number");
    }
}
