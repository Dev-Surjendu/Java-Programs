class Avg {
    int a,b=72,c=65;

    Avg(int x) {
        a=x;
        System.out.println("Student 1 = "+a+" "+b+" "+c);
    }
    Avg(int x,int y) {
        a=x;b=y;
        System.out.println("\nStudent 2 = "+a+" "+b+" "+c);
    }
    Avg(int x,int y,int z) {
        a=x;b=y;c=z;
        System.out.println("\nStudent 3 = "+a+" "+b+" "+c);
    }
    void Show() {
        int avg=(a+b+c)/3;
        System.out.println("Average = "+avg);     
    }
}
class Student{
    public static void main(String args[]){
        Avg obj=new Avg(82);
        obj.Show();

        Avg obj1=new Avg(77,73);
        obj1.Show();

        Avg obj2=new Avg(80,55,87);
        obj2.Show();
    }
}