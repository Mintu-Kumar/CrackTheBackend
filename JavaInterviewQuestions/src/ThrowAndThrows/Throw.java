package ThrowAndThrows;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // Explicitly throwing an exception
            throw new InsufficientBalanceException("Not Sufficient Balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        }
    }
}


public class Throw {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000); // Trying to withdraw more than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }


    }
}

