package org.academiadecodigo.hackaton.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room extends AbstractModel {

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "room",
            fetch = FetchType.EAGER
    )
    private List<Session> sessions;


    public List<Session> getSessions () {

        return sessions;
    }


    public void setSessions (List<Session> sessions) {

        this.sessions = sessions;
    }

}
