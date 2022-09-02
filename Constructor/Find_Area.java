// find the area of rectangle or triangle
class Rect_Triangle{
    int area;
    Rect_Triangle(int width,int length){
        area=width*length;
        System.out.println("Area of Rectangle = "+ area);
    }
    Rect_Triangle(int base,double length){
        double area=(base*length)/2;
        System.out.println("Area of Tritangle = "+ area);
    }
}
class Find_Area{
    public static void main(String[] args) {
        Rect_Triangle obj1=new Rect_Triangle(3,4);

        Rect_Triangle obj2=new Rect_Triangle(3,2.5);
    }
}