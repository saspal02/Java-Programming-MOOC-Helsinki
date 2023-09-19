public class Debt {
    private double balance;
    private double InterestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.InterestRate = initialInterestRate;

    }
    public void printBalance() {
        System.out.println(balance);
    }
    public void waitOneYear() {
        balance = balance*InterestRate;
    }
}

