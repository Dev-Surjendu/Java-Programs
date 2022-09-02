interface DA
{
  final static double da = 0.2;
}
interface HRA
{
  final static double hra = 0.6;
}
class Employee implements DA,HRA
{
  int Employee_ID;
  double Basic_Salary;

  void salary (int a, double b)
  {
    Employee_ID = a;
    Basic_Salary = b;
    double Total_Salary =
      Basic_Salary + (da * Basic_Salary) + (hra * Basic_Salary);
      System.out.println ("ID of Employee : " + Employee_ID);
      System.out.println ("Total salary of Employee : " + Total_Salary);
  }
}

class Calculate_total_salary
{
  public static void main (String[]args)
  {
    Employee emp = new Employee ();
      emp.salary (123, 20000);
      
    }
}
