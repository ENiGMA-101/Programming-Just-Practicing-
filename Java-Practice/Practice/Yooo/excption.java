public class excption 
{
    public static void main(String[] args) 
    {
        int i=0;
        int j=0;
        try 
        {
            j = 5/i;
            if(i==0)
                throw new ArithmeticException("I don't want to divide by zero..");
            int a[] = new int[5];
            System.out.println(a[1]);
            System.out.println(a[5]);
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Can't divide by zero.. Error : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in Array size limit..");
        }
        catch(Exception e) //Parent class.. Exception itself a class
        {
            System.out.println("Something went wrong.. "+e);
        }
    }
}
