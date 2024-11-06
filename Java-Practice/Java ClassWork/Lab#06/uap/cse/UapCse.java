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
        Employee emp = new Employee(nm, id, des, sal);
        employees.add(emp);
    }
    private Employee findEmployee(String id) 
    {
        for(Employee emp : employees) 
        {
            if(emp.toString().contains("Id:" + id)) 
            {
                return emp;
            }
        }
        return null;
    }
    
    public void increaseSalary(String id, double amt) 
    {
        Employee emp = findEmployee(id);
        if(emp != null)
            emp.increaseSalary(amt);
    }
    
    public void promote(String id, String newDesignation, double newSalary) 
    {
        Employee emp = findEmployee(id);
        if(emp != null) 
        {
            emp.promote(newDesignation, newSalary);
        }
    }
    
    public double getSalary(String id) 
    {
        Employee emp = findEmployee(id);
        if(emp != null)
            return emp.getSalary();
        return 0.0;
    }
    
    public void display(String id) 
    {
        Employee emp = findEmployee(id);
        if(emp != null)
            System.out.println(emp);
    }
    
    public void display() 
    {
        for(Employee emp : employees)
            System.out.println(emp);
    }
}