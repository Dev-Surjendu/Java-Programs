class A extends Thread{
    public A(String name){
        super(name);
    }
    public void run(){
        /////////
    }
}
class Thread_Constructor{
    public static void main(String[] args) {
        A t1=new A("Rahul");
        A t2=new A("Surjo");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is "+t1.getId());
        System.out.println("The id of the thread t1 is "+t1.getName());
        System.out.println("\n The id of the thread t1 is "+t2.getId());
        System.out.println("The id of the thread t1 is "+t2.getName());
        
    }
}