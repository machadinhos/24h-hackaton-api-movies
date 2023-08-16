package org.academiadecodigo.hackaton.exceptions.javabank;

import org.academiadecodigo.hackaton.errors.javabank.ErrorMessage;

/**
 * Thrown to indicate that the customer was not found
 */
public class CustomerNotFoundException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public CustomerNotFoundException () {

        super(ErrorMessage.CUSTOMER_NOT_FOUND);
    }

}
