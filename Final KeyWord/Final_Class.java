final class Test{
    void nNumber(){
        System.out.println("7887370323");
    }
    void atmpin(){
        System.out.println("5432");
    }
}
class Theif extends Test{
    
    void nNumber(){
        System.out.println("7887370323");
    }
    void atmpin(){
        System.out.println("5432");
    }
}
class Final_Class{
    public static void main(String[] args) {
        Theif obj = new Theif();
        obj.nNumber();
        obj.atmpin();
    }
}