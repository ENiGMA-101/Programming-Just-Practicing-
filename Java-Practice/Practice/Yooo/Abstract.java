abstract class car
{
    public abstract void drive();
    public abstract void fly();

    public void music()
    {
        System.out.println("Playing Music");
    }
}
class BMW extends car
{
    public void drive()
    {
        System.out.println("Driving..");
    }
    public void fly()
    {
        System.out.println("Flying");
    }
}
public class Abstract 
{
    public static void main(String[] args) 
    {
        car obj = new BMW();
        obj.drive();
        obj.fly();
        obj.music();
    }    
}
