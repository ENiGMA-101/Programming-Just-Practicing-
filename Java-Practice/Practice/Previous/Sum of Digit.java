package beginnerjava;
import java.util.Scanner;
public class SumOfDigit 
{
    public static void main(String[] args) 
    {
        int num,rem,temp,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit : ");
        num = input.nextInt();
        temp = num;
        while(temp!=0) 
        {
            rem = temp%10;
            sum = sum+rem;
            temp = temp/10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
