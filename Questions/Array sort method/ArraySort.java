import java.util.Arrays;
import java.util.Scanner;
class ArraySort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a[]=new int[10];
        
        for(int i=0; i<a.length; i++){
            System.out.printf("Enter %d element : ",i+1);
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
    }
}