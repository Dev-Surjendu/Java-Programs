

class StaticDemo{
    static int a=10;
    
    int m1(){
/*static*/  int b = 20;  // you cannot use static keyword in local variable ... only use in class level variabels
            return b;
     }
    public static void main(String[] args) {
        StaticDemo obj=new StaticDemo();

        System.out.println(StaticDemo.a);  // calling the static variable using class name 
        System.out.println(a);  // calling "a variable" without creating any object of class 
        System.out.println(obj.a); // also u call the static variable using object name
        
        System.out.println(obj.m1());
    }
}