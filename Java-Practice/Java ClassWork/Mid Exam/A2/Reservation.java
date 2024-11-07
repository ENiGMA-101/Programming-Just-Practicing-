public class Reservation 
{
    public String contactPerson;
    public int roomNumber;

    public Reservation(String contactPerson, int roomNumber) 
    {
        this.contactPerson = contactPerson;
        this.roomNumber = roomNumber;
    }

    public String getContactPerson() 
    {
        return contactPerson;
    }

    public int getRoomNumber() 
    {
        return roomNumber;
    }
}