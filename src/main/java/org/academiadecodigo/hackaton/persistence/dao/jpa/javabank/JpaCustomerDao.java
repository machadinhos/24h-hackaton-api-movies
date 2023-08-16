package org.academiadecodigo.hackaton.persistence.dao.jpa.javabank;

import org.academiadecodigo.hackaton.persistence.dao.javabank.CustomerDao;
import org.academiadecodigo.hackaton.persistence.model.javabank.Customer;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link CustomerDao} implementation
 */
@Repository
public class JpaCustomerDao extends GenericJpaDao<Customer> implements CustomerDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaCustomerDao () {

        super(Customer.class);
    }

}
