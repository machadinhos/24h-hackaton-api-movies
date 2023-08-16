package org.academiadecodigo.hackaton.services.javabank;

import org.academiadecodigo.hackaton.persistence.dao.javabank.RecipientDao;
import org.academiadecodigo.hackaton.persistence.model.javabank.Recipient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A {@link RecipientService} implementation
 */
@Service
public class RecipientServiceImpl implements RecipientService {

    private RecipientDao recipientDao;


    /**
     * Sets the recipient data access object
     *
     * @param recipientDao the recipient DAO to set
     */
    @Autowired
    public void setRecipientDao (RecipientDao recipientDao) {

        this.recipientDao = recipientDao;
    }


    /**
     * @see RecipientService#get(Integer)
     */
    @Override
    public Recipient get (Integer id) {

        return recipientDao.findById(id);
    }

}
