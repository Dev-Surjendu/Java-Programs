public class parametrizedex2 {
    int x,y,c;
    String d;
     parametrizedex2(int a, int b){
        x=a; y=b;
    }
     parametrizedex2(int a, String b){
       System.out.println(a+" "+b);
    }
    void show(){
        System.out.println(x+" "+y);
    }

    public static void main(String args[]){
        parametrizedex2 obj=new parametrizedex2(100,200);
        obj.show();
        parametrizedex2 s=new parametrizedex2(100,"Rahul");
        
    }
}
