package ATM;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 =
                new Account("1001", "Nikhil", "1433", 10000);

        Account account2 =
                new Account("1002", "rahul", "5678", 5000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        ATM atm = new ATM(bank);

        atm.start();
    }
}