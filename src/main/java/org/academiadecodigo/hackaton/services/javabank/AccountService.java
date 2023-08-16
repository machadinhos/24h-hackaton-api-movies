package org.academiadecodigo.hackaton.services.javabank;

import org.academiadecodigo.hackaton.exceptions.javabank.AccountNotFoundException;
import org.academiadecodigo.hackaton.exceptions.javabank.CustomerNotFoundException;
import org.academiadecodigo.hackaton.exceptions.javabank.TransactionInvalidException;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.Account;

/**
 * Common interface for account services, provides methods to manage accounts and perform account transactions
 */
public interface AccountService {

    /**
     * Gets the account with the given id
     *
     * @param id the account id
     * @return the account
     */
    Account get (Integer id);

    /**
     * Performs an {@link Account} deposit
     *
     * @param id         the account id
     * @param customerId the customer id
     * @param amount     the amount to deposit
     * @throws AccountNotFoundException
     * @throws CustomerNotFoundException
     * @throws TransactionInvalidException
     */
    void deposit (Integer id, Integer customerId, double amount)
            throws AccountNotFoundException, CustomerNotFoundException, TransactionInvalidException;

    /**
     * Perform an {@link Account} withdrawal
     *
     * @param id         the account id
     * @param customerId the customer id
     * @param amount     the amount to withdraw
     * @throws AccountNotFoundException
     * @throws CustomerNotFoundException
     * @throws TransactionInvalidException
     */
    void withdraw (Integer id, Integer customerId, double amount)
            throws AccountNotFoundException, CustomerNotFoundException, TransactionInvalidException;

}
