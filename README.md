# oopj_assignment
1. Payment Class
Purpose: Represents a payment made by a customer.
Attributes:
amount: The payment amount.
paymentDate: The date of the payment.
Methods:
Payment(double amount, String paymentDate): Constructor to initialize the payment amount and date.
displayPaymentDetails(): Displays payment details to the console.
2. Room Class
Purpose: Represents a room in the hotel.
Attributes:
roomNumber: The unique identifier for the room.
available: Indicates whether the room is available or booked.
Methods:
Room(int roomNumber): Constructor to initialize the room with a number and mark it as available.
getRoomNumber(): Returns the room's number.
isAvailable(): Returns the availability status of the room.
setAvailable(boolean available): Updates the room's availability status.
3. InputHandler Class
Purpose: Handles reading input data from a file.
Methods:
readData(String filePath): Reads lines from the specified file and returns them as an array of strings.
4. HotelManagementSystem Class
Purpose: Main class that orchestrates the hotel management operations.
Functionality:
Reads booking data from a file.
Initializes the hotel and its rooms.
Processes each booking entry to create Customer, Room, Booking, and Payment objects.
Displays booking and payment details on the console.
5. Hotel Class
Purpose: Represents the hotel and manages its rooms.
Attributes:
name: Name of the hotel.
location: Location of the hotel.
rooms: A list of Room objects representing the hotel’s rooms.
Methods:
Hotel(String name, String location, int numRooms): Constructor to initialize the hotel with a name, location, and a given number of rooms.
getRoomByNumber(int roomNumber): Returns the Room object corresponding to the given room number.
6. Customer Class
Purpose: Represents a customer making a booking.
Attributes:
name: Name of the customer.
contact: Contact information of the customer.
Methods:
Customer(String name, String contact): Constructor to initialize the customer’s name and contact details.
getName(): Returns the customer’s name.
getContact(): Returns the customer’s contact details.
7. Booking Class
Purpose: Represents a booking made by a customer for a specific room.
Attributes:
customer: A Customer object for the booking.
room: The Room object being booked.
bookingDate: The date of the booking.
checkoutDate: The date of checkout.
Methods:
Booking(Customer customer, Room room, String bookingDate, String checkoutDate): Constructor to create a booking and mark the room as unavailable.
displayBookingDetails(): Displays booking details to the console.
How It Works Together
Input Handling:

The InputHandler reads customer booking data from the file.
Each line contains details about a customer, room, booking, and payment.
Hotel Initialization:

A Hotel object is created with a name, location, and predefined number of rooms.
Processing Each Booking:

For each booking entry:
Customer details are parsed, and a Customer object is created.
The room is fetched using the room number, and its availability is checked.
If available, a Booking object is created, marking the room as unavailable.
A Payment object is created for the booking.
Booking and payment details are displayed on the console.
Output:

Results (booking and payment details or errors) are directly displayed on the console.
This modular design ensures each class has a single responsibility and can be extended or modified independently. Let me know if you’d like further details on any specific part!
