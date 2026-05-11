package oops;
class BankAccount {

    // Private variables
    private String accountHolder;
    private double balance;

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }
}

public class OOP03_Encapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountHolder("Nishant");
        account.setBalance(5000);

        System.out.println(account.getAccountHolder());
        System.out.println(account.getBalance());
    }
}