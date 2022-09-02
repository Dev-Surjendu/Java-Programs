class Test{
    int i;    // int default value  0
    String s;// string default value null
    boolean b;
    /* public Test(){   // automatically use default constructor
        i=0;
        s=null;
        b=false;
     } */
    void show(){
        System.out.println(i+" "+s+" "+b);
    }

    public static void main(String args[]){
        Test t1 = new Test();
        t1.show();
    }
    
}
