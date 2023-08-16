package org.academiadecodigo.hackaton.services.javabank;

import org.academiadecodigo.hackaton.domain.javabank.Transfer;
import org.academiadecodigo.hackaton.exceptions.javabank.AccountNotFoundException;
import org.academiadecodigo.hackaton.exceptions.javabank.CustomerNotFoundException;
import org.academiadecodigo.hackaton.exceptions.javabank.TransactionInvalidException;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.Account;

/**
 * Common interface for transfer services, provides methods to perform account transfers
 */
public interface TransferService {

    /**
     * Performs a transfer between two {@link Account}
     *
     * @param transfer the transfer object
     * @throws AccountNotFoundException
     * @throws TransactionInvalidException
     */
    void transfer (Transfer transfer)
            throws AccountNotFoundException, TransactionInvalidException;

    /**
     * Performs a transfer between two {@link Account}, if possible
     *
     * @param transfer   the transfer object
     * @param customerId the customer id
     * @throws CustomerNotFoundException
     * @throws AccountNotFoundException
     * @throws TransactionInvalidException
     */
    void transfer (Transfer transfer, Integer customerId)
            throws CustomerNotFoundException, AccountNotFoundException, TransactionInvalidException;

}
