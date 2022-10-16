import java.util.Arrays;
import java.util.Scanner;

class Factorial {
    static int[] factorial(int n) {
        int store[] = new int[n];
        int count = -1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                store[++count] = i;
            }
        }
        return Arrays.copyOfRange(store, 0, count+1);
    }

    static boolean isPrime(int val) {
        int count=0;
        for(int i=1; i<=val; i++){
            if(val%i==0)
            count++;
        }
        if(count == 2){
            return true;
        }
        return false;
    }
    static int sum(int add[]){
        int sum=0;
        for(int i=0; i<add.length; i++){
            sum=sum+add[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number ::");
        int num = sc.nextInt();

        int size[] = factorial(num);
        System.out.print("Prime numbers are :: ");
        for (int i = 0; i < size.length; i++) {
            System.out.print(" "+size[i]);
        }
        int add=sum(size);
        System.out.print("\nSum  :: ");
        System.out.println(add);
    }
}