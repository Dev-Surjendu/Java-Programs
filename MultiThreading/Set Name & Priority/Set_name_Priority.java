class A extends Thread{
   public void run(){
       System.out.println(this.getName()+" -----> "+this.getPriority());
   }
}
class Set_name_Priority{
   public static void main(String[] args) {
       A t1 = new A();
       A t2 = new A();
       A t3 = new A();
      
       t1.setName("Rahul_1");
       t2.setName("Rahul_2");
       t3.setName("Rahul_3"); 
       
       t1.setPriority(10);
       t2.setPriority(3);
       t3.setPriority(1);
       
       System.out.println("Thread name  Priority");
        t1.start();
        t2.start();
        t3.start(); 
    }
}