class Calc{
    int num1;
    int num2;
    int result;

    Calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
}
public class NEW{
    public static void main(String args[]){
        Calc obj=new Calc(4,5);

        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}