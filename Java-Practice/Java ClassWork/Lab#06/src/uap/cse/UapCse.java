package uap.cse;
import uap.Employee;
import java.util.ArrayList;

public class UapCse 
{
    public String department;
    public ArrayList<Employee> employees;

    public UapCse(String department) 
    {
        this.department = department;
        this.employees = new ArrayList<>();
    }
 
    public void addNewEmployee(String nm, String id, String des, double sal) 
    {
        Employee newEmployee = new Employee(nm, id, des, sal);
        employees.add(newEmployee);
    }

    private Employee findEmployee(String id) 
    {
        for (Employee emp : employees) 
        {
            if (emp.getId().equals(id))
                return emp;
        }
        return null; 
    }
    
    public void increaseSalary(String id, double amt) 
    {
        Employee emp = findEmployee(id);
        if (emp != null)
            emp.increaseSalary(amt);
        else
            System.out.println("Employee not found.");
    }

    public void promote(String id, String newDesignation, double newSalary) 
    {
        Employee emp = findEmployee(id);
        if (emp != null)
            emp.promote(newDesignation, newSalary);
        else
            System.out.println("Employee not found.");
    }

    public double getSalary(String id) 
    {
        Employee emp = findEmployee(id);
        if (emp != null)
            return emp.getSalary();
        System.out.println("Employee not found.");
        return -1;
    }
    
    public void display(String id) 
    {
        Employee emp = findEmployee(id);
        if (emp != null)
            System.out.println(emp);
        else
            System.out.println("Employee not found.");
    }

    public void display() 
    {
        if (employees.isEmpty())
            System.out.println("No employees in the department.");
        else 
        {
            for (Employee emp : employees)
                System.out.println(emp);
        }
    }

    public String getDepartment() 
    {
        return department;
    }
}
