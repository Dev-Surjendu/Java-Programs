interface A{
    int a=2;
    int b=3;
}
interface B{
    int c=5;
    int d=6;
}
class Calculate implements A,B{ // multiple inheritance
    int cal(){
        return (a+b+c+d);
    }
}
class Operator{
    public static void main(String[] args) {
        Calculate obj=new Calculate();
        System.out.println(obj.cal());
    }
}