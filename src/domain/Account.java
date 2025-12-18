package domain;

public class Account {
    private String accountNumber;
    private String customerId;
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    private String accountType;


    public String getAccountType() {
        return accountType.toString();
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, String customerId, Double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.customerId=customerId;
        this.balance=balance;
        this.accountType=accountType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String args[]){

    }

}
