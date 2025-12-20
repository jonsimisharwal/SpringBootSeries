package OOPS.Abstraction;
//using abstract - no object creation
abstract public class BankAccount  {
    private String Accountnumber;
    private double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
