package org.academiadecodigo.hackaton.exceptions.javabank;

import org.academiadecodigo.hackaton.errors.javabank.ErrorMessage;

/**
 * Thrown to indicate that the account was not found
 */
public class AccountNotFoundException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public AccountNotFoundException () {

        super(ErrorMessage.ACCOUNT_NOT_FOUND);
    }

}
