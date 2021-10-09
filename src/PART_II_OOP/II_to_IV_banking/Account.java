package PART_II_OOP.II_to_IV_banking;//For dateCreated. this class extends date

import java.text.SimpleDateFormat;

/**
 * PART_II_OOP.II_to_IV_banking.Account class
 *
 * @author 20CE155 ADNAN_VAHORA
 * Date : 8/19/2021
 */

public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    String pattern = "dd-mm-yyyy";
    //reference : http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
    SimpleDateFormat dateCreated = new SimpleDateFormat(pattern);

    //for default PART_II_OOP.II_to_IV_banking.Account
    Account() {
        id = 0;
        balance = 500;
        annualInterestRate = 7.0;
    }

    //PART_II_OOP.II_to_IV_banking.Account with specified I'd and balance;
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //Accessor and mutator methods for id, balance, annualInterestRate
    //getter
    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //setters
    void setId(int id) {
        this.id = id;
    }

    void setBalance(double balance) {
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
    double getMonthlyInterest() {
        return getAnnualInterestRate() * balance * .01;

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
    boolean withdraw(int deduct) {
        if(getBalance() <= 300){
            System.out.println(" Error: minimum balance limit reached");
            return true;
        }else {
            balance -= deduct;
            return false;
        }
    }


    //print PART_II_OOP.II_to_IV_banking.Account Info - used in PART_II_OOP.II_to_IV_banking.ATM class
    void printAccountInfo() {
        System.out.println("PART_II_OOP.II_to_IV_banking.Account id : " + id);
        System.out.println("PART_II_OOP.II_to_IV_banking.Account balance : " + balance);
    }
}
