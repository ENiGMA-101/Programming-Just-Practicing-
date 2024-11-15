class A
{
    public void display()
    {
        System.out.println("in A");
    }
}

class B extends A
{
    public void display()
    {
        System.out.println("in B");
    }
}

public class overRide 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.display();    
    }
}
