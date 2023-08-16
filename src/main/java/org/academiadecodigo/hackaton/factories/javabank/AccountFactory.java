package org.academiadecodigo.hackaton.factories.javabank;

import org.academiadecodigo.hackaton.errors.javabank.ErrorMessage;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.Account;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.AccountType;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.CheckingAccount;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.SavingsAccount;
import org.springframework.stereotype.Component;

/**
 * A factory for creating accounts of different types
 */
@Component
public class AccountFactory {

    /**
     * Creates a new {@link Account}
     *
     * @param accountType the account type
     * @return the new account
     */
    public Account createAccount (AccountType accountType) {

        Account newAccount;

        switch (accountType) {
            case CHECKING:
                newAccount = new CheckingAccount();
                break;
            case SAVINGS:
                newAccount = new SavingsAccount();
                break;
            default:
                throw new IllegalArgumentException(ErrorMessage.TRANSACTION_INVALID);
        }

        return newAccount;
    }

}
