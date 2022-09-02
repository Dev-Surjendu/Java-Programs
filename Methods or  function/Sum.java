import javax.sql.rowset.spi.SyncResolver;

class Sum{
    public static void main(String args[]){
        // for int
        System.out.println("Addition = "+sum(10,9));// actual parameter
        // for void
        sub();// actual parameter
    }

    static int sum(int a,int b) { // formal parameter 
        return a+b;    
    }

    static void sub() {  // formal parameter
        System.out.println("using void");   
    }
    
}