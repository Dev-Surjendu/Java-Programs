class Calc{
    int n1;
    int n2;
    Calc(int num1,int num2){
        n1 = num1;
        n2 = num2;
    }
}
public class practice{
    public static void main(String args[]){
        Calc obj = new Calc(4,5);

        System.out.println(obj.n1);
        System.out.println(obj.n2);
    }
}