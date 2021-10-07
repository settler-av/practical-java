public class checkingAccount extends Account {
    double overdraftLimit = 10000;

    @Override
    boolean withdraw(int deduct) {
            if (getBalance() <= 300) {
                System.out.println(" Error: minimum balance limit reached make minimum bal 300INR to use overdraft limit");
                return true;
            } else {
                if ((getBalance() - deduct) >= 300) {
                    balance -= deduct;
                } else if ((getBalance() - deduct) < 300 && (overdraftLimit - deduct) > 0) {
                    overdraftLimit -= deduct;
                } else if ((getBalance() + overdraftLimit - deduct - 300) > 0) {
                    double intermediateDeduct = 0;
                    intermediateDeduct = balance - 300;
                    balance = 300;
                    overdraftLimit -= deduct - intermediateDeduct;
                }
                return false;
            }

    }

    @Override
    public String toString() {
        return super.toString() + "checkingAccount{" +
               "overdraftLimit=" + overdraftLimit +
               '}';
    }
}
