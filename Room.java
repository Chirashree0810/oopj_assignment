package pkg7;

public class Room {
    private int roomNumber;
    private boolean available;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.available = true; // All rooms are available initially
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
