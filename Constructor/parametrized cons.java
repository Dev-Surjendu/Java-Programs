class Test{
    Test(int a){  // this is called parametrized constructor 
        System.out.println(a);
    }
    public static void main(String args[]){
        Test t1 = new Test(7);   // (here we passing arguments thatwhy its call parametrized cons)
    } 
}