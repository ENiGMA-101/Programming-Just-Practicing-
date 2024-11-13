import uap.cse.UapCse;
import java.util.*;
public class Uap 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        UapCse myUap = new UapCse("UAP CSE");

        while (true) 
        {
        	System.out.println();
            System.out.println("-- UAP CSE Department --");
            System.out.println("1. Add a New Employee");
            System.out.println("2. Get Salary info of a specific Employee");
            System.out.println("3. Increase the Salary of an Employee");
            System.out.println("4. Promote an Employee");
            System.out.println("5. Display the details of a specific Employee");
            System.out.println("6. Display the list of Employees");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Employee name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Employee ID: ");
                    String id = scan.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = scan.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scan.nextDouble();
                    scan.nextLine();
                    myUap.addNewEmployee(name, id, designation, salary);
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    id = scan.nextLine();
                    double empSalary = myUap.getSalary(id);
                    if (empSalary != -1)
                        System.out.println("Salary of Employee " + id + ": " + empSalary);
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    id = scan.nextLine();
                    System.out.print("Enter the amount to increase salary by: ");
                    double amt = scan.nextDouble();
                    scan.nextLine();
                    myUap.increaseSalary(id, amt);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    id = scan.nextLine();
                    System.out.print("Enter new designation: ");
                    designation = scan.nextLine();
                    System.out.print("Enter new salary: ");
                    salary = scan.nextDouble();
                    scan.nextLine();
                    myUap.promote(id, designation, salary);
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    id = scan.nextLine();
                    myUap.display(id);
                    break;

                case 6:
                    myUap.display();
                    break;

                case 0:
                    System.out.println("Exiting the system...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again..");
            }
        }
    }
}

