import java.util.Arrays;
import java.util.Scanner;
class Bigfactorial{

    static int[] factorial(int n) {
            int store[] = new int[n];
            int count = -1;
    
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 ) {
                store[++count] = i;
            }
       }
    return Arrays.copyOfRange(store, 0, count+1);
    }

    static void allfact(int val){
        System.out.println();
        for (int i = 1; i <= val; i++) {
            if (val % i == 0 ) {
                System.out.print(" "+i);
            }
       }
       System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number ::");
        int num = sc.nextInt();
    
        int size[] = factorial(num);
        for (int i = 0; i < size.length; i++) {
            System.out.print(" "+size[i]);
        }
        for(int i=0; i<size.length; i++){
           allfact(size[i]);
        }
    }
}