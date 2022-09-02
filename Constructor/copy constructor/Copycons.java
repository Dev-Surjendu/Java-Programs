class A {
    int a; String b;

    A(){
        a=10; b="rahul";
        System.out.println(a+" "+b);
    }
    A(A ref){  // its call copy cons
        int c=ref.a;
        String d=ref.b;
        System.out.println(c+" "+d);
    }
    public static void main(String args[]){
        A r=new A();
        A r2=new A(r);
    }

}
