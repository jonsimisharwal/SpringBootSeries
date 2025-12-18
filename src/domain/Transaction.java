package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String accountNumber;
    private type typee;
    private Double amount;
    private LocalDateTime timestamp;
    private String note;

    public String getAccountNumber() {
        return accountNumber;
    }

    public Transaction(String id, Double amount, String accountNumber,LocalDateTime timestamp, String note,type typee) {
        this.accountNumber = accountNumber;
        this.id=id;
        this.amount=amount;
        this.note=note;
        this.timestamp=timestamp;
        this.typee=typee;
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Object gettype() {

        return typee;
    }

    public Object getamount() {
        return amount;
    }

    public Object getnote() {
        return note;
    }
}
