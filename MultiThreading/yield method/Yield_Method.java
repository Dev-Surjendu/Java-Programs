class A extends Thread{
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getName()+" "+getPriority());
            Thread.yield();
        }
    }
}
class B extends Thread{
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getName()+" "+getPriority());
        }  
    }
}
class Yield_Method{
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        
        t1.setName("Rahul");
        t2.setName("Surjo");

        t1.setPriority(10);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}