package beginnerjava;
import java.util.Scanner;
class ArmstrongNumber 
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
            sum = sum+rem*rem*rem;
            temp = temp/10;
        }
        if(num == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
