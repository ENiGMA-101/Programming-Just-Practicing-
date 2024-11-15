class A 
{
    public void show()
    {
        System.out.println("in Show");
    }
    
    static class B
    {
        public void config()
        {
            System.out.println("in Config");
        }
    }
}

public class inClass
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();
    }
}