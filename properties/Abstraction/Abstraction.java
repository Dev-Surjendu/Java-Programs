class A{
    public static void main(String args[]){
        Abstraction obj=new Abstraction(5,15);    
        obj.printPrimes();
    }
}
class Abstraction { // hiding unessential details and showing only essential information to the user
    private int start,end;  
    
    Abstraction(int s,int e){
        start = s;
        end = e;
    }
    private boolean isPrime(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
            count++;
            } 
        }
        if(count == 2){
        return true;// means its return 1
        }  
        return false;  // means its return 0    
    }

    void printPrimes(){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){   // if it is 1 then run the promgram....
                System.out.println(i);
            }
        }
    }
}
