import java.time.LocalDateTime;

public class VipTicket extends Ticket implements PriceAble {
    private double ticketPrice;

    public VipTicket(String showName, LocalDateTime showDate, int rowNumber, int siteNumber, Customer ticketCustomer, double ticketPrice) throws Exception {
        super(showName, showDate, rowNumber, siteNumber, ticketCustomer);
        this.ticketPrice = calculateTicketPrice(ticketPrice);
    }

    @Override
    public double calculateTicketPrice(double ticketPrice) throws Exception {
        if (getTicketCustomer().getCustomerType() == CustomerType.VIP) {
            return ticketPrice - (ticketPrice * getTicketCustomer().getCustomerDiscount() / 100);
        } else {
            throw new Exception("The ticket order failed, this is not a VIP customer!");
        }
    }

    @Override
    public double getPrice() {
        return this.ticketPrice;
    }
}
