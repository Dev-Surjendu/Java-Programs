class A extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println("Rahul");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i){

        }
        
    }
}
class Sleep_Method{
    public static void main(String[] args) throws InterruptedException{
        A t1 = new A();
        t1.start();
        
        for(int i=0; i<5; i++){
            System.out.println("Surjo");
            Thread.sleep(1000);
        }
    }
}