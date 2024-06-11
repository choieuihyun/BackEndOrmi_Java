package day6;

public class BankAccount {

    int accountNumber;
    String ownerName;
    int money;

    public BankAccount(int accountNumber, String ownerName) {

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

    }

    public void deposit(int amount) {
        money += amount;
    }

    public void withdraw(int amount) {
        money -= amount;
    }

}
