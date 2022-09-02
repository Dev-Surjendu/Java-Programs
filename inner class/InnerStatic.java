class Outer {
    static int a;
    
    public static void show(){
        System.out.println("In Outer class");
    }
    static class Inner{
        public void display(){
            System.out.println("In Ineer class");
        }
    }
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.show();
        Outer.Inner obj1= new Outer.Inner();
        obj1.display();
    }
}
