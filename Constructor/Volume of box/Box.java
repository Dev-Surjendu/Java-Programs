class A {
    double Length, Width, Height;
    
    A(double x) {
      Length = Width = Height = x;
    }
    A(double x, double y) {
      Length = Width = x;
      Height = y;
    }
    A(double x, double y, double z) {
      Length = x;
      Width = y;
      Height = z;
    }
    void Volume() {
      System.out.println("\n");
      System.out.println("Box Length is :" + Length);
      System.out.println("Box Width is :" + Width);
      System.out.println("Box Height is :" + Height);
  
      double volume = Length * Width * Height;
      System.out.println("Valume of Box : " + volume);
    }
  }
  
  class Box {
    public static void main(String args[]) {
      A obj1 = new A(4.5);
      obj1.Volume();
  
      A obj2 = new A(4.5, 6.5);
      obj2.Volume();
  
      A obj3 = new A(2.6, 5.7, 6.3);
      obj3.Volume();
  
    }
  
  }