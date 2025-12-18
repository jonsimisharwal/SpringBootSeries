package App;
import Service.BankService;
import Service.impl.BankServiceImpl;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    public static void main(String args[]) {
        BankService bankservice=new BankServiceImpl();
        boolean running =true;
        while(running) {
            System.out.println("welcome to console bank");
            System.out.println("""
                    1)Open Account
                    2) Deposit
                    3) WithDraw
                    4) Transfer
                    5) Account Statement
                    6) List Accounts
                    7) Search Accounts by Customer Name
                    0) Exit
                    """);
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose:");
            String choice = sc.nextLine().trim();
            System.out.println("choice:" + choice);

            switch (choice) {
                case "0" -> running=false;

                case "1" -> openAccount(sc,bankservice);

                case "2" -> deposit(sc,bankservice);

                case "3" -> withdraw(sc,bankservice);
                case "4" -> transfer(sc,bankservice);
                case "5" -> statement(sc,bankservice);
                case "6" -> listAccounts(sc,bankservice);
                case "7" -> searchAccounts(sc,bankservice);

            }
        }

    }

    private static void openAccount(Scanner sc, BankService bankservice) {
        System.out.println("customer name: " );
        String name=sc.nextLine().trim();
        System.out.println("customer email: " );
        String email=sc.nextLine().trim();
        System.out.println("Account Type (SAVINGS/CURRENT): " );
        String type=sc.nextLine().trim();
        System.out.println("Initial deposit (optional ,blank for 0):" );
        String amountStr=sc.nextLine().trim();
        if(amountStr.isBlank()) amountStr="0";
        Double initial =Double.valueOf(amountStr);
        String accountNumber=bankservice.openAccount(name,email,type);
        if(initial>0){
            bankservice.deposit(accountNumber,initial,"initial deposit");
        }
        System.out.println("Account opened:" + accountNumber);
    }

    private static void deposit(Scanner sc,BankService bankservice) {
       System.out.println("Account number:");
       String accountNumber= sc.nextLine().trim();
        System.out.println("Amount:");
        Double amount = Double.valueOf(sc.nextLine().trim());
        bankservice.deposit(accountNumber,amount,"Deposit");
        System.out.println("Deposited:");

    }

    private static void withdraw(Scanner sc,BankService bankservice) {
        System.out.println("Account number: ");
        String accountNumber = sc.nextLine().trim();
        System.out.println("Amount:");
        Double amount= Double.valueOf(sc.nextLine().trim());
        bankservice.withdraw(accountNumber,amount,"withdraw");
        System.out.println("Withdrawn");

    }

    private static void transfer(Scanner sc,BankService bankservice) {
        System.out.println("from Account : ");
        String from = sc.nextLine().trim();
        System.out.println("to Amount:");
        String to= sc.nextLine().trim();
        System.out.println("Amount:");
        Double amount= Double.valueOf(sc.nextLine().trim());
        bankservice.transfer(from,to,amount,"Transfer");

    }

    private static void statement(Scanner sc,BankService bankservice) {
        System.out.println("Account number: ");
        String accountNumber = sc.nextLine().trim();
        bankservice.getStatement(accountNumber).forEach(t -> {
            System.out.println(t.getTimestamp() +"|" + t.gettype()+"|"+t.getamount()+"|"+ t.getnote());
        });
    }

    private static void listAccounts(Scanner sc,BankService bankservice) {
      bankservice.listAccounts().forEach(a->{
          System.out.println(a.getAccountNumber() +"|" + a.getAccountType() +"|" + a.getBalance());
      });
    }


    private static void searchAccounts(Scanner sc,BankService bankservice) {
        System.out.println("Customer name contains:");
        String q=sc.nextLine().trim();
        bankservice.searchAccountsbyCustomerName(q)
                .forEach(account-> System.out.println(account.getAccountNumber() +"|" + account.getAccountType()+"|"+ account.getBalance()));
    }
}
