import java.util.Arrays;
import java.util.Scanner; 
class ArraysSort{
    
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int num;

        System.out.print("How many number you want to print :: ");
        num=obj.nextInt();

        int arr[]=new int[num];

        for(int i=0; i<num; i++){
            System.out.print("Enter "+(i+1)+ " No :: ");
            arr[i]=obj.nextInt();
        }
        System.out.print("In accending order :: ");
        
        Arrays.sort(arr); // here we using pre-define cls
        
        for(int b : arr){
            System.out.print(b+" ");
        }
    }
}