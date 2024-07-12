package task;
//Ticket.java
public class Ticket {
 private int ticketid;
 private int price;
 private static int availableTickets;

 // Getters and Setters
 public int getTicketid() {
     return ticketid;
 }

 public void setTicketid(int ticketid) {
     this.ticketid = ticketid;
 }

 public int getPrice() {
     return price;
 }

 public void setPrice(int price) {
     this.price = price;
 }

 public static int getAvailableTickets() {
     return availableTickets;
 }

 public static void setAvailableTickets(int availableTickets) {
     if (availableTickets > 0) {
         Ticket.availableTickets = availableTickets;
     } else {
         System.out.println("Available tickets must be a positive value.");
     }
 }

 // Method to calculate ticket cost
 public int calculateTicketCost(int noOfTickets) {
     if (noOfTickets > availableTickets) {
         return -1; // Not enough tickets available
     } else {
         availableTickets -= noOfTickets;
         return noOfTickets * price;
     }
 }
}