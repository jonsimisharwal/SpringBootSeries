package Service.impl;

import Repo.AccountRepository;
import Repo.CustomerRepository;
import Repo.TransactionRepository;
import Service.BankService;
import domain.Account;
import domain.Customer;
import domain.Transaction;
import domain.type;
import Exception.AccountNotFoundException;
import Exception.InsufficientFundsException;
import Exception.ValidationException;
import util.Validation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {

private final AccountRepository AccountRepository=new AccountRepository();
private final TransactionRepository transactionRepository=new TransactionRepository();
private final CustomerRepository customerRepository=new CustomerRepository();
private final Validation<String> validateName= name ->{
    if(name==null || name.isBlank()) throw new ValidationException("name is required");
};
    private final Validation<String> validateEmail= email ->{
        if(email==null || !email.contains("@")) throw new ValidationException("email is required");
    };
    private final Validation<String> validateType= type ->{
        if(type==null || !(type.equalsIgnoreCase("SAVINGS")|| type.equalsIgnoreCase("CURRENT"))) throw new ValidationException("type must be Savings or Current");
    };
    public String openAccount(String name, String email, String accountType) {
        validateName.validate(name);
        validateEmail.validate(email);
        validateType.validate(accountType);
        String customerId= UUID.randomUUID().toString();
        //create customer
        Customer c=new Customer(email,customerId,name);
        customerRepository.save(c);
        //CHANGE LATER ---->10 +1 =AC000011
     //   String accountNumber=UUID.randomUUID().toString();
        String accountNumber = getAccountNumber();
        Account account=new Account(accountNumber,accountType,0.0,customerId);
        //save
        AccountRepository.save(account);
        return accountNumber;
    }

    @Override
    public List<Account> listAccounts() {
        return AccountRepository.findAll().stream()
                .sorted(Comparator.comparing(Account::getAccountNumber))
                .collect(Collectors.toList());
    }

    @Override
    public void deposit(String accountNumber, Double amount, String note) {
        Account account = AccountRepository.findByNumber(accountNumber)
                .orElseThrow(()-> new AccountNotFoundException("Account not found:" + accountNumber));
        account.setBalance(account.getBalance()+amount);
        Transaction transaction =new Transaction(account.getAccountNumber(),amount,UUID.randomUUID().toString(), LocalDateTime.now(),note, type.DEPOSIT);
        transactionRepository.add(transaction);

    }

    @Override
    public void withdraw(String accountNumber, Double amount, String note) {
        Account account = AccountRepository.findByNumber(accountNumber)
                .orElseThrow(()-> new AccountNotFoundException("Account not found:" + accountNumber));
        if(account.getBalance().compareTo(amount) <0){
            throw new InsufficientFundsException("Insufficient Balance");
        }
        account.setBalance(account.getBalance()-amount);
        Transaction transaction =new Transaction(account.getAccountNumber(),amount,UUID.randomUUID().toString(), LocalDateTime.now(),note, type.WITHDRAW);
        transactionRepository.add(transaction);
    }

    @Override
    public void transfer(String fromacc, String toacc, Double amount, String note) {
        if(fromacc.equals(toacc)){
            throw new ValidationException("Cannot transfer to your own account");
        }
        Account from = AccountRepository.findByNumber(fromacc)
                .orElseThrow(()-> new AccountNotFoundException("Account not found:" + fromacc));
        Account to = AccountRepository.findByNumber(toacc)
                .orElseThrow(()-> new AccountNotFoundException("Account not found:" + toacc));
        if(from.getBalance().compareTo(amount) <0){
            throw new InsufficientFundsException("Insufficient Balance");
        }
        from.setBalance(from.getBalance()-amount);
        to.setBalance(to.getBalance()+amount);
        Transaction fromtransaction =new Transaction(from.getAccountNumber(),amount,UUID.randomUUID().toString(), LocalDateTime.now(),note, type.TRANSFER_OUT);
        transactionRepository.add(fromtransaction);
        Transaction totransaction =new Transaction(to.getAccountNumber(),amount,UUID.randomUUID().toString(), LocalDateTime.now(),note, type.TRANSFER_IN);
        transactionRepository.add(totransaction);
    }

    @Override
    public List<Transaction> getStatement(String account) {
        return transactionRepository.findByAccount(account).stream().sorted(Comparator.comparing(Transaction::getTimestamp)).collect(Collectors.toList());
    }

    @Override
    public List<Account> searchAccountsbyCustomerName(String q) {
        String query=(q==null)? "": q.toLowerCase();
    /*    List<Account> result=new ArrayList<>();
        for(Customer c:customerRepository.findAll()){
            if(c.getName().toLowerCase().contains(query)){
                result.addAll(AccountRepository.findByCustomerId(c.getId()));
            }

        }
        result.sort(Comparator.comparing(Account::getAccountNumber)); */
        return customerRepository.findAll().stream()
                .filter(c->c.getName().toLowerCase().contains(query))
                .flatMap(c-> AccountRepository.findByCustomerId(c.getId()).stream())
                .sorted(Comparator.comparing(Account::getAccountNumber))
                .collect(Collectors.toList());
      //  return result;
    }

    private String getAccountNumber() {
        int size=AccountRepository.findAll().size()+1;
        String accountnumber =String.format("AC%06d",size);
        return accountnumber;
    }
}
