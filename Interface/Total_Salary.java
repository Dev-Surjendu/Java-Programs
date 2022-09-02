import java.util.Scanner;
interface DA{
    double da = 0.2;
}
interface HRA{
    double hra = 0.6;
}
class Employee implements DA,HRA{
    int Employee_ID;
    double Basic_Salary;

    void salary (int a, double b)
    {
        Employee_ID = a;
        Basic_Salary = b;
    
        double Total_Salary = Basic_Salary + (da * Basic_Salary) + (hra * Basic_Salary);
      
        System.out.println ("ID of Employee : " + Employee_ID);
        System.out.println ("Total salary of Employee : " + Total_Salary);
    }
}
class Total_Salary{
    public static void main(String[] args) {

        Scanner n=new Scanner(System.in);
        
        System.out.println("Enter the Employee id :: ");
        int emp_id = n.nextInt();

        System.out.println("Enter the Basic_salary :: ");
        double emp_salary = n.nextInt();

        Employee obj=new Employee();
        obj.salary(emp_id,emp_salary);
    }
}