 class Compiletime {

    int add(){
        int x=10, y=20;
        return x+y;
    }
    void add(int x, int y){
        System.out.println(x+y);
    }
    void add(int x, double y){
        System.out.println(x+y);
    }
    public static void main(String args[]) {
        Compiletime obj= new Compiletime();
        System.out.println(obj.add());
        obj.add(100,200);
        obj.add(20,21.5);
    }
}
