class SumsUp {

    int num1 = 10, num2 = 20;

    // same signature(same return type), different arg or parameter
    void add() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    void add(int num1) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        // using this in method overloading
        System.err.println("usin this method .......");
        System.out.println(this.num1 + " + " + this.num2 + " = " + (this.num1 + this.num2));
    }
}
class OverLoading{
    public static void main(String[] args) {
        SumsUp sum1 = new SumsUp();

        sum1.add();
        sum1.add(20);
        sum1.add(20, 30);
    }

}
