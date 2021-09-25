import java.util.Date;

public class BankAccount {

    private String name;
    private double balance;
    private String accountNumber;
    private String address;
    private String phoneNumber;
    private Date dateCreated;
    private int accountType; // 1 for savings , 2 for checking


    public void checkBalance(){
        System.out.println("Your Balance is : " + balance);
    }

    public boolean makeDeposit(double Amount){

        if(Amount > 0) {
            balance = balance + Amount;
            return true;
        }
        else
            return false;

    }

    public boolean makeWithdrawal(double Amount){
        if(Amount > 0) {
            balance = balance - Amount;
            return true;
        }
        else
            return false;

    }


    public BankAccount() {
        name = "";
        accountNumber = "";
        address = "";
        phoneNumber = "";
        balance = 0.00;
        dateCreated = new Date();

    }

    public BankAccount(String name, double balance, String accountNumber, String address, String phoneNumber ) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
