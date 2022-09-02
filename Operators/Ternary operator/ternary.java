

public class ternary {
    public static void main(String []args){
//Ex:1  
        int a=10;
        int b=20;

        //codintion ? true:false;
        int min = (a<b)?a:b ;
        int max = (a>b)?a:b ;
        System.out.println("Min = "+min);
        System.out.println("MAx = "+max);
//Ex:2  
        int res=(a>b)?(a+b):(a-b);
        System.out.println(res);

        int i=5;
        int j=0,z=0;

        j = i>6?1:2;
        z = i<6?1:2;
        System.out.println(j);
        System.out.println(z);
    }    
}


