package task;

public class AvailTicket {
    public static void main(String[] args) {
        // Creating a Ticket object
        Ticket ticket = new Ticket();
        ticket.setTicketid(1);
        ticket.setPrice(500);
        Ticket.setAvailableTickets(10); // Setting available tickets

        System.out.println("Ticket ID: " + ticket.getTicketid());
        System.out.println("Ticket Price: $" + ticket.getPrice());
        System.out.println("Available Tickets: " + Ticket.getAvailableTickets());

        // Attempt to purchase 5 tickets
        int cost = ticket.calculateTicketCost(5);
        if (cost != -1) {
            System.out.println("Total cost for 5 tickets: $" + cost);
            System.out.println("Remaining Tickets: " + Ticket.getAvailableTickets());
        } else {
            System.out.println("Not enough tickets available.");
        }

        // Attempt to purchase 6 tickets
        cost = ticket.calculateTicketCost(6);
        if (cost != -1) {
            System.out.println("Total cost for 6 tickets: $" + cost);
            System.out.println("Remaining Tickets: " + Ticket.getAvailableTickets());
        } else {
            System.out.println("Not enough tickets available.");
        }
    }
}
