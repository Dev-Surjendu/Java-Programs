class A{
    void Time(){
        System.out.println("7.30");
    }
    void on(){
        System.out.println("Turn on");
    }
    void off(){
        System.out.println("Turn of");
    }
}

class B extends A{
    @Override
    void Time(){
        System.out.println("8.00");
    }
    
    @Override
    void on(){
        System.out.println("Turnnn onnn");
    }

    void hello(){
        System.out.println("Turnnn offf");
    }
} 

class Dynamic_Method{
    public static void main(String[] args) {
        A obj = new B();
        obj.Time();
        obj.on();
        obj.off();
        obj.hello();    
    }
}