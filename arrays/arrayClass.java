import java.util.Scanner;

class arrayClass{
    public static void main(String args[]){
        
        int a[]=new int[5];
        Scanner obj=new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            System.out.print("Enter "+i+" no = ");
            a[i]=obj.nextInt();
        }
        System.out.println("Your array elements are :: ");
        
        for(int b : a){
            System.out.print(b+" ");
        }
    }
}