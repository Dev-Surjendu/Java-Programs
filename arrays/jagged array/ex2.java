import java.util.Scanner;

class EX2{  
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int p[][] = {
            {5,6,7,8},
            {3,4},
            {9,5,6,1}
        }; 
        int k[][] = new int[3][];

        k[0]=new int [4];
        k[1]=new int [2];
        k[2]=new int [3];

        for(int i[]:p){
            for(int j : i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        for(int i=0; i<=k.length; i++){    // ERROR
            for(int j=0; j<=k[i].length; j++){
                k[i][j]=num.nextInt();
            }
        }
        for(int i[]:p){
            for(int j : i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    
    }
}
