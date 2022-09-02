interface Area{
    float pi = 3.14f ;
    float compute(float x, float y);
}

class Rectangle implements Area{
    public float compute(float x, float y){
        return(x*y);
    }
}

class Circle implements Area{
    public float compute(float x, float y){
        return(pi*x*x);
    }
}

class InterFace{
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        Circle obj2= new Circle();
        
        Area area; // reference variable 

        area=obj1;        
        System.out.println(area.compute(4,7));

        area=obj2;
        System.out.println(area.compute(3,5));
    }
}