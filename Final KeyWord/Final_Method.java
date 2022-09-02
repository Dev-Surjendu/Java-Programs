class Test{
    void nNumber(){
        System.out.println("7887370323");
    }
    final void atmpin(){
        System.out.println("5432");
    }
}

class Theif extends Test{
    @Override
    void nNumber(){
        System.out.println("7887370323");
    }
    @Override
    void atmpin(){
        
        System.out.println("5432");
    }
}

class Final_Method{
    public static void main(String[] args) {
        Theif obj = new Theif();
        obj.nNumber();
        obj.atmpin();
    }
}