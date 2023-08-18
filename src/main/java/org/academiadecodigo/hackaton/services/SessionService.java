package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.academiadecodigo.hackaton.persistence.model.Session;

import java.util.List;

public interface SessionService {

    Session get (Integer id);

    void setOccupied (Integer id);

    List<Seat> getSeats (Integer id);

    List<Session> getByMovieId (Integer id);

}
