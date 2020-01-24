public class BankAccount {
	private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

public BankAccount(){
}
//constructor
public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
this. number = number;
this.balance = balance;
this.customerName = customerName;
this.email = email;
this.phoneNumber = phoneNumber;
    }

public void deposit(double depositAmount){
    this.balance += depositAmount;
}
public void withdrawal(double withdrawalAmount){
    if(balance - withdrawalAmount < 0){
        System.out.println("Only " + this.balance +" available. Not processed" );
    }else{
        this.balance -=withdrawalAmount;
        System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
    }
}

public void setNumber(){
this.number = number;
}
public String getAccountNumber(){
    return this.number;
}
public void setBalance(){
    this.balance = balance;
}
public double getBalance(){
    return this.balance;
}
public void setCustomerName(){
    this.customerName = customerName;
}
public String getCustomerName(){
    return this.customerName;
}
public void setEmail(){
  this.email = email;  
}
public String getEmail(){
    return this.email;
}
public void setPhoneNumber(){
    this.phoneNumber = phoneNumber;
}
public String getPhoneNumber() {
    return this.phoneNumber;
}
//second constructor
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",200.55,customerName,email,phoneNumber);
    }

}