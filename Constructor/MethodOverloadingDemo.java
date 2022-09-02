class Casio{
    public void add(int i, int j){
        System.out.println(i+j);
    }
    public void add(int i, int j, int z){
        System.out.println(i+j+z);
    }
    public void add(double x,double y){
        System.out.print(x+y);
    }
}

public class MethodOverloadingDemo {
    public static void main(String args[]){
        Casio obj = new Casio();
        obj.add(5,2);
        obj.add(4,5,6);
        obj.add(4.5,6.7);

    }    
}
