public class Ex3 {
    int em_id;
    int salary;
    static String ceo;
    
    void show(){
        System.out.println(em_id+" "+salary+" "+ceo);
    }
    public static void main(String[] args) {
        Ex3 n1=new Ex3();
        n1.em_id=9;
        n1.salary=9000;
        ceo="Rahul";
        
        Ex3 n2=new Ex3();
        n2.em_id=10;
        n2.salary=10000;
        ceo="Rahul";

        n1.show();
        n2.show();
         
        ceo="Surjendu"; 
        n1.show();
        n2.show();
    }
}
