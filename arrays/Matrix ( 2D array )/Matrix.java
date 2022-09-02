import java.util.Scanner;

class Matrix{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        
        int num[][]=new int[2][2];

        System.out.println("Enter values ::");
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                num[i][j]=obj.nextInt();        
            }
        }
        System.out.println("Matrix elements ::");

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(num[i][j]+" ");        
            }
            System.out.println();
        }

    }
 }