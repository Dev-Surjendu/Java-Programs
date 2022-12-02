class A{
    void show(){
        System.out.println("Heyy..");
    }
}
class B extends A{
    @Override
    void show(){
        System.out.println("Byee..");
    }
}
public class OverRide {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
    }
}
