package OOPS.Abstraction;

public class Abstractiondemo {
    public static void main(String args[]){
    savingAccount savingsAccount = new savingAccount();
    savingsAccount.deposit(200);

    BankAccount sa1=new savingAccount();
    sa1=new currentAccount();
    sa1.withdraw(500);
    }
}
