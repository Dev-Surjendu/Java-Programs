//find max and min...
import java.util.Scanner;

public class MaxMin{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int num;

        System.out.print("How many number you want to print :: ");
        num=obj.nextInt();

        int arr[]=new int[num];

        System.out.print("Enter 1 No :: ");
        arr[0]=obj.nextInt();

        for(int i=1; i<num; i++){
            System.out.print("Enter "+(i+1)+ " No :: ");
            arr[i]=obj.nextInt();
        }
        for(int i=1; i<num; i++){
            if(arr[0]<arr[i]){
                arr[0]=arr[i];
            }
        }
        System.out.println("MAX = "+arr[0]);
        
        for(int i=1; i<num; i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
            }
        }
        System.out.print("MIN = "+arr[0]);
    }
} 