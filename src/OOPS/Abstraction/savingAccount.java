package OOPS.Abstraction;

public class savingAccount extends BankAccount{

    @Override
    public void deposit(double amount){
        System.out.println("Deposited");
    }
    @Override
    public void withdraw(double amount){
        System.out.println("withdrawing");
    }
}
