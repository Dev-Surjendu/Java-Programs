class calc{
    int num1;
    int num2;
    int result;

    public calc() {
        num1 = 5;
        num2 = 6;
        System.out.println(num2);
    }
    public calc(int n){
        num1=n;
        num2=n;
    }
}


public class objectdemo {
    public static void main(String args[]){
        calc obj = new calc(7);      // calc() is a constructor
        System.out.println(obj.num1);
    }    
}
