import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        int ticketId;
        int price;
        int availableTicket;
        int noOfBooking;
        int noOfTickets;
        Ticket bl = new Ticket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        noOfBooking = sc.nextInt();
        
        System.out.println("Enter the available tickets:");
        availableTicket = sc.nextInt();
        bl.setAvailableTickets(availableTicket);
       
        for(int i=0; i < noOfBooking ; i++){
        System.out.println("Enter the ticketid:");
        ticketId = sc.nextInt();
        bl.setTicketid(ticketId);
        
        System.out.println("Enter the price:");
        price = sc.nextInt();
        bl.setPrice(price);
        
        System.out.println("Enter the no of tickets:");
        noOfTickets = sc.nextInt();
        System.out.println("\nAvailable Tickets"+ bl.getAvailableTickets());
        int pricge = bl.calculateTicketCost(noOfTickets);
        System.out.println("Total Amount:"+pricge);
        System.out.println("Available tickets after booing:"+bl.getAvailableTickets());
        
        }
        
    }
}
