package beginnerjava;
import java.util.Scanner;
class Assignment16 
{
    public static void main(String[] args) 
    {
        String CorrectName="hamdil"; 
        String CorrectPass="123456";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your User name : ");
        String name = input.nextLine();
        System.out.print("Enter your password : ");
        String pass = input.nextLine();
        if(name.equals(CorrectName) && pass.equals(CorrectPass))
                System.out.println("Welcome to the System"); 
        else
            {
                System.out.println("Incorrect Username/Password. Please try again\n");
                while(true)
                {
                    System.out.print("Enter your User name : ");
                    name = input.nextLine();
                    System.out.print("Enter your password : ");
                    pass = input.nextLine();
                    if(name.equals(CorrectName) && pass.equals(CorrectPass))
                        System.out.println("Welcome to the System");
                    break;
                }
            }
      }
  }
