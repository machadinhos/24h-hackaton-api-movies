package org.academiadecodigo.hackaton.persistence.dao.jpa.javabank;

import org.academiadecodigo.hackaton.persistence.dao.javabank.AccountDao;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.Account;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link AccountDao} implementation
 */
@Repository
public class JpaAccountDao extends GenericJpaDao<Account> implements AccountDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaAccountDao () {

        super(Account.class);
    }

}
