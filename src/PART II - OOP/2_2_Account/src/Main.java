import java.util.Scanner;

import static java.lang.System.exit;


/**
 * @author 20CE155_ADNAN_VAHORA on 20/8/2021
 */
public class Main {
    public static void main(String[] args) {
        ATM a1 = new ATM();
        int choice;
        Scanner userChoice = new Scanner(System.in);
        int accountNumber;
        for (accountNumber = 0; accountNumber < 10; accountNumber++) {
            a1.accounts.add(new Account(accountNumber + 1, 300));
        }
        a1.userLogin();


        do {
            System.out.println("\n`````````````````````````````````````````````````````\n" +
                    "1. Balance inquiry\n" +
                    "2. Withdraw money [Maintain minimum balance 300₹]\n" +
                    "3. Deposit money\n" +
                    "4. Money Transfer\n" +
                    "5. Create Account\n" +
                    "6. Deactivate Account\n" +
                    "7. Exit");
            System.out.print("\n`````````````````````````````````````````````````````\n" +
                    "Enter your choice : ");
            choice = userChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nCurrent Balance : " + a1.accounts.get(a1.userInput - 1).getBalance());
                    break;
                case 2:
                    System.out.print("\nAmount of money to withdraw :");
                    //You can't create variable inside switch in C++, But in java you can.
                    int moneyWithdraw = userChoice.nextInt();
                    if (a1.accounts.get(a1.userInput - 1).getBalance() - moneyWithdraw <= 300)
                        System.out.println("\n********Alert!********" +
                                "\nMinimum balance limit of account is 300INR " +
                                "\nYou can't withdraw money now."
                        );
                    else {
                        a1.accounts.get(a1.userInput - 1).withdraw(moneyWithdraw);
                        System.out.println(moneyWithdraw + "INR has been withdrawn from your account\nThank you");
                    }
                    break;
                case 3:
                    System.out.print("\nAmount of money to withdraw :");
                    int moneyDeposit = userChoice.nextInt();
                    if (moneyDeposit > 0) {
                        a1.accounts.get(a1.userInput - 1).deposits(moneyDeposit);
                        System.out.println("Transaction successful " +
                                "\n" + moneyDeposit + "INR deposited to your account");
                    } else if (moneyDeposit == 0)
                        System.out.println("You can't deposit 0 INR");
                    else if (moneyDeposit < 0) {
                        System.out.println("Negative money input not allowed");
                    }
                case 4:
                    //MONEY transfer
                    System.out.println("Enter the account number of recipient : ");
                    int recipientID = userChoice.nextInt();
                    a1.moneyTransfer(a1.accounts.get(a1.userInput -1),a1.accounts.get(recipientID-1));

                case 5:
                    // Create Account
                    a1.accounts.add(new Account(accountNumber,300));
                    System.out.println("Your account number is "+ accountNumber +" current balance 300");
                    accountNumber++;

                case 6:
                    //deactivate Account
                    System.out.println("Enter the account you want to remove : ");
                    int remAccount = userChoice.nextInt();
                    a1.accounts.remove(remAccount);
                case 7:
                    //Exit
                    exit(0);
                default:
                    //Or we can use validate data function here
                    System.out.println("Incorrect input");
            }
        } while (choice != 7);

    }
}
