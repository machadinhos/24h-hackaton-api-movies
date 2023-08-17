package org.academiadecodigo.hackaton.persistence.dao.jpa;

import org.academiadecodigo.hackaton.persistence.dao.SessionDao;
import org.academiadecodigo.hackaton.persistence.model.Session;

public class JpaSessionDao extends GenericJpaDao<Session> implements SessionDao {

    public JpaSessionDao () {

        super(Session.class);
    }

}
