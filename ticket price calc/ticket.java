public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public int getTicketid(){
        return ticketid;
    }
    public void setTicketid(int ticketid){
        this.ticketid = ticketid;
    }
    
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public static void setAvailableTickets(int availableTick){
        if((availableTick>0||availableTick==0)){
         availableTickets = availableTick;    
        }else if(availableTickets<0){
            System.out.println("tickets not available");
        }
        
    }
    
    public int calculateTicketCost(int nooftickets) {
       
                
        int availT = (getAvailableTickets() - nooftickets);
        if(availT < 0 ){
            return -1;
        }else{
         setAvailableTickets(availT);
         int pricee;
                pricee= nooftickets * getPrice();
              return pricee;
              
        }
              
    }
    
}
