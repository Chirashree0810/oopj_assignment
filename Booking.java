package pkg7;
public class Booking {
    private Customer customer;
    private Room room;
    private String bookingDate;
    private String checkoutDate;

    public Booking(Customer customer, Room room, String bookingDate, String checkoutDate) {
        this.customer = customer;
        this.room = room;
        this.bookingDate = bookingDate;
        this.checkoutDate = checkoutDate;
        room.setAvailable(false); // Mark room as booked
    }

    public void displayBookingDetails() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Contact: " + customer.getContact());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Booking Date: " + bookingDate);
        System.out.println("Checkout Date: " + checkoutDate);
    }
}