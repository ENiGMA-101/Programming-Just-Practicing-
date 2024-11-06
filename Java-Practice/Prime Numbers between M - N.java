package beginnerjava;
import java.util.Scanner;
public class PrimeCheck 
{
    public static void main(String[] args) 
    {
        int m,n,i,count=0,TotalPrime=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        m = input.nextInt();
        System.out.print("Enter final number : ");
        n = input.nextInt();
        System.out.print("Prime Numbers between "+m+" to "+n+" : ");
        for (i = m; i <= n; i++) 
        {
            for (int j = 2; j <i; j++) 
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            } 
            if(count == 0)
            {
                System.out.print(" "+i);
                TotalPrime++;
            }
            count=0;
        }
        System.out.println("");
        System.out.println("Total Prime Numbers between "+m+" to "+n+" : "+TotalPrime);
    }
}
