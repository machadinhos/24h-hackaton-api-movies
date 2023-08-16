package org.academiadecodigo.hackaton.persistence.dao.jpa.javabank;

import org.academiadecodigo.hackaton.persistence.dao.javabank.RecipientDao;
import org.academiadecodigo.hackaton.persistence.model.javabank.Recipient;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link RecipientDao} implementation
 */
@Repository
public class JpaRecipientDao extends GenericJpaDao<Recipient> implements RecipientDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaRecipientDao () {

        super(Recipient.class);
    }

}
