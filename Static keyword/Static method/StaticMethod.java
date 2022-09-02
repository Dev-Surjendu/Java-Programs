class StaticMethod {
    static int i=2;              //     A static method can  accesse only static variable and method.. 
    static void thisMethod(){
    //    System.out.println(this.i);     static method can't refer to "this" or "super" keyword in anyway
    
    }
    static void display(){
        show();                     //   A static method can call only static method and can't call a non-static method 
        System.out.println(i);
    }
    static void show(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        display();
    }    
}
