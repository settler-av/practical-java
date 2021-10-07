//For dateCreated. this class extends date

import java.text.SimpleDateFormat;

/**
 * Account class
 * Author : 20CE155 @ADNAN_VAHORA
 * Date : 8/19/2021
 */

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    String pattern = "dd-mm-yyyy";
    SimpleDateFormat dateCreated = new SimpleDateFormat(pattern);

    //for default Account
    Account() {
        id = 0;
        balance = 500;
        annualInterestRate = 7.0;
    }

    //Account with specified I'd and balance;
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //Accessor and mutator methods for id, balance, annualInterestRate
    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    double getAnnualInterestRate() {
        
        return annualInterestRate;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    void setAnnualInterestRate(double interestRate) {
        annualInterestRate = interestRate;
    }

    //Accessor method for dateCreated
    SimpleDateFormat getDate() {
        return dateCreated;
    }

    //method to get MonthlyInterest()
    double getMonthlyInterest(){
        return getAnnualInterestRate()*balance*.01;
    }
    //method to get MonthlyInterestRate()
    double getMonthlyInt() {
        return annualInterestRate / 12.0;
    }

    //    A method named deposit that deposits a specified amount to the account
    void deposits(int credits) {
        balance += credits;
    }

    //A method named withdraw that withdraws a specified amount from the account
    void withdraw(int deduct) {
        balance -= deduct;
    }

    //print Account Info - used in ATM class
    void printAccountInfo(){
        System.out.println("Account id : "+ id);
        System.out.println("Account balance : "+ balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", pattern='" + pattern + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}