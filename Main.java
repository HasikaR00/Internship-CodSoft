import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank(1500.00); // Initial balance set to 1500.00

        boolean t = false;
        while (!t) {
            System.out.println("ATM Machine");
            System.out.println("Choose your transaction.");
            System.out.println("1. Deposit.");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter in decimal\n Enter the amount for deposit:");
                    double depositAmount = sc.nextDouble();
                    b.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter in decimal\n Enter the amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    b.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your Balance:");
                    b.gb();
                    break;
                case 4:
                    t = true;
                    System.out.println("End of Transaction. Thank you for Banking with us!");
                    break;
                default:
                    System.out.println("Choose any one option from 1 to 4");
                    break;
            }
        }
        sc.close();
    }
}

// Class to do other transactions
class Bank extends ATM {
    public Bank(double inb) {
        super(inb);
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance > amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful");
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("Insufficient balance. Try withdrawing below " + balance);
            }
        } else {
            System.out.println("Transaction failed. Enter a positive number below " + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful");
            System.out.println("Total balance: " + balance);
        } else {
            System.out.println("Transaction failed.");
        }
    }

    public void gb() {
        System.out.println(balance);
    }
}

// Class to check balance
class ATM {
    protected double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
