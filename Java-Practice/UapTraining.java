public class UapTraining
{
    public static void main(String[] args)
    {
        Training dataTraining = new Training("Data Science Bootcamp", "Labib",60);
        dataTraining.registerStudent(2);
        dataTraining.registerStudent(2);
        dataTraining.display();
    }
}