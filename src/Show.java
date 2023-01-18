import java.time.LocalDateTime;
import java.util.ArrayList;

public class Show {
    private static int originalId = 1;
    private int id;
    private String showName;
    private LocalDateTime showDate;
    private ArrayList<Ticket> ticketsList = new ArrayList<>();

    public Show(String showName, LocalDateTime showDate, ArrayList<Ticket> ticketsList) {
        this.id = originalId++;
        this.showName = showName;
        this.showDate = showDate;
        setTicketsList(ticketsList);
    }

    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
        for (Ticket ticket: this.ticketsList) {
          ticket.setShowName(showName);
        }
    }

    public LocalDateTime getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDateTime showDate) {
        this.showDate = showDate;
        for (Ticket ticket: this.ticketsList) {
            ticket.setShowDate(showDate);
        }
    }

    public ArrayList<Ticket> getTicketsList() {
        return this.ticketsList;
    }

    public void setTicketsList(ArrayList<Ticket> ticketsList) {
        for (Ticket ticket: ticketsList) {
            addTicketToList(ticket);
        }
    }

    public void addTicketToList(Ticket ticket) {
        if(!this.ticketsList.contains(ticket)){
            this.ticketsList.add(ticket);
        }
    }

    public void removeTicketFromList(Ticket ticket) {
        this.ticketsList.remove(ticket);
    }

    public double calculateShowRevenue(){
        double sum = 0;
        for (Ticket ticket: this.ticketsList) {
            sum += ticket.getPrice();
        }
        return sum;
    }
}
