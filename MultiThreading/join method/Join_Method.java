class A extends Thread{
    public A(String name) {
        super(name);
    }
    @Override
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(this.getName());
        }
    }
}
class Join_Method{
    public static void main(String[] args) {
        A t1 = new A("Rahul");
        A t2 = new A("Surjo");
        A t3 = new A("Taj");

        t2.start(); 
        try{
            t2.join(); // execute 1st
        }
        catch(InterruptedException i){
        }
        t1.start();
        t3.start();
    }
}