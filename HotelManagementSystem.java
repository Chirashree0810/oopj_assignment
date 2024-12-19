package pkg7;
import java.io.IOException;

public class HotelManagementSystem {

    public static void main(String[] args) {
        try {
            // Read input data
            String[] inputData = InputHandler.readData("C:/Users/HP/Documents/NetBeansProjects/OOPJ/input1.txt");

            // Hotel initialization
            Hotel hotel = new Hotel("Grand Plaza", "New York", 5);

            // Process bookings and payments
            for (String data : inputData) {
                try {
                    String[] fields = data.split(",");
                    String customerName = fields[0].trim();
                    String contact = fields[1].trim();
                    int roomNumber = Integer.parseInt(fields[2].trim());
                    String bookingDate = fields[3].trim();
                    String checkoutDate = fields[4].trim();
                    double paymentAmount = Double.parseDouble(fields[5].trim());

                    Customer customer = new Customer(customerName, contact);
                    Room room = hotel.getRoomByNumber(roomNumber);

                    if (room == null || !room.isAvailable()) {
                        System.out.println("Room " + roomNumber + " is unavailable.");
                        continue;
                    }

                    Booking booking = new Booking(customer, room, bookingDate, checkoutDate);
                    Payment payment = new Payment(paymentAmount, bookingDate);

                    System.out.println("\nBooking Details:");
                    System.out.println("Customer Name: " + customerName);
                    System.out.println("Room Number: " + roomNumber);
                    System.out.println("Booking Date: " + bookingDate);
                    System.out.println("Checkout Date: " + checkoutDate);
                    System.out.println("\nPayment Details:");
                    System.out.println("Payment Amount: Rs." + paymentAmount);
                    System.out.println("Payment Date: " + bookingDate);

                } catch (Exception e) {
                    System.out.println("Error processing line: " + data);
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

                