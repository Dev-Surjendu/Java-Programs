class Outer {
    int a;
    
    public void show(){
        System.out.println("In Outer class");
    }
    class Inner{
        public void display(){
            System.out.println("In Ineer class");
        }
    }
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();// --> Inorder to create obj of Inner class we need to access obj of Outer class
        // Inorder to use Inner class u have to create Outer class
        obj1.display();
    }
}
