import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

public class AlliedBank {
   private List<BankAccount> accounts;
   private double interestRate;

    public AlliedBank() {
        accounts = new ArrayList<>();
        interestRate = 10.00;
    }

    public boolean accountExists(String accountNo){
        for(int i = 0 ; i < accounts.size() ; i++){
            if(Integer.parseInt(accounts.get(i).getAccountNumber()) == Integer.parseInt(accountNo) ) {
                return true;
            }
        }
        return false;
    }

    public String createSavingsAccount(String name, double balance , String address, String phoneNumber){
        BankAccount newAccount = new SavingsAccount(name, balance, String.valueOf(accounts.size() + 1 ) , address, phoneNumber, interestRate);
        accounts.add(newAccount);
        return String.valueOf(accounts.size()  );
    }

    public String createCheckingAccount(String name, double balance , String address, String phoneNumber){
        BankAccount newAccount = new CheckingAccount(name, balance, String.valueOf(accounts.size() + 1 ) , address, phoneNumber);
        accounts.add(newAccount);
        return String.valueOf(accounts.size()  );
    }

    public boolean transferAmount(String senderNo , String recNO , double amount ){

        for(int i = 0 ; i < accounts.size() ; i++){
            if(Integer.parseInt(accounts.get(i).getAccountNumber()) == Integer.parseInt(senderNo)){
                for(int j = 0 ; j < accounts.size() ; j++){
                    if(Integer.parseInt(accounts.get(j).getAccountNumber()) == Integer.parseInt(recNO)){
                        accounts.get(i).makeWithdrawal(amount);
                        accounts.get(j).makeDeposit((amount));
                        return  true;
                    }
                }
            }

        }
         return false;
    }

    public AlliedBank(double interestRate) {
        accounts = new ArrayList<>();
        this.interestRate = interestRate;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
