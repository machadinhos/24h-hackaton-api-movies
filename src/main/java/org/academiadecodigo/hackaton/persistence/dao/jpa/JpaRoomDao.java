package org.academiadecodigo.hackaton.persistence.dao.jpa;

import org.academiadecodigo.hackaton.persistence.dao.RoomDao;
import org.academiadecodigo.hackaton.persistence.model.Room;
import org.springframework.stereotype.Repository;

@Repository
public class JpaRoomDao extends GenericJpaDao<Room> implements RoomDao {

    public JpaRoomDao () {

        super(Room.class);
    }

}
