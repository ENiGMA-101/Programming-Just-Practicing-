import java.util.ArrayList;
import java.util.List;

public class MeetingRoomManagementSystem 
{
    public List<MeetingRoom> rooms;

    public MeetingRoomManagementSystem() 
    {
        rooms = new ArrayList<>();
    }

    public void addRoom(MeetingRoom room) 
    {
        rooms.add(room);
    }

    public boolean bookRoom(Reservation reservation) 
    {
        MeetingRoom room = getRoomByNumber(reservation.getRoomNumber());
        if (room != null && room.isAvailable()) 
        {
            room.setAvailable(false);
            room.setReservedBy(reservation.getContactPerson());
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public void cancelReservation(int roomNumber) 
    {
        MeetingRoom room = getRoomByNumber(roomNumber);
        if (room != null && !room.isAvailable()) 
        {
            room.setAvailable(true);
            room.setReservedBy(null);
        }
    }

    public void viewRooms() 
    {
        for (MeetingRoom room : rooms) 
        {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Capacity: " + room.getCapacity() + ", Availability: " + (room.isAvailable() ? "Available" : "Reserved by " + room.getReservedBy()));
        }
    }

    public void viewAvailableRooms() 
    {
        for (MeetingRoom room : rooms) 
        {
            if (room.isAvailable()) 
            {
                System.out.println("Room Number: " + room.getRoomNumber() + ", Capacity: " + room.getCapacity());
            }
        }
    }

    public MeetingRoom getRoomByNumber(int roomNumber) 
    {
        for (MeetingRoom room : rooms) 
        {
            if (room.getRoomNumber() == roomNumber) 
            {
                return room;
            }
        }
        return null;
    }
}