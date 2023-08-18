package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.SeatDao;
import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeatServiceImpl implements SeatService {

    private SeatDao seatDao;


    @Autowired
    public void setSeatDao (SeatDao seatDao) {

        this.seatDao = seatDao;
    }


    @Transactional(readOnly = true)
    @Override
    public Seat get (Integer id) {

        return seatDao.findById(id);
    }


    @Transactional
    @Override
    public void setOccupied (Integer id) {

        Seat seat = seatDao.findById(id);

        seat.setAvailable(false);

        seatDao.saveOrUpdate(seat);
    }

}
