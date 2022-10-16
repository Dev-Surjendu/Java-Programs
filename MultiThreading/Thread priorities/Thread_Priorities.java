 // MIN_PRIORITY  = 1 
 // NORM_PRIORITY = 5
 // MAX_PRIORITY  = 10

class A extends Thread{
    public A(String name){
        super(name);
    }
    public void run(){
        System.out.println(this.getName()+" -----> "+this.getPriority());
    }
}
class Thread_Priorities{
    public static void main(String[] args) {
        A t1 = new A("Rahul_1");
        A t2 = new A("Rahul_2");
        A t3 = new A("Rahul_3");
        A t4 = new A("Rahul_4");
        A t5 = new A("Rahul_5");
        System.out.println("Thread name  Priority");
        t5.setPriority(Thread.MAX_PRIORITY);       
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}