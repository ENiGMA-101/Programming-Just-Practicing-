package beginnerjava;
import java.util.Scanner;
public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers for fibonacci series? : ");
        n = input.nextInt();
        int first = 0, sec = 1,fibo;
        System.out.print("Fibonacci Series : "+first+" "+sec);
        for (int i = 3; i <= n; i++) 
        {
            fibo = first + sec;
            first = sec;
            sec = fibo;
            System.out.print(" "+fibo);
        }
        System.out.println("");
    }
}
