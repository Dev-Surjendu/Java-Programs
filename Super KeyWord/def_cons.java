import java.util.stream.BaseStream;

class Base{
    Base(){
        System.out.println("i am a base cls constructor");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("i am a derived cls cons");
    }
}
class def_cons{
    public static void main(String[] args) {
       // Base b = new Base();
        Derived D = new Derived(); 
    }
}