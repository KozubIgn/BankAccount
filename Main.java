public class Main{
    public static void main(String [] args) {
    
        BankAccount bobsAccount = new BankAccount("1233",0.00,"Bobo Brown","bob@gmail.com","4556545679");
        bobsAccount.setNumber("123456");
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(50.0);
    }
}