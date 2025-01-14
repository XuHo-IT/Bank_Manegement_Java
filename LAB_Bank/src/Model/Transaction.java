package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transaction {
    protected String transactionID;
    protected String cardID;
    protected Date transactionDate;
    protected double money;
    protected String note;

    public Transaction(String transactionID, String cardID, Date transactionDate, double money, String note) {
        this.transactionID = transactionID;
        this.cardID = cardID;
        this.transactionDate = transactionDate;
        this.money = money;
        this.note = note;
    }

    public Transaction() {

    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Transaction: " +
                "transactionID= " + transactionID +
                ", cardID= " + cardID  +
                ", transactionDate= " + transactionDate +
                ", money= " + money +
                ", note= " + note ;
    }
    public Transaction creatNewTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TransactionID");
        this.transactionID = sc.nextLine();
        System.out.println("Enter CardID");
        this.cardID = sc.nextLine();
        System.out.println("Enter TransactionDate");
        String dateString = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(dateString);
            this.transactionDate = date;
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
        }
        System.out.println("Enter money");
        this.money = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter note");
        this.note = sc.nextLine();
        return this;
    }



}
