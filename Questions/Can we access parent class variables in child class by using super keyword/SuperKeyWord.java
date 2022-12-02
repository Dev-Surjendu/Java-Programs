class Parent{
    int a=10;
}
class child extends Parent{
    int a=20;

    void print(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class SuperKeyWord{
    public static void main(String[] args) {
        child c=new child();
        c.print();
    }
}