class A
{
    public void display()
    {
        System.out.println("in A");
    }
}

class B extends A
{
    @Override
    public void display()
    {
        System.out.println("in B");
    }
}

public class overRide 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.display();    

        A obj1 = new B();
        obj1.display();
    }
}
