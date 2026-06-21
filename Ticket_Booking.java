import java.util.Scanner;

// Base class
abstract class Booking {
    Scanner get = new Scanner(System.in);
    String[][] seats;

    Booking(int rows, int cols) {
        seats = new String[rows][cols];
        initialize();
    }

    void initialize() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = "Available";
            }
        }
    }

    void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void bookSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("Invalid Seat.");
        } else if (seats[row][col].equals("Available")) {
            seats[row][col] = "Booked";
            System.out.println("Ticket Booked Successfully.");
        } else {
            System.out.println("Seat Already Booked.");
        }
    }

    abstract void bookingProcess(); // Each subclass defines its own booking loop
}

// Movie Booking
class MovieBooking extends Booking {
    MovieBooking() {
        super(9, 6); // 9 rows, 6 seats per row
    }

    @Override
    void bookingProcess() {
        while (true) {
            System.out.println("\n------ MOVIE SEATS ------");
            displaySeats();

            System.out.print("Row (1-9): ");
            int row = get.nextInt() - 1;

            System.out.print("Seat (1-6): ");
            int col = get.nextInt() - 1;

            bookSeat(row, col);

            System.out.print("Book Another Movie Ticket? (yes/no): ");
            if (!get.next().equalsIgnoreCase("yes")) break;
        }
    }
}

// Bus Booking
class BusBooking extends Booking {
    BusBooking() {
        super(8, 4); // 8 rows, 4 seats per row
    }

    @Override
    void bookingProcess() {
        while (true) {
            System.out.println("\n------ BUS SEATS ------");
            displaySeats();

            System.out.print("Row (1-8): ");
            int row = get.nextInt() - 1;

            System.out.print("Seat (1-4): ");
            int col = get.nextInt() - 1;

            bookSeat(row, col);

            System.out.print("Book Another Bus Ticket? (yes/no): ");
            if (!get.next().equalsIgnoreCase("yes")) break;
        }
    }
}

// Train Booking
class TrainBooking extends Booking {
    TrainBooking() {
        super(10, 6); // Example: 10 rows, 6 seats per row
    }

    @Override
    void bookingProcess() {
        while (true) {
            System.out.println("\n------ TRAIN SEATS ------");
            displaySeats();

            System.out.print("Row (1-10): ");
            int row = get.nextInt() - 1;

            System.out.print("Seat (1-6): ");
            int col = get.nextInt() - 1;

            bookSeat(row, col);

            System.out.print("Book Another Train Ticket? (yes/no): ");
            if (!get.next().equalsIgnoreCase("yes")) break;
        }
    }
}

// Hotel Room Booking
class HotelBooking extends Booking {
    HotelBooking() {
        super(5, 5); // Example: 5 floors, 5 rooms per floor
    }

    @Override
    void bookingProcess() {
        while (true) {
            System.out.println("\n------ HOTEL ROOMS ------");
            displaySeats();

            System.out.print("Floor (1-5): ");
            int row = get.nextInt() - 1;

            System.out.print("Room (1-5): ");
            int col = get.nextInt() - 1;

            bookSeat(row, col);

            System.out.print("Book Another Hotel Room? (yes/no): ");
            if (!get.next().equalsIgnoreCase("yes")) break;
        }
    }
}

// Main Class
public class Ticket_Booking {
    static Scanner get = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========== TICKET BOOKING ==========");
            System.out.println("1. Movie Ticket Booking");
            System.out.println("2. Bus Ticket Booking");
            System.out.println("3. Train Ticket Booking");
            System.out.println("4. Hotel Room Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = get.nextInt();

            switch (choice) {
                case 1: new MovieBooking().bookingProcess(); break;
                case 2: new BusBooking().bookingProcess(); break;
                case 3: new TrainBooking().bookingProcess(); break;
                case 4: new HotelBooking().bookingProcess(); break;
                case 5: System.out.println("Thank You..."); System.exit(0);
                default: System.out.println("Invalid Choice");
            }
        }
    }
}

