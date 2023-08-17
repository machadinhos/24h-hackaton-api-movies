package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.Seat;

public interface SeatService {

    Seat get(Integer id);

    void setOccupied(Integer id);

}
