package Streams;

public class Account {
    private String account;
    private long sum;
    private boolean isLocked;

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", sum=" + sum +
                ", isLocked=" + isLocked +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public Account(String account, int sum, boolean isLocked){
        this.account=account;
        this.sum = sum;
        this.isLocked=isLocked;


    }

    public String getNumber() {
        return account;
    }
    public long getBalance() {
        return sum;
    }
}
