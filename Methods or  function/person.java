class person{
    String name="Rahul";
    int age=18;
    String favcolor="black";

    void sleep(){
        System.out.println("i am sleeeping");
    }
    void pubg(){
        System.out.println("i am playingg");
    }
    

public static void main(String args[]){
        person p=new person();

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.favcolor);

        p.sleep();
        p.pubg();
 
    }
}