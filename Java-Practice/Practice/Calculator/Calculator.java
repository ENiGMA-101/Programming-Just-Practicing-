import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args) 
    {
        AdvanceCalc calculator = new AdvanceCalc();
        Scanner scan = new Scanner(System.in);
        boolean continueCalculation = true;
        while (continueCalculation) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            if (choice == 5) 
            {
                // continueCalculation = false;
                System.out.println("Exiting calculator...");
                break;
            }
            else
            {
                System.out.print("Enter 1st number : ");
                int num1 = scan.nextInt();
                System.out.print("Enter 2nd number : ");
                int num2 = scan.nextInt();
                switch (choice) 
                {
                    case 1:
                        int sum = calculator.sum(num1, num2);
                        calculator.display(sum);
                        break;
                    case 2:
                        int sub = calculator.sub(num1, num2);
                        calculator.display(sub);
                        break;
                    case 3:
                        int multi = calculator.multi(num1, num2);
                        calculator.display(multi);
                        break;
                    case 4:
                        try 
                        {
                            int div = calculator.div(num1, num2);
                            calculator.display(div);
                        } 
                        catch (ArithmeticException e) 
                        {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        scan.close();
    }
}