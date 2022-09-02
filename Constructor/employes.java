class Employee{
    String name;
    int emp_id;

    Employee(){
        System.out.println("Enter name and id !!");
    }
    
    Employee(String name,int emp_id){
        System.out.print(name+emp_id);
    }



  // public class employes {    (not a compulsary in constructor)
    public static void main(String args[]){
        Employee obj = new Employee();      //  here we didn't pass any argument..
        Employee t1 = new Employee("Rahul",101);
    }   
}
