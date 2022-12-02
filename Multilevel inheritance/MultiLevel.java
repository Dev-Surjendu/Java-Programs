class A{
    int a=10;
}
class B extends A{
    int b=20;
}
class C extends B{
    int c=30;
}
public class MultiLevel {
    public static void main(String[] args) {
        C obj=new C();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }    
}
