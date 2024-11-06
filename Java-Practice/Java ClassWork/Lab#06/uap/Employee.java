package uap;
public class Employee 
{
    public String name,id,designation;
    public double salary;
    public Employee(String name, String id, String designation, double salary) 
    {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }
    public void increaseSalary(double amt) 
    {
        salary += amt;
    }
    public void promote(String designation, double newSalary) 
    {
        this.designation = designation;
        this.salary = newSalary;
    }
    public double getSalary() 
    {
        return salary;
    }
    public String toString() 
    {
        return "Name:" + name + "; Id:" + id + "; Designation:" + designation + "; Salary:" + salary;
    }
}