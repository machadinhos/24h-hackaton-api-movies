package org.academiadecodigo.hackaton.exceptions.javabank;

import org.academiadecodigo.hackaton.errors.javabank.ErrorMessage;

/**
 * Thrown to indicate that the transaction was not valid
 */
public class TransactionInvalidException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public TransactionInvalidException () {

        super(ErrorMessage.TRANSACTION_INVALID);
    }

}
