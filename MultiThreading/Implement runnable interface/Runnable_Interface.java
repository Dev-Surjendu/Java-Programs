class MyThreadRunnable1 implements Runnable{
    int i=0;
    @Override
    public void run(){ 
        while(i<2000){
            System.out.println("hello");
        i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    int i=0;
    @Override
    public void run(){
        while(i<2000){
            System.out.println("World");
            i++;
        }
    }
}
public class Runnable_Interface{
    public static void main(String args[]) {
        MyThreadRunnable1 t1=new MyThreadRunnable1();
        Thread th1=new Thread(t1);

        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
    }
}
