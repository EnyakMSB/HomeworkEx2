public class BrdBank implements AccountInterface {
    double deposits;
    double withdrawals;

    @Override
    public double getBalance() {
        return deposits - withdrawals;
    }

    @Override
    public void deposit(double amount) {
        deposits += amount;
    }

    @Override
    public void withdraw(double amount) {
        withdrawals += amount;
    }
}
