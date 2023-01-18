import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer amitay = new Customer("Amitay", "Gabay", "amitaygabay1@gmail.com", "avne-hefetz",
                CustomerType.REGULAR);
        System.out.println(amitay.getId() + " " + amitay.getFirstName() + " " + amitay.getLastName() + " " +
                amitay.getEmail() + " " + amitay.getDeliveryAddress() + " " + amitay.getCustomerType() + " " +
                amitay.getCustomerDiscount());
        Customer miki = new Customer("Miki", "Gabay", "michaelgabay770@gmail.com", "netanya",
                CustomerType.VIP);
        System.out.println(miki.getId() + " " + miki.getFirstName() + " " + miki.getLastName() + " " +
                miki.getEmail() + " " + miki.getDeliveryAddress() + " " + miki.getCustomerType() + " " +
                miki.getCustomerDiscount());

        RegularTicket regularTicket = new RegularTicket("mesiba", LocalDateTime.now(), 8, 16,
                amitay, 80);
        VipTicket vipTicket = new VipTicket("mesiba", LocalDateTime.now(), 10, 20,
                miki, 100);

        ArrayList<Ticket> ticketsList = new ArrayList<>();
        ticketsList.add(regularTicket);
        ticketsList.add(vipTicket);
        System.out.println(ticketsList);
        Show show = new Show("mesiba", LocalDateTime.now(), ticketsList);
        System.out.println(show.getId() + " " + show.getShowName() + " " + show.getShowDate() + " " +
                show.getTicketsList() );
        System.out.println(show.calculateShowRevenue());
        show.removeTicketFromList(regularTicket);
        System.out.println(show.getTicketsList());
        amitay.eat();
        ShufersalVoucher shufersalVoucher = new ShufersalVoucher();
        miki.takeFoodVoucher(shufersalVoucher);
        miki.eat();
    }
}