public class Calculator 
{
    public static void main(String[] args) 
    {
        AdvanceCalc calculator = new AdvanceCalc();
        int sum = calculator.sum(10,20);
        int sub = calculator.sub(50,20);
        int multi = calculator.multi(3,5);
        int div = calculator.div(10, 5);
        System.out.println("Sum : "+sum+"\nSub : "+sub+"\nMulti : "+multi+"\nDiv : "+div);    
    }
}
