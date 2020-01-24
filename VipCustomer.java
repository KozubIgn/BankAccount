public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // first constructor with define parameters
    public VipCustomer() {
        this("unknown", 1000.00, "unknown@gmail.com");
    }

    // second constructor with 2 undefined param
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    // third constructor with undefined param
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}