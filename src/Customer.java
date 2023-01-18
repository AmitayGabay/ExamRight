public class Customer{
    private static int originalId = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private int customerDiscount; // in precentages

    private EatAble foodVoucher;

    public Customer(String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType) {
        this.id = originalId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = (int)(Math.random()*50);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public int getCustomerDiscount() {
        return customerDiscount;
    }

    public void takeFoodVoucher(EatAble foodStoreVoucher){
        this.foodVoucher = foodStoreVoucher;
    }

    public void eat() {
        if(this.foodVoucher != null){
            this.foodVoucher.eat();
            this.foodVoucher = null;
        } else {
            System.out.println("You have no food voucher left to redeem!");
        }
    }
}



