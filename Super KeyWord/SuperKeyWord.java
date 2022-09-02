class Base {
    Base() {
        System.out.println("I am a base cls Constructor");
    }
    Base(int x) {
        System.out.println("I am an Overloaded Cosntructor of base cls with value of x as : "+x);
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("I am a Derived cls Constructor");
    }
    Derived(int x,int y) {
        super(x);
        System.out.println("I am an Overloaded Cosntructor of derived cls with value of y as : "+y);
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am a ChildOfDerived cls constructor");
    }
    ChildOfDerived(int x,int y ,int z) {
        super(x,y);
        System.out.println("I am an Overloaded cosntructor of childofderived cls with value of z as : "+z);
    }
}

class SuperKeyWord {
    public static void main(String[] args) {
       // Base b = new Base();
       // Base ba = new Base(10);
       // Derived D = new Derived();
       // Derived De = new Derived(10,20);
       // ChildOfDerived CD = new ChildOfDerived();
        ChildOfDerived COD = new ChildOfDerived(10,20,30);
    }
}