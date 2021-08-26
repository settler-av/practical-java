public class SavingsAccount extends Account {
    final double annualInterestRate = 12;
    SavingsAccount(){
        super();
        setAnnualInterestRate(annualInterestRate);
    }
    void withdraw(int deduct){
        System.out.println("Money can't be withdrawn from Savings account.");
    }

    @Override
    public String toString() {
        super.toString();
        return "SavingsAccount{" +
                "annualInterestRate=" + annualInterestRate +
                '}';
    }
}
