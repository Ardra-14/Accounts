public class Savings extends user{
    private int Balance;
    @Override
    public void deposit() {
        super.deposit();
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
