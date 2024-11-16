public class StringtoInt 
{
    public static void main(String[] args) 
    {
        int num =7;
        System.out.println("num : "+num);
        
        String num1 = "_12";
        
        try 
        {
            int num2 = Integer.parseInt(num1);
            System.out.println("Num1 : "+num1);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("You can't add anything except numeric value.");
        }
    }   
}
