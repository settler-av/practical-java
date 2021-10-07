import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * @author 20ce155_Adnan_vahora
 */
public class ATM {
    int userInput;
    Scanner scanAccount = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<Account>();
    int accountNumber;

    void runATM() {
        //ATM  = new ATM();
        int choice;

        Scanner userChoice = new Scanner(System.in);

        for (accountNumber = 0; accountNumber < 10; accountNumber++)
            accounts.add(new Account(accountNumber + 1, 300));

        userLogin();


        do {
            System.out.println("\n`````````````````````````````````````````````````````\n" +
                               "1. Balance inquiry\n" +
                               "2. Withdraw money [Maintain minimum balance 300₹]\n" +
                               "3. Deposit money\n" +
                               "4. Money Transfer\n" +
                               "5. Create Account\n" +
                               "6. Deactivate Account\n" +
                               "7. logout");
            System.out.print("\n`````````````````````````````````````````````````````\n" +
                             "Enter your choice : ");
            choice = userChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nCurrent Balance : " + accounts.get(userInput - 1).getBalance());
                    break;
                case 2:
                    System.out.print("\nAmount of money to withdraw :");
                    //You can't create variable inside switch in C++, But in java you can.
                    int moneyWithdraw = userChoice.nextInt();
                    if (accounts.get(userInput - 1).getBalance() - moneyWithdraw <= 300)
                        System.out.println("\n********Alert!********" +
                                           "\nMinimum balance limit of account is 300INR " +
                                           "\nYou can't withdraw money now."
                        );
                    else {
                        accounts.get(userInput - 1).withdraw(moneyWithdraw);
                        System.out.println(moneyWithdraw + "INR has been withdrawn from your account\nThank you");
                    }
                    break;
                case 3:
                    System.out.print("\nAmount of money to withdraw :");
                    int moneyDeposit = userChoice.nextInt();
                    if (moneyDeposit > 0) {
                        accounts.get(userInput - 1).deposits(moneyDeposit);
                        System.out.println("Transaction successful " +
                                           "\n" + moneyDeposit + "INR deposited to your account");
                    } else if (moneyDeposit == 0)
                        System.out.println("You can't deposit 0 INR");
                    else {
                        System.out.println("Negative money input not allowed");
                    }
                    break;
                case 4:
                    //MONEY transfer
                    System.out.println("Enter the account number of recipient : ");
                    int recipientID = userChoice.nextInt();
                    moneyTransfer(accounts.get(userInput - 1), accounts.get(recipientID - 1));

                    break;
                case 5:
                    createAccount();

                    break;
                case 6:
                    //deactivate Account
                    System.out.println("Are you sure you want to deactivate the curent account?(0|1) : ");
                    int remAccount = userChoice.nextInt();
                    if (remAccount == 1) {
                        System.out.println("Your current logged in account " + userInput + " has been removed\n\n");
                        exitLoginPortal();
                    }
                    accounts.remove(remAccount);
                    break;
                case 7:
                    exitLoginPortal();
                    break;
                default:
                    //Or we can use validate data function here
                    System.out.println("Incorrect input");
            }
        } while (true);
    }

    void createAccount() {
        // Create Account
        accounts.add(new Account(accountNumber, 300));
        System.out.println("Your account number is " + accountNumber + " current balance 300");
        accountNumber++;
    }

    void exitLoginPortal() {
        int subChoice;
        Scanner userChoice = new Scanner(System.in);
        //``````````````````````````````````````
        //press 1: to login into another account
        //press 2: to exit
        //``````````````````````````````````````
        System.out.println("``````````````````````````````````````\n"
                           + "press 1: to login into another account\n"
                           + "press 0 or any: to exit\n"
                           + "--Do you want to login to another account(1|0):"
                           + "\n``````````````````````````````````````\n"
        );
        subChoice = userChoice.nextInt();
        if (subChoice == 1) {
            userLogin();
        } else {
            exit(0);
        }
    }

    //user login
    void userLogin() {
        int userChoice;
        System.out.print("1: login | 2: create account\nYour choice: ");
        userChoice = scanAccount.nextInt();
        if (userChoice == 1) {
            //login process
            System.out.println("Enter the Account Number : ");
            userInput = scanAccount.nextInt();
            validateInput(userInput, (short) 5);
        } else if (userChoice == 2) {
            //new account creation
            createAccount();
        }
        else {
            System.out.println("Error: Input unidentified, Program will terminate now");
        }

    }

    /**
     * checks if user have given correct input
     * if yes, then will show the account details
     * else asks' renter the ID from user recursively (Maximum 5 attempts)
     *
     * @param userInput Id entered by user
     * @param attempts  counts number of attempts taken by user
     */
    void validateInput(int userInput, short attempts) {
        if (userInput > 0 && userInput < 11) {
            System.out.println("``````User detected````````");
            accounts.get(userInput - 1).printAccountInfo();
        } else {
            if (attempts == 0) {
                System.out.println("Attempts limit exceeded, program will exit now");
                exit(0);
            }
            System.out.print("You have entered wrong account Number. \nDo you want to enter again? (Y/N) : ");

            //there is no nextChar() method in scanner class
            String renterAccNumChoice = scanAccount.next();
            char result = renterAccNumChoice.charAt(0);

            if (result == 'Y') {
                System.out.println("Enter the Account Number (" + attempts + "try left): ");
                this.userInput = scanAccount.nextInt();
                validateInput(userInput, (short) (attempts - 1));
            } else {
                System.out.println("The program will exit now.");
                exit(0);
            }
        }
    }

    /**
     * Transfers money from sender to recipient.
     *
     * @param sender    money is deducted from his account
     * @param recipient money is credited to his account.
     */
    void moneyTransfer(Account sender, Account recipient) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter amount of money you want to transfer : ");
        int moneyTransfer = userInput.nextInt();
        if (sender.withdraw(moneyTransfer)) {
            System.out.println("Money Transfer denied");
        } else {
            recipient.deposits(moneyTransfer);
            System.out.println("Transaction of +" + moneyTransfer + " INR has been successful.");
        }
    }
}
