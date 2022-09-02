class A{
    int width;
    int depth;
    int height;
    int w,h,d;
    A(int wh,int dh,int hh){
        width = wh;
        depth = dh;
        height = hh;
    }
    A(A ob){
        w =ob.width;
        d =ob.depth;
        h =ob.height;
    }
    void display(){
        System.out.println(w);
        System.out.println(d);
        System.out.println(h);
    }
}
class Copy_obj{
    public static void main(String[] args) {
        A ob1=new A(10,20,30);
        A ob2=new A(ob1);
        ob2.display();
    }
}