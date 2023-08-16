package org.academiadecodigo.hackaton.exceptions.javabank;

import org.academiadecodigo.hackaton.errors.javabank.ErrorMessage;

/**
 * Thrown to indicate that an association still exists
 */
public class AssociationExistsException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public AssociationExistsException () {

        super(ErrorMessage.ASSOCIATION_EXISTS);
    }

}
