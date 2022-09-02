 class StaticBlock {
    static int a=10;
    static int b=20;

    static{  // static block
        b=a*5;
    }
    public static void main(String[] args) {
        System.out.println("Value of a = "+a);
        System.out.println("Value of a = "+b);
    }
}
 

