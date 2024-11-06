import uap.cse.UapCse;
import javax.swing.JOptionPane;

public class Uap {
    public static void main(String[] args) {
        UapCse myUap = new UapCse("CSE");
        
        while(true) {
            String menu = "Input '1' to add a new Employee\n" +
                         "Input '2' to get Salary info\n" +
                         "Input '3' to increase salary\n" +
                         "Input '4' to promote Employee\n" +
                         "Input '5' to display specific Employee\n" +
                         "Input '6' to display all Employees\n" +
                         "Input '0' to exit";
            
            String choice = JOptionPane.showInputDialog(menu);
            
            if(choice == null || choice.equals("0")) {
                break;
            }
            
            switch(choice) {
                case "1":
                    String name = JOptionPane.showInputDialog("Enter employee name:");
                    String id = JOptionPane.showInputDialog("Enter employee ID:");
                    String designation = JOptionPane.showInputDialog("Enter designation:");
                    double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary:"));
                    myUap.addNewEmployee(name, id, designation, salary);
                    break;
                    
                case "2":
                    id = JOptionPane.showInputDialog("Enter employee ID:");
                    double empSalary = myUap.getSalary(id);
                    JOptionPane.showMessageDialog(null, "Salary: " + empSalary);
                    break;
                    
                case "3":
                    id = JOptionPane.showInputDialog("Enter employee ID:");
                    double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to increase:"));
                    myUap.increaseSalary(id, amount);
                    break;
                    
                case "4":
                    id = JOptionPane.showInputDialog("Enter employee ID:");
                    String newDesignation = JOptionPane.showInputDialog("Enter new designation:");
                    double newSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter new salary:"));
                    myUap.promote(id, newDesignation, newSalary);
                    break;
                    
                case "5":
                    id = JOptionPane.showInputDialog("Enter employee ID:");
                    myUap.display(id);
                    break;
                    
                case "6":
                    myUap.display();
                    break;
            }
        }
    }
}
