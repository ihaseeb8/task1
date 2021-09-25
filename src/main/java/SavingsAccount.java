public class SavingsAccount extends BankAccount{

    private double interestRate;


    public double calculateZakat(){
        if(getBalance() >= 20000){
            double zakat = (getBalance() * 2.5) / 100 ;
            return zakat;
        }
        else
            return 0.00;
    }

    public double calculateInterest(){
        return getBalance() * interestRate;
    }

    public boolean makeWithdrawal(double Amount){
        if(Amount <= getBalance() && Amount > 0) {
            setBalance(getBalance() - Amount);
            return true;
        }
        else
            return false;

    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String name, double balance, String accountNumber, String address, String phoneNumber, double interestRate) {
        super(name, balance, accountNumber, address, phoneNumber);
        setAccountType(1);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
