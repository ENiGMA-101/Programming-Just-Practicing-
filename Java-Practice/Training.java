public class Training
{
    String title;
    String instructor;
    int capacity, enrolledStudentCount;
    public Training(String title, String instructor, int capacity)
    {
        this.title = title;
        this.instructor = instructor;
        this.capacity = capacity;
        this.enrolledStudentCount = 0;
    }
    public void registerStudent(int studentCount)
    {
        enrolledStudentCount +=studentCount;
        if(enrolledStudentCount > capacity)
        enrolledStudentCount = capacity;
    }
    public void updateInstructor(String newInstructor)
    {
        this.instructor = newInstructor;
    }
    public int getStudentCount()
    {
        return enrolledStudentCount;
    }
    public void display()
    {
        System.out.println("Title : " +title);
        System.out.println("Instructor : " +instructor);
        System.out.println("Capacity : " +capacity);
        System.out.println("Enrolled Students : " +enrolledStudentCount);
    }
}