class A{
    int width;
    int height;
    int depth;

    A(A obj){
        width=obj.width;
        height=obj.height;
        depth=obj.depth;
    }
    A(int w , int h, int d){
        width=w;
        height=h;
        depth=d;
    }
    A(){
        width=height=depth=-1;
    }
    A(int len){
        width=height=depth=len;
    }
    void volume(){
        System.out.println(width*height*depth);
    }
}
class B extends A{
    int weight;
    B(B obj){
        super(obj);
        weight=obj.weight;
    }
    B(int w, int h, int d,int m){
        super(w, h, d);
        weight=m;
    }
    B(){
        super();
        weight=-1;
    }
    B(int len,int m){
        super(len);
        weight=m;
    }
}
class BoxWeight {
    public static void main(String[] args) {
        B obj1=new B(10,20,30,40);
        B obj2=new B();
        B obj3=new B(obj1);
        B obj4=new B(10,15);

        obj4.volume();
    }
}