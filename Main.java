public class Main{
    public static void main(String [] args) {
    
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setNumber("123456");
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(50.0);
    }
}