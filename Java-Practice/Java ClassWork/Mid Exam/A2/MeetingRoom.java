public class MeetingRoom 
{
    public int roomNumber;
    public int capacity;
    public boolean isAvailable;
    public String reservedBy;

    public MeetingRoom(int roomNumber, int capacity) 
    {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.isAvailable = true;
        this.reservedBy = null;
    }

    public int getRoomNumber() 
    {
        return roomNumber;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public boolean isAvailable() 
    {
        return isAvailable;
    }

    public String getReservedBy() 
    {
        return reservedBy;
    }

    public void setAvailable(boolean isAvailable) 
    {
        this.isAvailable = isAvailable;
    }

    public void setReservedBy(String reservedBy) 
    {
        this.reservedBy = reservedBy;
    }
}