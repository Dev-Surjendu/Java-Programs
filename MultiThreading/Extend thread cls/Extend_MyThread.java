class Extend_Thread_Cls1 extends Thread{
    int i=0;
    @Override
    public void run(){ 
        while(i<1000){
            System.out.println("Class 1");
        i++;
        }
    }
}
class Extend_Thread_Cls2 extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i<1000){
            System.out.println("Class 2");
            i++;
        }
    }
}
public class Extend_MyThread{
    public static void main(String args[]) {
        Extend_Thread_Cls1 t1=new Extend_Thread_Cls1();
        Extend_Thread_Cls2 t2=new Extend_Thread_Cls2();
        t1.start();
        t2.start();
    }
}
