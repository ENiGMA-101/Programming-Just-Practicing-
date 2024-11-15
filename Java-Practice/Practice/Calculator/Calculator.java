import java.util.*;
public class Calculator 
{
    public static void main(String[] args) 
    {
        AdvanceCalc calculator = new AdvanceCalc();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers to sum: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = calculator.sum(num1, num2);
        calculator.display(sum);

        System.out.print("Enter two numbers to subtract: ");
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int difference = calculator.sub(num3, num4);
        calculator.display(difference);

        System.out.print("Enter two numbers to multiply: ");
        int num5 = scan.nextInt();
        int num6 = scan.nextInt();
        int product = calculator.multi(num5, num6);
        calculator.display(product);

        System.out.print("Enter two numbers to divide : ");
        int num7 = scan.nextInt();
        int num8 = scan.nextInt();
        try 
        {
            int quotient = calculator.div(num7, num8);
            calculator.display(quotient);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scan.close();
    }
}