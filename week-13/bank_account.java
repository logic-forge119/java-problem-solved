import java.util.Scanner;

class BankAccount {
    private int balance = 0;
    private boolean open = false;

    public synchronized void open() {
        open = true;
    }

    public synchronized void close() {
        open = false;
    }

    public synchronized void deposit(int amount) {
        if (open) {
            balance += amount;
        }
    }

    public synchronized void withdraw(int amount) {
        if (open && amount <= balance) {
            balance -= amount;
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        account.open();

        System.out.print("Enter deposit amount: ");
        int deposit = sc.nextInt();
        account.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();
        account.withdraw(withdraw);

        System.out.println("Balance: " + account.getBalance());

        account.close();

        sc.close();
    }
}
