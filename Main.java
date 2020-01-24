public class Main {
    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount("1233", 0.00, "Bobo Brown", "bob@gmail.com", "4556545679");
        // new client with second constructor
        BankAccount timsAccount = new BankAccount("Tim", "tim@gmai.com", "3456754356");
        System.out.println(timsAccount.getCustomerName() + " name" + timsAccount.getAccountNumber() + " Number account");
        System.out.println("current balance: " + timsAccount.getBalance());
        timsAccount.withdrawal(10);

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with
        // default values
        // 2nd constructor should pass on the 2 values it receives and add a default
        // value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generat

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("ted", 25000.0);
        System.out.println(person2.getName());
        VipCustomer person3 = new VipCustomer("tim", 123.34, "tim@gmail.com");
        System.out.println(person3.getEmail());
    }
}
