import java.time.LocalDateTime;

abstract class Ticket {
    private static int originalId = 1;
    private int id;
    private String showName;
    private LocalDateTime showDate;
    private int rowNumber;
    private int siteNumber;
    private Customer ticketCustomer;

    public Ticket(String showName, LocalDateTime showDate, int rowNumber, int siteNumber, Customer ticketCustomer) {
        this.id = originalId++;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.siteNumber = siteNumber;
        this.ticketCustomer = ticketCustomer;
    }

    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDateTime getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDateTime showDate) {
        this.showDate = showDate;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public Customer getTicketCustomer() {
        return ticketCustomer;
    }

    public void setTicketCustomer(Customer ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }

    public double getPrice(){
        return 0;
    };
}
