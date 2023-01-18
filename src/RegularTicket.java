import java.time.LocalDateTime;

public class RegularTicket extends Ticket implements PriceAble{
    private double ticketPrice;

    public RegularTicket(String showName, LocalDateTime showDate, int rowNumber, int siteNumber, Customer ticketCustomer, double ticketPrice) {
        super(showName, showDate, rowNumber, siteNumber, ticketCustomer);
        this.ticketPrice = calculateTicketPrice(ticketPrice);
    }

    @Override
    public double calculateTicketPrice(double ticketPrice) {
        return ticketPrice;
    }

    @Override
    public double getPrice(){
        return this.ticketPrice;
    }
}
