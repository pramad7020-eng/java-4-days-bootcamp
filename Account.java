class BankAccount {

    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Withdraw method
    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        // Create two accounts
        BankAccount acc1 = new BankAccount("Swathi", "101", 5000);
        BankAccount acc2 = new BankAccount("Anu", "102", 3000);

        // Deposit money
        acc1.deposit(2000);
        acc2.deposit(1000);

        // Withdraw money
        acc1.withdraw(1000);

        // Display updated details
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
