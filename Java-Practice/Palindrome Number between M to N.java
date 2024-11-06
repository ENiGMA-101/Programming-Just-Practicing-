package beginnerjava;
import java.util.Scanner;
public class Assignment14
{
    public static void main(String[] args) 
    {
        int m,n, rem, sum, count=0,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        m = input.nextInt();
        System.out.print("Enter final number : ");
        n = input.nextInt();
        System.out.print("Palindrome Numbers : ");
        for (int i = m; i <= n; i++) 
        {
            temp = i;
            sum = 0;
            while(temp!=0)
            {
                rem = temp % 10;
                sum = sum*10 + rem;
                temp = temp/10;
            }
            if(i == sum)
            {
                System.out.print(" "+i);
                count++;
            }
        }
        System.out.println("");
        System.out.println("Total Palindrome Numbers : "+count);
    }
}
