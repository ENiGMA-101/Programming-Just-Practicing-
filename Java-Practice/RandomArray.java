import java.util.Random;
public class RandomArray 
{
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(101) + 50;
        int largest = numbers[0];
        for (int number : numbers) 
        {
            if (number > largest)
                largest = number;
        }
        int sum = 0;
        for (int number : numbers)
            sum += number;
        double average = (double) sum / numbers.length;
        System.out.println("Array elements:");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println("\nLargest number: " + largest);
        System.out.println("Average: " + average);
        if (largest > average) {
            System.out.println("Largest number is greater than the average");
        } else {
            System.out.println("Largest number is not greater than the average");
        }
    }
}