package OOPS.Abstraction;

public class currentAccount extends BankAccount{
    @Override
    public void deposit(double amount){
        System.out.println("Deposited current");
    }
    @Override
    public void withdraw(double amount){
        System.out.println("withdraw current");
    }
}
