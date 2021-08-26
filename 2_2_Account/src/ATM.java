/**
 * @author 20ce155_Adnan_vahora created on 19/8/2021
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


public class ATM {
    int userInput;
    Scanner scanAccount = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<Account>();

    //user login
    void userLogin() {
        System.out.println("Enter the Account Number : ");
        userInput = scanAccount.nextInt();
        validateInput(userInput, (short) 5);
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
     * @param sender money is deducted from his account
     * @param recipient money is credited to his account.
     */
    void moneyTransfer(Account sender, Account recipient){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter amount of money you want to transfer : ");
        int moneyTransfer = userInput.nextInt();
        sender.withdraw(moneyTransfer);
        recipient.deposits(moneyTransfer);
        /**
         * @// TODO: 25-08-2021 Add constrains like what if sender have not enough money
         */
        System.out.println("Transaction of +"+moneyTransfer+" INR has been successful.");
    }
}
