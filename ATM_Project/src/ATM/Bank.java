package ATM;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String userId, String pin) {

        for (Account account : accounts) {

            if (account.getUserId().equals(userId)
                    && account.getPin().equals(pin)) {

                return account;
            }
        }

        return null;
    }

    public Account findAccountById(String accountId) {

        for (Account account : accounts) {

            if (account.getAccountId().equals(accountId)) {
                return account;
            }
        }

        return null;
    }
}