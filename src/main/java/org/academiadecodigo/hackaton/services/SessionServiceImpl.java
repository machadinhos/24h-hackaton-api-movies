package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.SessionDao;
import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.academiadecodigo.hackaton.persistence.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class SessionServiceImpl implements SessionService {

    private SessionDao sessionDao;


    @Autowired
    public void setSessionDao (SessionDao sessionDao) {

        this.sessionDao = sessionDao;
    }


    @Transactional(readOnly = true)
    @Override
    public Session get (Integer id) {

        return sessionDao.findById(id);
    }


    @Transactional
    @Override
    public void setOccupied (Integer id) {

        Session session = sessionDao.findById(id);

        session.setAvailable(true);

        sessionDao.saveOrUpdate(session);
    }


    @Transactional(readOnly = true)
    @Override
    public List<Seat> getSeats (Integer id) {

        return sessionDao.findById(id).getSeats();
    }


    @Override
    public List<Session> getByMovieId (Integer id) {

        List<Session> sessions = sessionDao.findAll();

        sessions.removeIf(session -> !Objects.equals(session.getMovie().getId(), id));

        return sessions;
    }

}
