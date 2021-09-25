public class CheckingAccount extends BankAccount{

    public CheckingAccount() {
        setAccountType(2);
    }

    public CheckingAccount(String name, double balance, String accountNumber, String address, String phoneNumber) {
        super(name, balance, accountNumber, address, phoneNumber);
        setAccountType(2);
    }

    public boolean makeWithdrawal(double Amount) {
      if(Amount <= getBalance() + 5000 && Amount > 0){
          setBalance(getBalance() - Amount );
          return true;
      }
      else
          return false;
    }

}
