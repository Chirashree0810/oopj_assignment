package pkg7;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;

    public Hotel(String name, String location, int numRooms) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
        
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(100 + i)); // Room numbers start from 101
        }
    }

    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
