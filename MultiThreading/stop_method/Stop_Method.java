class A extends Thread{
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Class A");
        }
    }
}
class B extends Thread{
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Class B");
        }  
    }
}
class C extends Thread{
    
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Class C");
        }  
    }
}
class Stop_Method{
    public static void main(String[] args) {
        A t1=new A();
        B t2=new B();
        C t3=new C();

        t1.start();
        t2.start();
        t3.start();
        t2.stop();
    }
}