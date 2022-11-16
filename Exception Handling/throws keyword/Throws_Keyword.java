public class Throws_Keyword {
    public static void main(String[] args) throws InterruptedException{ // send the exception to the JVM
        
        for(int i=0; i<10; i++){
            System.out.println("Rahul");
            Thread.sleep(1000);
        }
    }    
}
