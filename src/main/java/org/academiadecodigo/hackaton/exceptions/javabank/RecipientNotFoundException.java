package org.academiadecodigo.hackaton.exceptions.javabank;

import org.academiadecodigo.hackaton.errors.javabank.ErrorMessage;

/**
 * Thrown to indicate that the recipient was not found
 */
public class RecipientNotFoundException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public RecipientNotFoundException () {

        super(ErrorMessage.RECIPIENT_NOT_FOUND);
    }

}
