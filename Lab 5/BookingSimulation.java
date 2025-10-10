import java.util.Random;

class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int totalTickets) {
        this.availableTickets = totalTickets;
    }

    // UNSYNCHRONIZED VERSION
    public void bookTickets(int numTickets, String userName) {
        if (availableTickets >= numTickets) {
            System.out.println(userName + " successfully booked " + numTickets + " ticket(s).");
            availableTickets -= numTickets;
        } else {
            System.out.println(userName + " failed to book " + numTickets + " ticket(s). Not enough tickets.");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

class User implements Runnable {
    private TicketBookingSystem system;
    private String userName;

    public User(TicketBookingSystem system, String userName) {
        this.system = system;
        this.userName = userName;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int ticketsToBook = rand.nextInt(5) + 1; // 1 to 5 tickets
        system.bookTickets(ticketsToBook, userName);
    }
}

public class BookingSimulation {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem(20);

        for (int i = 1; i <= 10; i++) {
            Thread userThread = new Thread(new User(system, "User" + i));
            userThread.start();
        }
    }
}