package beginnerjava;
import java.util.Scanner;
public class Practice 
{
    public static void main(String[] args) 
    {
        int m,n,i,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        m = input.nextInt();
        System.out.print("Enter final number : ");
        n = input.nextInt();
        System.out.print("Odd Numbers are :");
        for (i = m; i <=n; i++) 
        {
            if(i%2!=0)
            {
                sum = sum+i;
                System.out.print(" "+i);
            }
        }
        System.out.println("");
        System.out.printf("Sum of the odd numbers %d to %d is %d \n",m,n,sum);
  }
}
