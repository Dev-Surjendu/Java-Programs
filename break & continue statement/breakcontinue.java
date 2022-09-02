public class breakcontinue{
    public static void main(String args[]){
        
        System.out.println("continue statement ::");
        System.out.println();
        for(int i=1; i<=10; i++){
            if(i==7){
                continue; // its also called jumping statement
            }
            System.out.println("value is "+i);
        }
        System.out.println();
        System.out.println("break statement ::");
        for(int j=0; j<=10; j++){
            if(j==5)
            break;
            System.out.println(j);
        }
    }    
}
