package PART_II_OOP.II_to_IV_banking;

/**
 * @author 20CE155 Adnan vahora
 */
public class savingAccount extends Account {
    //    A saving account does have an overdraft facility

    @Override
    boolean withdraw(int deduct) {
        if (getBalance() <= 300) {
            System.out.println(" Error: minimum balance limit reached,\nThe savings account can not have overdraft linit.");
            return true;
        } else {
            super.balance -= deduct;
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
