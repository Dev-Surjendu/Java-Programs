/* Output will be ---
10 dj Rahul  
11 aj Rahul 
*/
 class Employee {
    int emp_id;
    String name;
    static String ceo="Rahul";  // memory efficient  (here we use static keyword ,that's why "RAhul" did not take two memory location)  )

    Employee(int emp_id,String name){
        this.emp_id=emp_id;
        this.name=name;
    }

    void display(){
        System.out.println(emp_id+" "+name+" "+ceo);
    }
    public static void main(String[] args) {
        Employee e1=new Employee(10,"dj");
        e1.display();

        Employee e2=new Employee(11,"aj");
        e2.display();
    }
    
}
