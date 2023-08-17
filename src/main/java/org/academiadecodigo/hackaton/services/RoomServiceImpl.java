package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.RoomDao;
import org.academiadecodigo.hackaton.persistence.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    private RoomDao roomDao;


    @Autowired
    public void setRoomDao (RoomDao roomDao) {

        this.roomDao = roomDao;
    }


    @Override
    public Room get (Integer id) {

        return roomDao.findById(id);
    }

}
