

class Demo{
    public static void main(String args[]){
        shape r = new square();
        r.draw();
    }
}

class shape {
    void draw(){
        System.out.println("Can't say shape type");
    }
    void draw(int x){ // method overloading

    }
}
class square extends shape {
    @Override
    void draw() { // method over riding
       System.out.println("HEYYYYYY");
    }
}

class box extends square {
    @Override
    void draw(){
        System.out.println("Byee");
    }
    
}